package com.example.MidtermTodos.controller;

import com.example.MidtermTodos.entitity.Todo;
import com.example.MidtermTodos.repo.TodoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * ClassName: TodoController
 * Package: com.example.MidtermTodos.controller
 * Description:
 *
 * @Author Yang, Yuanbo
 * @Create 2023-05-02 9:54 a.m.
 * @Version 1.0
 */
@Controller
public class TodoController {

    @Autowired
    private TodoRepository tRepo;

    @GetMapping({"/index", "/"})
    public ModelAndView listTodos(){

        ModelAndView mav = new ModelAndView("index");
        List<Todo> all = tRepo.findAll();

        mav.addObject("todos", all);

        return mav;
    }


    @GetMapping("/addTodo")
    public ModelAndView addTodo(){
        ModelAndView mav = new ModelAndView("add-todo");
        Todo newTodo = new Todo();
        mav.addObject("todo", newTodo);

        return mav;
    }


    @PostMapping("/save")
    public String saveTodo(@ModelAttribute("todo") @Valid Todo todo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-todo";
        }
        tRepo.save(todo);
        return "redirect:/";
    }


    @GetMapping("/updateTodo")
    public ModelAndView updateTodo(@RequestParam Long todoId){

        ModelAndView mav = new ModelAndView("add-todo");
        Todo todo = tRepo.findById(todoId).get();
        mav.addObject("todo", todo);
        return mav;
    }

    @GetMapping("/deleteTodo")
    public String deleteTodo(@RequestParam Long todoId){
        tRepo.deleteById(todoId);
        return "redirect:/";
    }

}
