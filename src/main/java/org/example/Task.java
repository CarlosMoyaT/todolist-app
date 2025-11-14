package org.example;

import java.time.LocalDateTime;

public class Task {

    private int id;
    private String nameTask;
    private String contentTask;
    private LocalDateTime creationDate;

    public Task(String nameTask, String contentTask, LocalDateTime creationDate, int id) {
        this.nameTask = nameTask;
        this.contentTask = contentTask;
        this.creationDate = LocalDateTime.now();
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getContentTask() {
        return contentTask;
    }

    public void setContentTask(String contentTask) {
        this.contentTask = contentTask;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
