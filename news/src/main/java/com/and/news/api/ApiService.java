package com.and.news.api;

import com.and.common.api.ApiConstant;
import com.and.news.bean.entity.Channel;
import com.and.news.bean.entity.PubInfo;
import com.and.news.bean.request.ReqId;
import com.and.news.bean.request.comment.ReqCommentAdd;
import com.and.news.bean.request.comment.ReqCommentReply;
import com.and.news.bean.request.favorite.ReqDropFavorites;
import com.and.news.bean.request.favorite.ReqFavorite;
import com.and.news.bean.request.follow.ReqFollowBody;
import com.and.news.bean.request.life.ReqLifeCreate;
import com.and.news.bean.request.life.ReqLifePostUpdate;
import com.and.news.bean.request.life.ReqPostId;
import com.and.news.bean.request.order.ReqOrderCreateBean;
import com.and.news.bean.request.order.ReqOrderPayBean;
import com.and.news.bean.request.order.ReqRating;
import com.and.news.bean.request.report.ReqComplain;
import com.and.news.bean.request.user.BindDeviceReq;
import com.and.news.bean.request.user.ChangePwdReq;
import com.and.news.bean.request.user.ForgetPwdReq;
import com.and.news.bean.request.user.LoginFromMobileReq;
import com.and.news.bean.request.user.LoginFromQQReq;
import com.and.news.bean.request.user.LoginFromTokenReq;
import com.and.news.bean.request.user.LoginFromTwitterReq;
import com.and.news.bean.request.user.LoginFromWeChatReq;
import com.and.news.bean.request.user.LoginFromWeiboReq;
import com.and.news.bean.request.user.ReqBindMobile;
import com.and.news.bean.request.user.SignUpWithCodeReq;
import com.and.news.bean.request.user.UpdateUserChannelReq;
import com.and.news.bean.request.user.UpdateUserInfoReq;
import com.and.news.bean.response.AppVersion;
import com.and.news.bean.response.RespOssToken;
import com.and.news.bean.response.bible.RespBibleChapter;
import com.and.news.bean.response.bible.RespBibleVolume;
import com.and.news.bean.response.carousel.RespCarousel;
import com.and.news.bean.response.channel.RespChannelList;
import com.and.news.bean.response.comment.RespCommentList;
import com.and.news.bean.response.comment.RespMyCommentList;
import com.and.news.bean.response.comment.RespMyReplyList;
import com.and.news.bean.response.favorite.RespFavoriteList;
import com.and.news.bean.response.follow.RespMyFollowList;
import com.and.news.bean.response.follow.RespRecommendFollowList;
import com.and.news.bean.response.life.RespLifeCarousel;
import com.and.news.bean.response.life.RespLifePostAndProductList;
import com.and.news.bean.response.life.RespLifePostList;
import com.and.news.bean.response.life.RespLifePostSearchList;
import com.and.news.bean.response.life.RespMyPostList;
import com.and.news.bean.response.life.RespPostDetail;
import com.and.news.bean.response.loading.RespLoading;
import com.and.news.bean.response.merchant.MerchantInfoBean;
import com.and.news.bean.response.merchant.RespMerchantProductList;
import com.and.news.bean.response.news.RespNewsDetail;
import com.and.news.bean.response.news.RespNewsList;
import com.and.news.bean.response.news.RespSearchNewsBean;
import com.and.news.bean.response.order.RespCheckOrderStatus;
import com.and.news.bean.response.order.RespOrderCreateBean;
import com.and.news.bean.response.order.RespOrderInfo;
import com.and.news.bean.response.order.RespOrderList;
import com.and.news.bean.response.product.RespProductDetail;
import com.and.news.bean.response.product.RespProductList;
import com.and.news.bean.response.user.RespAuthorInfo;
import com.and.news.bean.response.user.RespAutoLogin;
import com.and.news.bean.response.user.RespBoolean;
import com.and.news.bean.response.user.RespLogin;
import com.and.news.bean.response.user.RespUserInfo;

import org.json.JSONObject;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by ydx on 16-12-29.
 */
public interface ApiService {

