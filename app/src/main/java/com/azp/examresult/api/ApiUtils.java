package com.azp.examresult.api;

public class ApiUtils {
    public static final String BASE_URL = "https://ucsmresult000.000webhostapp.com/result000/";

//    http://192.168.43.213/exam_result/result/

    public static ApiInterface getApi() {
        return ApiClient.getRetrofit(BASE_URL).create(ApiInterface.class);
    }
}
