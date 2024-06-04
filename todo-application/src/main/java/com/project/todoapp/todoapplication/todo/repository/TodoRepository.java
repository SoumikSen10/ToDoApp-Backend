package com.project.todoapp.todoapplication.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.todoapp.todoapplication.todo.Todo;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer>
{
   List<Todo> findByUsername(String username);
}
