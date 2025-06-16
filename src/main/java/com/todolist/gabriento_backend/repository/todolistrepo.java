package com.todolist.gabriento_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.gabriento_backend.entity.todolist;

@Repository
public interface todolistrepo extends JpaRepository<todolist, Long> {

}
