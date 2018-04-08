package com.yoke.todoList.web.dto;

import com.yoke.todoList.pojo.Record;
import com.yoke.todoList.pojo.Todo;

import java.util.List;

/**
 * @author Yoke
 * Created on 2018/4/6
 */
public class TodoDto {
    private Todo todo;
    private List<Record> records;

    public TodoDto() {
    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public TodoDto(Todo todo, List<Record> records) {
        this.todo = todo;
        this.records = records;
    }
}
