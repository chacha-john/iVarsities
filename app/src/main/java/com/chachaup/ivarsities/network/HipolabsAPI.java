package com.chachaup.ivarsities.network;

import com.chachaup.ivarsities.models.UniversitiesListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HipolabsAPI {
    //get request for the list of varsities
    @GET("search")
    Call<UniversitiesListResponse> getSchools(
            @Query("country") String country
    );
}
