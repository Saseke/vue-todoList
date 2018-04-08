package com.yoke.todoList.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yoke
 * Created on 2018/4/6
 */
@SpringBootApplication(scanBasePackages = "com.yoke")
@MapperScan("com.yoke.todoList.mapper")
public class TodoListApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoListApplication.class, args);
    }
}
