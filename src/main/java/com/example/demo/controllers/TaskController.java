package com.example.demo.controllers;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")

public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @RequestMapping(method = RequestMethod.GET, params = {"name"})
    public Task getTaskByName(@RequestParam String name) {
        return taskService.getTaskByName(name);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Task getTaskById(@PathVariable("id") int id) {
        return taskService.getTaskById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addTask(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteTask(@RequestBody Task task) {
        taskService.deleteTask(task);
    }

}
