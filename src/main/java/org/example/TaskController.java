package org.example;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/tasks")
public class TaskController {
    //build the CRUD

    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;
    private final TaskRepository taskRepository;

    public TaskController(List<Task> tasks, TaskRepository taskRepository) {
        this.tasks = tasks;
        this.taskRepository = taskRepository;
    }

    @PostMapping("/tasks")
    public String saveTask(@RequestBody Task task) {
        Task saved = taskRepository.save(task);
        return "Task saved with id: " + task.getId();
    }

    @GetMapping("/tasks")

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable("id") int id) {
        tasks.removeIf(task -> task.getId() == id);
        return "Task deleted with id: " + id;
    }

}