    @Streaming
    @GET
    Observable<ResponseBody> downloadFile(@Url String fileUrl, @Header("RANGE") String range);

//    ==================================== splash ad ==================================
    @GET(ApiConstant.LOADING_LOGO_AD)
    Observable<RespLoading> loadingSplashAd();
    @GET(ApiConstant.LOADING_AD)
    Observable<RespLoading> loadingAd();
    //========================================user===============================================
    /* 绑定设备 */
    @POST(ApiConstant.USER_BIND_DEVICE)
    Observable<RespBoolean> bindDevice(@Header("x-auth-token") String token, @Body BindDeviceReq bindDeviceReq);
    /* 修改密码 */
    @POST(ApiConstant.USER_CHANGE_PWD)
    Observable<RespBoolean> changePwd(@Header("x-auth-token") String token, @Body ChangePwdReq changePwdReq);
    /* 验证手机号是否已存在 */
    @GET(ApiConstant.USER_CHECK_MOBILE)
    Observable<RespBoolean> checkMobile(@Query("mobile") String mobile);
    /* 检查手机号是否已注册 并发送验证码*/
    @GET(ApiConstant.USER_CHECK_MOBILE_AND_SENT_CODE)
    Observable<RespBoolean> checkMobileAndSentCode(@Query("mobile") String mobile);
    /* 检查用户名是否已存在 */
    @GET(ApiConstant.USER_CHECK_USERNAME)
    Observable<RespBoolean> checkUsername(@Query("username") String username);
    /* 忘记密码 修改密码 */
    @POST(ApiConstant.USER_FORGET_PWD_CHANGE_PWD)
    Observable<RespBoolean> forgetPwdChangePwd(@Body ForgetPwdReq forgetPwdReq);
    /* 忘记密码 验证用户并发送验证码 */
    @GET(ApiConstant.USER_FORGET_PWD_SENT_CHECK_CODE)
    Observable<RespBoolean> forgetPwdValidMobileAndSendCode(@Query("mobile") String mobile);
    /* 获取用户信息 */
    @GET(ApiConstant.USER_INFO)
    Observable<RespUserInfo> getUserInfo(@Header("x-auth-token") String token);
    @GET(ApiConstant.AUTHOR_INFO)
    Observable<RespAuthorInfo> getAuthorInfo(@Query("authorId") String authorId);
    /* 用户登录 */
    @POST(ApiConstant.USER_LOGIN)
    Observable<RespLogin> login(@Body LoginFromMobileReq loginFromMobileReq);
    /* qq登录 */
    @POST(ApiConstant.USER_LOGIN_WITH_QQ)
    Observable<RespLogin> loginFromQQ(@Body LoginFromQQReq qqReq);
    /* WeChat登录 */
    @POST(ApiConstant.USER_LOGIN_WITH_WECHAT)
    Observable<RespLogin> loginFromWeChat(@Body LoginFromWeChatReq weChatReq);
    /* Weibo登录 */
    @POST(ApiConstant.USER_LOGIN_WITH_WEIBO)
    Observable<RespLogin> loginFromWeibo(@Body LoginFromWeiboReq weiboReq);
    /* Twitter登录 */
    @POST(ApiConstant.USER_LOGIN_WITH_TWITTER)
    Observable<RespLogin> loginFromTwitter(@Body LoginFromTwitterReq twitterReq);
    /* 用户 注销登陆 */
    @GET(ApiConstant.USER_LOGOUT)
    Observable<RespBoolean> logout(@Header("X-auth-token") String token);
    /* 发送验证码 */
    @GET(ApiConstant.USER_SENT_CODE)
    Observable<RespBoolean> userSendCode(@Query("mobile") String mobile);
    /* 注册 并发送验证码 */
    @POST(ApiConstant.USER_SIGN_UP_WITH_CODE)
    Observable<RespLogin> userSignUpWithCode(@Body SignUpWithCodeReq signUpWithCodeReq);
    /* 检查 token */
    @POST(ApiConstant.USER_AUTO_LOGIN)
    Observable<RespAutoLogin> userAutoLogin(@Header("x-auth-token") String token, @Body LoginFromTokenReq loginFromTokenReq);
    /* 更新用户频道 */
    @POST(ApiConstant.USER_UPDATE_USER_CHANNEL)
    Observable<RespBoolean> userUpdateUserChannel(@Header("x-auth-token") String token, @Body UpdateUserChannelReq updateUserChannelReq);
    /* 更新用户信息 */
    @POST(ApiConstant.USER_UPDATE_INFO)
    Observable<RespUserInfo> updateUserInfo(@Header("x-auth-token") String token, @Body UpdateUserInfoReq updateUserInfoReq);
    /* 获取用户频道 */
    @GET(ApiConstant.USER_CHANNEL)
    Observable<List<Channel>> getUserChannels(@Header("x-auth-token") String token);
    /* 三方用户绑定手机号 */
    @POST(ApiConstant.USER_BIND_MOBILE)
    Observable<RespBoolean> bindMobile(@Header("x-auth-token") String token, @Body ReqBindMobile reqBindMobile);
    //========================================app version===========================================

