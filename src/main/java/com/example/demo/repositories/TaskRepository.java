package com.example.demo.repositories;

import com.example.demo.models.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findAllByName(String name);

    @Query("Select task from Task task where task.name=?1")
    Task findByName(String name);

    @Query("Select task from Task task where task.taskId=?1")
    Task findById(int id);
}
