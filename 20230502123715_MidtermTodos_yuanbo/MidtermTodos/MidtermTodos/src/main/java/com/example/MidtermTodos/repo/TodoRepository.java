package com.example.MidtermTodos.repo;

import com.example.MidtermTodos.entitity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ClassName: TodoRepository
 * Package: com.example.MidtermTodos.repo
 * Description:
 *
 * @Author Yang, Yuanbo
 * @Create 2023-05-02 9:40 a.m.
 * @Version 1.0
 */

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
