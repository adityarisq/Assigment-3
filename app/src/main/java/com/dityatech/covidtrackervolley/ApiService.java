package com.dityatech.covidtrackervolley;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    public static String BASE_URL_1 = "https://corona.lmao.ninja/v2/";

    @GET("all")
    Call<CovidCases> getCovidCases() ;


}
