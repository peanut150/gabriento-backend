package com.todolist.gabriento_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.gabriento_backend.entity.todolist;
import com.todolist.gabriento_backend.service.todolistService;

@RestController
@RequestMapping("/api")
public class todolistController {

    private final todolistService todolistservice;

    public todolistController(todolistService todolistservice) {
        this.todolistservice = todolistservice;
    }

    @GetMapping("/getAllTodo")
    public List<todolist> getAllTodo() {
        return todolistservice.getAllToDo();
    }

    @GetMapping("/getTodoById/{id}")
    public todolist getTodoById(@PathVariable Long id) {
        return todolistservice.getToDoListById (id);
    }

    @PostMapping("/createTodo")
    public todolist createTodoList(@RequestBody todolist todolist) {
        return todolistservice.saveTodoList(todolist);
    }

    @PutMapping("/updateTodo")
    public todolist updateTodoListById(@RequestBody todolist todolist) {
        return todolistservice.updateTodoList(todolist);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteTodoList(@PathVariable Long id) {
        todolistservice.deleteTodoList(id);
    }
}
