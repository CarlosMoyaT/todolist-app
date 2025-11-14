package org.example;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/tasks")
public class TaskController {
    //build the CRUD

    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public TaskController(List<Task> tasks) {
        this.tasks = tasks;
    }

    /*  metodo saveTask
     *  1. Asigna un id único a la tarea usando la variable `nextId`.
     *  2. Incrementa `nextId` para que la siguiente tarea tenga un id distinto.
     *  3. Agrega la tarea a la lista `tasks`.
     *  4. Devuelve un mensaje de confirmación con el id asignado.
    * */
    @PostMapping("/tasks")
    public String saveTask(@RequestBody Task task) {
        task.setId(nextId);
        nextId++;
        tasks.add(task);
        return "Task saved with id: " + task.getId();
    }

    @GetMapping("/tasks")

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable String id) {

    }

}
