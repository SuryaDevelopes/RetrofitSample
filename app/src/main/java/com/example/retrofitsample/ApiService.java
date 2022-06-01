package com.example.retrofitsample;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("api/users?page=2")
    Call<Model> getAllData();
}
