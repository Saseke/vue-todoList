package com.yoke.todoList.web.common;


import com.yoke.todoList.common.BaseResult;
import com.yoke.todoList.web.constant.TodoListConstant;

import java.io.Serializable;

/**
 * Created by Yoke on 2018/3/23
 */
public class TodoListResult<T> extends BaseResult<T> implements Serializable {
    public TodoListResult(TodoListConstant egoResultConstant, T t) {
        super(egoResultConstant.getCode(), egoResultConstant.getMessage(), t);
    }

    public TodoListResult(int code, String message, T data) {
        super(code, message, data);
    }

    public TodoListResult() {
    }

    public TodoListResult(TodoListConstant success) {
    }
}