    /* 版本控制 */
    @GET(ApiConstant.APP_VERSION_CHECK)
    Observable<AppVersion> checkAppVersion(@Query("device") String device, @Query("version") String version);

    //======================================== oss  ==================================================
    /* 获取oss secret and sts token */
    @GET(ApiConstant.OSS_GET_TOKEN)
    Observable<RespOssToken> getOssToken(@Header("x-auth-token") String token);

//    ========================================== news controller =======================================
    @GET(ApiConstant.NEWS_DETAIL_WITH_AD)
    Observable<RespNewsDetail> getNewsWithAD(@Header("x-auth-token") String token, @Query("id") String newsId);
    @GET(ApiConstant.NEWS_DETAIL_WITH_AD)
    Observable<RespNewsDetail> getNewsWithAD(@Query("id") String newsId);
    @GET(ApiConstant.NEWS_GET)
    Observable<RespNewsDetail> getNews(@Header("x-auth-token") String token, @Query("id") String newsId);
    @GET(ApiConstant.NEWS_GET)
    Observable<RespNewsDetail> getNews(@Query("id") String newsId);
    @GET(ApiConstant.NEWS_LIST_WITH_AD)
    Observable<RespNewsList> getNewsListWithAd(@Query("channelId") String channelId, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.NEWS_GET_BY_AUTHOR_ID)
    Observable<RespNewsList> getNewsList(@Query("channelId") String channelId, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.NEWS_GET_BY_AUTHOR_ID)
    Observable<RespNewsList> getNewsListByAuthorId(@Query("authorId") String authorId, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.NEWS_RECOMMEND)
    Observable<RespNewsList> getNewsRecommend(@Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.NEWS_LIST_BY_FOLLOW)
    Observable<RespNewsList> getNewsListByPubId(@Query("pubId") String pubId, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.NEWS_LIKE)
    Observable<RespBoolean> likeNews(@Query("newsId") String newsId);
    @GET(ApiConstant.NEWS_SEARCH)
    Observable<RespSearchNewsBean> searchNews(@Query("q") String query, @Query("page") int page, @Query("size") int size);
//    ============================================= channel controller ==================================

    @GET(ApiConstant.CHANNEL_GET_GUEST_CHANNEL_LIST)
    Observable<RespChannelList> getGuestChannelList();

    @GET(ApiConstant.CHANNEL_GET_USER_CHANNEL_LIST)
    Observable<RespChannelList> getUserChannelList(@Header("X-auth-token") String token);

//    ================================================ carousel ===========================================
    @GET(ApiConstant.CAROUSEL_GET_LIST)
    Observable<RespCarousel> getCarousel(@Query("channelId") String channelId);

//    =============================================== favorite ===============================================

    @POST(ApiConstant.FAVORITE_ADD)
    Observable<RespBoolean> addFavorite(@Header("x-auth-token") String token, @Body ReqFavorite reqFavorite);

    @GET(ApiConstant.FAVORITE_CHECK)
    Observable<RespBoolean> checkFavorite(@Header("x-auth-token") String token, @Query("referenceId") String referenceId, @Query("referenceType") String referenceType);

    @GET(ApiConstant.FAVORITE_LIST)
    Observable<RespFavoriteList> getFavoriteList(@Header("x-auth-token") String token);

    @POST(ApiConstant.FAVORITE_REMOVE)
    Observable<RespBoolean> removeFavorite(@Header("x-auth-token") String token, @Body ReqFavorite reqFavorite);

    @POST(ApiConstant.FAVORITE_REMOVE_LIST)
    Observable<RespBoolean> removeFavoriteList(@Header("x-auth-token") String token, @Body ReqDropFavorites reqDropFavorites);

//    ================================================ comment ==================================================

    @POST(ApiConstant.COMMENT_ADD)
    Observable<RespBoolean> commentAdd(@Header("x-auth-token") String token, @Body ReqCommentAdd commentAdd);

    @GET(ApiConstant.COMMENT_LIKE)
    Observable<RespBoolean> commentLike(@Query("commentId") String commentId);

