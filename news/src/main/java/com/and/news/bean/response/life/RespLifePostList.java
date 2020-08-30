package com.and.news.bean.response.life;

import com.and.news.bean.entity.PostBean;

/**
 * Created by ydx on 17-5-27.
 */

public class RespLifePostList {


    /**
     * positionedCity : false
     * posts : {"content":[{"id":"59293648526dcd1d457dc0f6","title":"啊啊","userId":"58d8c64d526dcd60816bd4ac","userName":"永远的灵魂哥","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58d8c64d526dcd60816bd4ac.png","photos":["http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495873047522.png"],"hasPrice":true,"price":1,"monetaryUnit":"C$","countryName":"澳大利亚","cityName":"其它","category":"生意","read":2,"createAt":"2017-05-27T08:18:16Z","detail":"。","commentCount":0,"like":0,"status":"online"},{"id":"592932c4526dcd1d457dc0f5","title":"啦啦啦","userId":"58d8c64d526dcd60816bd4ac","userName":"永远的灵魂哥","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58d8c64d526dcd60816bd4ac.png","photos":["http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495872176900.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495872185559.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495872185553.png"],"hasPrice":true,"price":1,"monetaryUnit":"A$","countryName":"美国","cityName":"其它","category":"生意","read":1,"createAt":"2017-05-27T08:03:16Z","detail":"。。。","commentCount":0,"like":0,"status":"online"},{"id":"5928f07f526dcd08defb00aa","title":"家里","userId":"58c8ad3a526dcd1da870d0b0","userName":"MRIT","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58c8ad3a526dcd1da870d0b0/20170316175540.png","photos":["http://x-test.oss-cn-shenzhen.aliyuncs.com/post/(null)/20170527192030004.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/(null)/20170527192031004.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/(null)/20170527192031004.png"],"hasPrice":true,"price":22200,"monetaryUnit":"¥","countryName":"美国","cityName":"纽约","category":"美食","read":6,"createAt":"2017-05-27T03:20:31Z","detail":"哦哦","commentCount":0,"like":0,"status":"online"},{"id":"59278874526dcd01aa5cb08c","title":"溜肉段","userId":"58d8c64d526dcd60816bd4ac","userName":"永远的灵魂哥","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58d8c64d526dcd60816bd4ac.png","photos":["http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495763054342.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495763054406.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495763054547.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495763054480.png"],"hasPrice":true,"price":521,"monetaryUnit":"￥","countryName":"中国","cityName":"北京","category":"美食","read":0,"createAt":"2017-05-26T01:44:20Z","detail":"香","commentCount":0,"like":0,"status":"online"},{"id":"592787fc526dcd01aa5cb08b","title":"溜肉段","userId":"58d8c64d526dcd60816bd4ac","userName":"永远的灵魂哥","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58d8c64d526dcd60816bd4ac.png","photos":["http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929825.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929891.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929975.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929757.png"],"hasPrice":true,"price":521,"monetaryUnit":"￥","countryName":"中国","cityName":"北京","category":"美食","read":1,"createAt":"2017-05-26T01:42:20Z","detail":"香","commentCount":0,"like":0,"status":"online"}],"totalPages":1,"last":true,"totalElements":5,"sort":[{"direction":"DESC","property":"createAt","ignoreCase":false,"nullHandling":"NATIVE","ascending":false,"descending":true}],"numberOfElements":5,"first":true,"size":20,"number":0}
     */

    private boolean positionedCity;
    private PostBean posts;

    public boolean isPositionedCity() {
        return positionedCity;
    }

    public void setPositionedCity(boolean positionedCity) {
        this.positionedCity = positionedCity;
    }

    public PostBean getPosts() {
        return posts;
    }

    public void setPosts(PostBean posts) {
        this.posts = posts;
    }

}
