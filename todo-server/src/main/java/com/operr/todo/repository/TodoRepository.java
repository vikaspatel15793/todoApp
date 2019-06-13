package com.operr.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.operr.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
