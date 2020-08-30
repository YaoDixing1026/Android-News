package com.and.common.errorhandler;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

import retrofit2.adapter.rxjava.HttpException;

/**
 * Created by ydx on 17-1-11.
 */

public class ErrorHandler {

    public static ErrorBody handle(Throwable throwable) {
        if (throwable instanceof HttpException) {
            HttpException error = (HttpException) throwable;
            if(error.code()==502){
                ErrorBody errorBody = new ErrorBody();
                errorBody.setErrorMassage("服务器链接异常");
                errorBody.setStatus(502);
                return errorBody;
            }else if(error.code() ==500){
                ErrorBody errorBody = new ErrorBody();
                errorBody.setErrorMassage("服务器异常");
                errorBody.setStatus(500);
                return errorBody;
            }
            try {
                return new Gson().fromJson(error.response().errorBody().string(),
                        ErrorBody.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(throwable instanceof ConnectException){

            ErrorBody errorBody = new ErrorBody();
            errorBody.setErrorMassage("请链接网络");
            errorBody.setStatus(-200);
            return errorBody;
        }
        if(throwable instanceof NoRouteToHostException){
            ErrorBody errorBody = new ErrorBody();
            errorBody.setErrorMassage("服务器链接异常");
            errorBody.setStatus(-201);
            return errorBody;
        }
        if(throwable instanceof TimeoutException){
            ErrorBody errorBody = new ErrorBody();
            errorBody.setErrorMassage("链接超时，请稍后再试");
            errorBody.setStatus(-202);
            return errorBody;
        }else if(throwable instanceof SocketTimeoutException){
            ErrorBody errorBody = new ErrorBody();
            errorBody.setErrorMassage("链接超时，请稍后再试");
            errorBody.setStatus(-203);
            return errorBody;
        }
        else {
            throwable.printStackTrace();
            ErrorBody errorBody = new ErrorBody();
            errorBody.setErrorMassage("网络链接失败");
            errorBody.setStatus(-1);
            return errorBody;
        }

    }
}
