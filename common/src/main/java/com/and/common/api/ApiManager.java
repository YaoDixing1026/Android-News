package com.and.common.api;

import android.text.TextUtils;

import com.and.common.App;
import com.and.common.R;
import com.and.common.VersionManager;
import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ydx on 16-12-28.
 */
public class ApiManager{

    private static ApiManager apiManager = new ApiManager();
    private static String baseUrl;
    private static String RetrofitName;
    private Retrofit  Retrofit;
    private int count;
    public String getBaseUrl(){
        return baseUrl;
    }
    private ApiManager(){

    }
    public static ApiManager getInstance(){
        return apiManager;
    }
    /*构建证书 */
//    SSLSocketFactory sslSocketFactory = HttpsFactory.getSSLSocketFactory();

//    CertificatePinner certificatePinner = new CertificatePinner.Builder()
//            .add("api.heydaycn.com","sha256/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=").build();

    /* 拦截器 */
    Interceptor interceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            try {
                Request request = chain.request();
                String token = request.header(App.ContextHolder.getContext().getString(R.string.header));
                Request r;
                if (!TextUtils.isEmpty(token)) {
                    r = request.newBuilder().build();
                } else {
                    r = request.newBuilder().removeHeader(App.ContextHolder.getContext().getString(R.string.header)).build();
                }

                return chain.proceed(r);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }
    };

    private HttpLoggingInterceptor getLogInterceptor(){
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {

            @Override
            public void log(String message) {
                Logger.d("network ==== "+message);
            }
        });
        loggingInterceptor.setLevel(level);
        return loggingInterceptor;
    }


    /* client */
    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .addNetworkInterceptor(getLogInterceptor())
//            .sslSocketFactory(sslSocketFactory)
//            .hostnameVerifier(HttpsFactory.getHostnameVerifier(new String[]{"api.heydaycn.com"}))
//            .certificatePinner(certificatePinner)
            .addInterceptor(interceptor)
            .build();



    public Retrofit changedBaseUrl(String url){
        return getRetrofit(url);
    }

    public Retrofit getRetrofit(String url){
        baseUrl = url;
        if(count==0) {
            if (VersionManager.getInstance().isTestVersion()) {
                baseUrl = App.ContextHolder.getContext().getResources().getString(R.string.api_test);
            } else {
                baseUrl = App.ContextHolder.getContext().getResources().getString(R.string.api_normal);
            }
        }
        Logger.d("request url:"+baseUrl);
        count++;
            return new Retrofit .Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpClient)
                    .build();
    }


}
