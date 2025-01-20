package com.example.backend.controller;

import com.example.backend.model.Task;
import com.example.backend.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TaskController - Handles HTTP requests and responses (Endpoints)

@RestController // Controller for REST API
@RequestMapping("/tasks") // Base URL for all endpoints
public class TaskController {
    // Use and initialize instance of TaskService class for database
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping // Get endpoint
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping // Post endpoint
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }
}
