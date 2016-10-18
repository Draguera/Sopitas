package com.example.pepe.sopitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.SortedList;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_2);
        matchList("2016-10-15");

    }
    private void matchList(String fecha)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.talksport.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TalkSportAPI service = retrofit.create(TalkSportAPI.class);

        service.getList(fecha).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                try {
                    String respuesta = response.body().string();
                    JSONObject object = new JSONObject(respuesta);
                    Log.d("myLog", object.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }


}
