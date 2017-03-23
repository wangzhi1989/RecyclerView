package com.recyclerview;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2017/3/17.
 * compile 'com.squareup.okhttp3:okhttp:3.6.0'
 */

public class MyOkhttp {
    // 创建OKHttpClient对象
    public static OkHttpClient okHttpClient = new OkHttpClient();

    public static String get(String url) {
        try {
            okHttpClient.newBuilder().connectTimeout(10000, TimeUnit.MILLISECONDS);
            Request request = new Request.Builder().url(url).build();
            Response response = okHttpClient.newCall(request).execute();

            if (response.isSuccessful()) {
                return response.body().string();
            } else {
                throw new IOException("Unexpected code " + response);
            }
        } catch (Exception e) {
            Log.d(TAG, Log.getStackTraceString(e));
        }
        return null;
    }
}