    @GET(ApiConstant.COMMENT_LIST)
    Observable<RespCommentList> getCommentList(@Query("topicId") String topicId, @Query("topicType") String topicType, @Query("page") int page, @Query("size") int size);

    @GET(ApiConstant.COMMENT_LIST_HOT)
    Observable<RespCommentList> getHotCommentList(@Query("topicId") String topicId, @Query("topicType") String topicType);

    @GET(ApiConstant.COMMENT_LIST_RECENT)
    Observable<RespCommentList> getRecentCommentList(@Query("topicId") String topicId, @Query("topicType") String topicType, @Query("page") int page, @Query("size") int size);

    @POST(ApiConstant.COMMENT_REPLY)
    Observable<RespBoolean> commentReply(@Header("x-auth-token") String token, @Body ReqCommentReply reqCommentReply);

    @GET(ApiConstant.COMMENT_MY_NEWS_REPLY)
    Observable<RespMyReplyList> getMyNewsReplyList(@Header("x-auth-token") String token, @Query("page") int page, @Query("size") int size);

    @GET(ApiConstant.COMMENT_MY_NEWS_COMMENT)
    Observable<RespMyCommentList> getMyNewsCommentList(@Header("x-auth-token") String token, @Query("page") int page, @Query("size") int size);
    /* life post my reply */
    @GET(ApiConstant.COMMENT_MY_POST_REPLY)
    Observable<RespMyReplyList> getMyPostReplyList(@Header("x-auth-token") String token, @Query("page") int page, @Query("size") int size);

    @GET(ApiConstant.COMMENT_MY_POST_COMMENT)
    Observable<RespMyCommentList> getMyPostCommentList(@Header("x-auth-token") String token, @Query("page") int page, @Query("size") int size);

//    ==================================================== bible =====================================================
    @GET(ApiConstant.BIBLE_VOLUME_LIST)
    Observable<RespBibleVolume> getBibleVolumeList();

    @GET(ApiConstant.BIBLE_CHAPTER_LIST)
    Observable<RespBibleChapter> getBibleChapter(@Query("newOrOld") boolean newOrOld, @Query("volumeSN") int volumeSN, @Query("chapterSN") int chapterSN);
//    ====================================================== pub ==========================================================
    @GET(ApiConstant.PUB_INFO)
    Observable<PubInfo> getPubInfo(@Query("id") String pubId);
    @GET(ApiConstant.PUB_LIST_PUB_AND_TOP_NEWS)
    Observable<RespMyFollowList> getMyFollowList(@Header("x-auth-token") String token, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.PUB_RECOMMEND)
    Observable<RespRecommendFollowList> getRecommendPubUserList(@Header("x-auth-token") String token, @Query("page") int page, @Query("size") int size);

//    ========================================================= follow ============================================================
    @POST(ApiConstant.FOLLOW_ADD)
    Observable<RespBoolean> followAdd(@Header("x-auth-token") String token, @Body ReqFollowBody reqFollowBody);
    @POST(ApiConstant.FOLLOW_REMOVE)
    Observable<RespBoolean> followRemove(@Header("x-auth-token") String token, @Body ReqFollowBody reqFollowBody);
    @GET(ApiConstant.FOLLOW_CHECK)
    Observable<RespBoolean> followCheck(@Header("x-auth-token") String token, @Query("followUserId") String followUserId);
//    @GET(ApiConstant.FOLLOW_LIST)
//    Observable<RespMyFollowList> followList(@Header("x-auth-token")String token);

//    =========================================life =================================================
    @GET(ApiConstant.LIFE_POST_CAROUSEL)
    Observable<RespLifeCarousel> lifeCarousel();
    @POST(ApiConstant.LIFE_POST_CREATE)
    Observable<RespBoolean> lifeCreate(@Header("x-auth-token") String token, @Body ReqLifeCreate reqLifeCreate);
    @GET(ApiConstant.LIFE_POST_LIST)
    Observable<RespLifePostList> lifePostList(@Query("country") String country, @Query("city") String city, @Query("category") String category, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.LIFE_POST_MERCHANT_RECENT_LIST)
    Observable<RespLifePostList> merchantRecentPostList(@Query("merchantId") String merchantId, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.LIFE_POST_AND_PRODUCT_LIST)
    Observable<RespLifePostAndProductList> lifePostAndProductList(@Query("country") String country, @Query("city") String city, @Query("category") String category, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.LIFE_POST_DETAIL)
    Observable<RespPostDetail> lifePostDetail(@Header("x-auth-token") String token, @Query("id") String id);
    @GET(ApiConstant.LIFE_POST_SEARCH)
    Observable<RespLifePostSearchList> searchLifePost(@Query("q") String q, @Query("category") String category, @Query("cityName") String cityName, @Query("countryName") String countryName, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.LIFE_LIKE)
    Observable<RespBoolean> lifeLike(@Query("postId") String postId);
    @POST(ApiConstant.LIFE_POST_OFFLINE)
    Observable<RespBoolean> offlinePost(@Header("x-auth-token") String token, @Body ReqPostId reqPostId);
    @POST(ApiConstant.LIFE_POST_ONLINE)
    Observable<RespBoolean> onlinePost(@Header("x-auth-token") String token, @Body ReqPostId reqPostId);
    @POST(ApiConstant.LIFE_POST_DELETE)
    Observable<RespBoolean> deletePost(@Header("x-auth-token") String token, @Body ReqPostId reqPostId);
    @POST(ApiConstant.LIFE_POST_UPDATE)
    Observable<RespBoolean> updatePost(@Header("x-auth-token") String token, @Body ReqLifePostUpdate reqLifePostUpdate);
    @GET(ApiConstant.LIFE_POST_MY_ONLINE)
    Observable<RespMyPostList> myOnlinePostList(@Header("x-auth-token") String token, @Query("page") int page, @Query("size") int size);
    @GET(ApiConstant.LIFE_POST_MY_OffLINE)
    Observable<RespMyPostList> myOfflinePostList(@Header("x-auth-token") String token, @Query("page") int page, @Query("size") int size);

//====================================================    post  ========================================================
    @POST(ApiConstant.COMPLAIN)
    Observable<RespBoolean> complain(@Header("x-auth-token") String token, @Body ReqComplain reqComplain);

