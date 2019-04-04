package com.classtune.androidnearbyplace.Remote;

import com.classtune.androidnearbyplace.Model.MyPlace;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPIService {
    @GET
    Call<MyPlace> getNearByPlaces(@Url String url);
}
