package com.k3l6.springreactmysqlpipelinetemplate.controller;

import com.k3l6.springreactmysqlpipelinetemplate.model.Todo;
import com.k3l6.springreactmysqlpipelinetemplate.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping
    public List<Todo> getTodos() {
        return service.getTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoByID(@PathVariable Integer id) {
        return service.getTodoByID(id);
    }

    @PostMapping
    public Todo saveTodo(@RequestBody Todo todo) {
        return service.saveTodo(todo);
    }

    @DeleteMapping("/{id}")
    public Todo deleteTodoByID(@PathVariable Integer id) {
        return service.deleteTodoByID(id);
    }

    @PutMapping
    public Todo updateTodo(@RequestBody Todo todo) {
        return service.updateTodo(todo);
    }
}
