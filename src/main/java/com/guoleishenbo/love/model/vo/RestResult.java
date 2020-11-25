package com.guoleishenbo.love.model.vo;

import net.minidev.json.JSONObject;

public class RestResult<T> {
    private boolean success;
    private String errorMessage;
    private T data;
    private static final String STATUE = "status";
    private static final String SUCCESS = "success";

    public static RestResult fromErrorMessage(String errorMessage) {
        return new RestResult(false, errorMessage);
    }

    public static RestResult fromResult(JSONObject result) {
        if (result.get(STATUE).equals(SUCCESS)) {
            return RestResult.fromData(result);
        } else {
            return RestResult.fromErrorMessage(result.toString());
        }
    }

    public static <T> RestResult<T> fromData(T data) {
        return new RestResult<T>(true, data);
    }

    public static <T> RestResult<T> fromData(boolean status, T data) {
        return new RestResult<T>(status, data);
    }

    public RestResult() {
    }

    public RestResult(boolean success, String errorMessage, T data) {
        this.success = success;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    private RestResult(boolean success, String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }

    private RestResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
