package com.azp.examresult.api;

import com.azp.examresult.model.ExamResult;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @POST("second_year_result.php")
    @FormUrlEncoded
    Call<ExamResult> resultData(
            @Field("roll_no") String rollNo
    );
}
