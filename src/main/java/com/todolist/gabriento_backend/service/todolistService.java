package com.todolist.gabriento_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.todolist.gabriento_backend.entity.todolist;
import com.todolist.gabriento_backend.repository.todolistrepo;

@Service
public class todolistService {
    
    private final todolistrepo todolistrepo;

    public todolistService(todolistrepo todolistrepo) {
        this.todolistrepo = todolistrepo;
    }


    public List<todolist> getAllToDo() {
        return todolistrepo.findAll();
    }

    public todolist getToDoListById(Long id) {
        Optional<todolist> list = todolistrepo.findById(id);
        return list.get();
    }

    public todolist saveTodoList(todolist todolist) {
        return todolistrepo.save(todolist);
    }

    public todolist updateTodoList(todolist todolist) {
        Optional<todolist> list = todolistrepo.findById(todolist.getId());

        todolist existingList = list.get();
        existingList.setTitle(todolist.getTitle());
        existingList.setDate_completed(todolist.getDate_completed());
        existingList.setStatus(todolist.getStatus());

        return todolistrepo.save(existingList);
    }

    public void deleteTodoList(Long id) {
        Optional<todolist> list = todolistrepo.findById(id);

        todolistrepo.delete(list.get());
    }
}
