package org.example;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostMapping("/tasks")
    public String saveTask(@RequestBody Task task) {
        Task saved = taskRepository.save(task);
        return "Task saved with id: " + saved.getId();
    }

    @GetMapping("/tasks")

    @PutMapping("/tasks/{id}")

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable("id") Long id) {
        taskRepository.deleteById(id);
        return "Task deleted with id: " + id;
    }

}
