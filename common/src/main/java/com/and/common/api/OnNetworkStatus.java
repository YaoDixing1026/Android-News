package com.and.common.api;


import com.and.common.errorhandler.ErrorBody;

/**
 * Created by ydx on 16-12-30.
 */

public interface OnNetworkStatus<T> {
    void onLoading();
    void onLoaded();
    void onSuccess(T t);
    void onFail(ErrorBody errorBody);

}
