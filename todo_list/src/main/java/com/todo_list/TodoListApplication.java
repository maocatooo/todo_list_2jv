package com.todo_list;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@MapperScan(basePackages = {"com.todo_list.mapper"})
@SpringBootApplication
public class TodoListApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(TodoListApplication.class, args);
    }
}
