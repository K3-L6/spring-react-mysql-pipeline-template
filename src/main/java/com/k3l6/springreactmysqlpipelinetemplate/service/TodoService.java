package com.k3l6.springreactmysqlpipelinetemplate.service;

import com.k3l6.springreactmysqlpipelinetemplate.model.Todo;
import com.k3l6.springreactmysqlpipelinetemplate.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    @Autowired
    private final TodoRepository todoRepository;

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoByID(Integer id) {
        return todoRepository.findById(id).orElseThrow();
    }

    public Todo saveTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo deleteTodoByID(Integer id) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        todoRepository.deleteById(id);
        return todo;
    }

    public Todo updateTodo(Todo todo) {
        Todo foundTodo = todoRepository.findById(todo.getId()).orElseThrow();
        foundTodo.setTitle(todo.getTitle());
        foundTodo.setContent(todo.getContent());
        foundTodo.setIsDone(todo.getIsDone());
        return todoRepository.save(foundTodo);
    }
}
