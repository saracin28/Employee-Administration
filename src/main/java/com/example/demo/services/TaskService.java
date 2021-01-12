package com.example.demo.services;


import com.example.demo.models.Task;
import com.example.demo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return (List<Task>) taskRepository.findAll();
    }

    public void addTask(Task task) {
        taskRepository.save(task);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    public Task getTaskByName(String name) {
        return taskRepository.findByName(name);
    }

    public Task getTaskById(int id) {
        return taskRepository.findById(id);
    }

    public void deleteTask(Task task){
        taskRepository.delete(task);
    }
}
