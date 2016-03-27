package com.dblackker.prosperlending.data.entity;

import com.google.gson.annotations.SerializedName;

public class Error {
    @SerializedName("code")
    private String code;
    @SerializedName("message")
    private String message;

    public Error(Builder builder) {
        code = builder.code;
        message = builder.message;
    }

    public static class Builder {
        private String code;
        private String message;

        public Builder() {
        }

        public Builder withCode(String val) {
            code = val;
            return this;
        }

        public Builder withMessage(String val) {
            message = val;
            return this;
        }

        public Error build() {
            return new Error(this);
        }
    }
}
