package com.examly.springapp;

import java.util.List;

public interface TaskService {
    void saveTask(Task task);
    List<Task> getAllTasks();
    Task getTaskById(Long taskId);
    void deleteTask(Long taskId);
}
