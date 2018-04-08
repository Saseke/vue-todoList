package com.yoke.todoList.common;

import java.io.Serializable;

/**
 * Created by Yoke on 2018/3/23
 */
public class BaseResult<T> implements Serializable {
    /**
     * 状态码: 1代表成功
     */
    private int code;
    /**
     * 成功为success,其他为失败原因
     */
    private String message;
    /**
     * 数据集合
     */
   private T data;

    public BaseResult() {
    }

    public BaseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
