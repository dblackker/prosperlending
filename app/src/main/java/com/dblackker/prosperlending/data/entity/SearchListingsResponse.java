package com.dblackker.prosperlending.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchListingsResponse {
    @SerializedName("result")
    private List<SearchListing> searchListings;
    @SerializedName("result_count")
    private int resultCount;
    @SerializedName("total_count")
    private int totalCount;

    public List<SearchListing> getSearchListings() {
        return searchListings;
    }

    public int getResultCount() {
        return resultCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public SearchListingsResponse(Builder builder) {
        searchListings = builder.searchListings;
        resultCount = builder.resultCount;
        totalCount = builder.totalCount;
    }

    public static class Builder {
        private List<SearchListing> searchListings;
        private int resultCount;
        private int totalCount;

        public Builder withSearchListings(List<SearchListing> searchListings) {
            this.searchListings = searchListings;
            return this;
        }

        public Builder withResultCount(int resultCount) {
            this.resultCount = resultCount;
            return this;
        }

        public Builder withTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchListingsResponse build() {
            return new SearchListingsResponse(this);
        }
    }

}
