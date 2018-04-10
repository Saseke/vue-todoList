package com.yoke.todoList.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @author Yoke
 * Created on 2018/4/6
 */
@SpringBootApplication(scanBasePackages = "com.yoke")
@MapperScan("com.yoke.todoList.mapper")
public class TodoListApplication {
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {

        return new TomcatEmbeddedServletContainerFactory();

    }

    public static void main(String[] args) {
        SpringApplication.run(TodoListApplication.class, args);
    }
}
