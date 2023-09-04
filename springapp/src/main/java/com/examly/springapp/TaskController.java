package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/saveTask")
    public void saveTask(@RequestBody Task task) {
        taskService.saveTask(task);
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/getTask")
    public Task getTaskById(@RequestParam Long taskId) {
        return taskService.getTaskById(taskId);
    }

    @GetMapping("/deleteTask")
    public void deleteTask(@RequestParam Long taskId) {
        taskService.deleteTask(taskId);
    }
}
