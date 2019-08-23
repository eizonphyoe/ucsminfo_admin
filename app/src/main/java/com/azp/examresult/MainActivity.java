package com.azp.examresult;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.azp.examresult.api.ApiInterface;
import com.azp.examresult.api.ApiUtils;
import com.azp.examresult.model.ExamResult;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiUtils.getApi();

        String rollNo = "2CS-12";
        textView = findViewById(R.id.txtresult);

        Call<ExamResult> call = apiInterface.resultData(rollNo);

        call.enqueue(new Callback<ExamResult>() {
            @Override
            public void onResponse(Call<ExamResult> call, Response<ExamResult> response) {
                if (response.isSuccessful() & response.body() !=null){
                    ExamResult examResult = response.body();
                    textView.setText(response.body().getName());
                    Log.d("Response >>>>",response.body().toString()+"");
                }
            }

            @Override
            public void onFailure(Call<ExamResult> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.toString()+"",Toast.LENGTH_LONG).show();
            }
        });
    }
}
