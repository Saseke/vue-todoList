package com.yoke.todoList.web.util;


import com.yoke.todoList.web.common.TodoListResult;
import com.yoke.todoList.web.constant.TodoListConstant;

/**
 * Created by Yoke on 2018/3/27
 */
public class ResultUtil<T> {
    private TodoListResult<T> result;

    public ResultUtil() {
        result = new TodoListResult<>();
        result.setCode(TodoListConstant.SUCCESS.getCode());
        result.setMessage(TodoListConstant.SUCCESS.getMessage());
    }

    public TodoListResult<T> setData(T t) {
        this.result.setData(t);
        return this.result;
    }

    public TodoListResult<T> setError(T msg) {
        this.result.setCode(TodoListConstant.FAILED.getCode());
        this.result.setMessage(TodoListConstant.FAILED.getMessage());
        this.result.setData(msg);
        return this.result;
    }

}
