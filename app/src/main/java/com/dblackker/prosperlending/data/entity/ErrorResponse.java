package com.dblackker.prosperlending.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorResponse {
    @SerializedName("code")
    private String code;
    @SerializedName("message")
    private String message;
    @SerializedName("errors")
    private List<Error> errors;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public ErrorResponse(Builder builder) {
        code = builder.code;
        message = builder.message;
        errors = builder.errors;
    }

    public static class Builder {
        private String code;
        private String message;
        private List<Error> errors;

        public Builder withCode(String code) {
            this.code = code;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder withErrors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        public ErrorResponse build() {
            return new ErrorResponse(this);
        }
    }
}
