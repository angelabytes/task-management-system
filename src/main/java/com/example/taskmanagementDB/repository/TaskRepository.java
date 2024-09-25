package com.example.taskmanagementDB.repository;

import com.example.taskmanagementDB.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
