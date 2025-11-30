package org.example;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nameTask;

    @Column(length = 500)
    private String contentTask;

    @Column(nullable = false, updatable = false)
    private LocalDateTime creationDate;

    @Column
    private LocalDateTime updateDate;

    @Column
    private boolean completed;

    public Task() {

    }

    public Task(String nameTask, String contentTask) {
        this.nameTask = nameTask;
        this.contentTask = contentTask;
        this.creationDate = LocalDateTime.now();
        this.completed = false;
    }

    @PreUpdate
    protected void onUpdate() {
        this.updateDate = LocalDateTime.now();
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

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", nameTask='" + nameTask + '\'' +
                ", contentTask='" + contentTask + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                ", completed=" + completed +
                '}';
    }
}
