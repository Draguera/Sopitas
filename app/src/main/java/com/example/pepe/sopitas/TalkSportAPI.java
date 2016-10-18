package com.example.pepe.sopitas;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Pepe on 30/09/2016.
 */
public interface TalkSportAPI
{
    @GET("/api/livescores/?method=getMatches")
    Call<ResponseBody> getMatches();

    @GET("/api/fixture/?method=getList&sport=1&hsh=255310244028f29f0d79b2581a4450cc&app_id=mshndevmkt")
    Call<ResponseBody> getList(@Query("fixture_date") String fecha);
}
