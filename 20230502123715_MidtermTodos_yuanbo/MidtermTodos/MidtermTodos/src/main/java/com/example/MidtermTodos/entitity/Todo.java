package com.example.MidtermTodos.entitity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * ClassName: Todo
 * Package: com.example.MidtermTodos.entitity
 * Description:
 *
 * @Author Yang, Yuanbo
 * @Create 2023-05-02 9:31 a.m.
 * @Version 1.0
 */

@Entity
@Data
@Table(name="todos")
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Task name is required")
    @Size(min = 1, max = 100, message = "Task name must be between 1 and 100 characters")
    @Column(name = "task")
    private String task;

    @NotNull(message = "Due date is required")
    @Column(name = "due_date")
    private Date dueDate;

    @NotNull(message = "Status cannot be empty")
    @Column(name = "is_done")
    private boolean isDone;

}
