package com.dblackker.prosperlending.service;

import com.dblackker.prosperlending.data.entity.SearchListingsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AppService {
    @GET("search/listings/")
    Call<SearchListingsResponse> getSearchListings();
}
