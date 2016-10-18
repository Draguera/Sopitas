package com.example.pepe.sopitas;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.gson.JsonArray;

public class MainActivity extends Activity implements Callback<ResponseBody>{

    private List<String> urlss;
    private LinearLayout footer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //HIDE TOOLBAR
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //RequestMatches();
        //FACEBOOK analytics
        //FacebookSdk.sdkInitialize(getApplicationContext());
        //AppEventsLogger.activateApp(this);
        //
        footer = (LinearLayout) findViewById(R.id.footer);
        BottomSheetBehavior<LinearLayout> from = BottomSheetBehavior.from(footer);
    }


    private void RequestMatches()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.talksport.com")
                .build();

        TalkSportAPI service = retrofit.create(TalkSportAPI.class);

        service.getMatches().enqueue(this);

    }

    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        try {
            String respuesta = response.body().string();

            JSONObject object = new JSONObject(respuesta);
            JSONObject data = object.getJSONObject("data");
            JSONObject matches = data.getJSONObject("matches");

            List<String> urlss = new ArrayList<>();
            //Conjunto de keys
            Iterator<String> iterator = matches.keys();

            while(iterator.hasNext())
            {
                String key = iterator.next();
                JSONObject keys = matches.getJSONObject(key);
                String url = keys.getString("url");
                //Log.d("myLog",url);
                urlss.add(url);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        t.printStackTrace();
        Log.d("myLog",t.getMessage());
    }


}
