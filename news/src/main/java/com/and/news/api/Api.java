package com.and.news.api;

import com.and.common.api.ApiManager;

public class Api {
    public ApiService build(String baseUrl){
        return ApiManager.getInstance().getRetrofit(baseUrl).create(ApiService.class);
    }
}
