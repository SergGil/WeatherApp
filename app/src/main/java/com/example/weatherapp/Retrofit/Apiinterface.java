package com.example.weatherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apiinterface {

    @GET("weather?appid=9f21cc3349c5987b0093bd8a85067bf9&units=metric")
    Call<Example> getWeatherData (@Query("q") String name);
}
