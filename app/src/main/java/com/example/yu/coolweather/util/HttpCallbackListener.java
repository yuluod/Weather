package com.example.yu.coolweather.util;

/**
 * Created by yu on 2015/5/24.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
