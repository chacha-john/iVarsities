package com.chachaup.ivarsities.network;

import static com.chachaup.ivarsities.Constants.BASE_URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HipolabsClient {
    public static Retrofit retrofit = null;
    public static HipolabsAPI getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(HipolabsAPI.class);
    }
}
