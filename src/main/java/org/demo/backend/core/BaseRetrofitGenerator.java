package org.demo.backend.core;

import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseRetrofitGenerator {

    public <T> T getRetrofitInstanceForEndpoint(Class<T> endpointClass, String baseUrl) {
        Gson gson = new Gson();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(endpointClass);
    }
}
