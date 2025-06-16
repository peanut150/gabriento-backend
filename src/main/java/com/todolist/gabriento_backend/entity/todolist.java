package com.todolist.gabriento_backend.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "todolist")
public class todolist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @CreationTimestamp
    @Column(name = "date_added")
    private LocalDateTime date_added;

    @Column(name = "date_completed")
    private LocalDateTime date_completed;

    @Column(name = "status")
    private String status;


}