    //===================================== product ===================================

    @GET(ApiConstant.PRODUCT_LIST)
    Observable<RespProductList> productList(@Query("city") String city, @Query("country") String country, @Query("page") int page, @Query("size") int size);

    @GET(ApiConstant.PRODUCT_DETAIL)
    Observable<RespProductDetail> productDetail(@Query("id") String id);

    @GET(ApiConstant.PRODUCT_LIST_BY_MERCHANT)
    Observable<RespMerchantProductList> productListByMerchant(@Query("merchantId") String id, @Query("page") int page, @Query("size") int size);

    @GET(ApiConstant.PRODUCT_COMMENT_LIST)
    Observable<RespProductDetail.CommentsBean> productCommentList(@Query("id") String id, @Query("page") int page, @Query("size") int size);

//    ========================================  order ======================================
    @POST(ApiConstant.ORDER_CREATE)
    Observable<RespOrderCreateBean> orderCreate(@Header("x-auth-token") String token, @Body ReqOrderCreateBean orderCreateBean);
    @POST(ApiConstant.ORDER_PAY)
    Observable<JSONObject> orderPay(@Header("x-auth-token") String token, @Body ReqOrderPayBean orderPayBean);
    @POST(ApiConstant.ORDER_RATING)
    Observable<RespBoolean> orderRating(@Header("x-auth-token") String token, @Body ReqRating reqRating);
    @GET(ApiConstant.ORDER_LIST)
    Observable<RespOrderList> orderList(@Header("x-auth-token") String token, @Query("status") String status, @Query("page") int page, @Query("size") int size);
    @POST(ApiConstant.ORDER_CANCEL)
    Observable<RespBoolean> orderCancel(@Header("x-auth-token") String token, @Body ReqId reqId);
    @POST(ApiConstant.ORDER_REFUND)
    Observable<RespBoolean> orderRefund(@Header("x-auth-token") String token, @Body ReqId reqId);
    @GET(ApiConstant.ORDER_INFO)
    Observable<RespOrderInfo> orderInfo(@Header("x-auth-token") String token, @Query("id") String id);
    @GET(ApiConstant.CHECK_STATUS_SENT_SMS)
    Observable<RespCheckOrderStatus> orderStatusCheckAndSentCode(@Header("x-auth-token") String token, @Query("id") String id);
//    ============================ merchant =======================================
    @GET(ApiConstant.MERCHANT_INFO)
    Observable<MerchantInfoBean> merchantInfo(@Query("id") String id);

}
