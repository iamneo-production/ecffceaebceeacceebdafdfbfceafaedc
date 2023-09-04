package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String taskHolderName;
    private String taskDate;
    private String taskName;
    private String taskStatus;

    // Constructors, getters, and setters
}
