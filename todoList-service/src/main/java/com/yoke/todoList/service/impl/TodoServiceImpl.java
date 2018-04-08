package com.yoke.todoList.service.impl;

import com.yoke.todoList.mapper.TodoMapper;
import com.yoke.todoList.pojo.Todo;
import com.yoke.todoList.pojo.TodoExample;
import com.yoke.todoList.service.TodoService;
import org.springframework.stereotype.Service;

/**
 * @author Yoke
 * Created on 2018/4/6
 */
@Service
public class TodoServiceImpl extends BaseServiceImpl<TodoMapper, Todo, TodoExample> implements TodoService {
}
