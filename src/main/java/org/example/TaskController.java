package org.example;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/tasks")
public class TaskController {
    //build the CRUD

    private List<Task> tasks = new ArrayList<>();

    //build savetask
    @PostMapping("/tasks")
    public String saveTask(@RequestBody Task task) {
    }

    @GetMapping("/tasks")

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable String id) {

    }

}
