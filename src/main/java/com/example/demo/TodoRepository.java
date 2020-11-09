package com.example.demo;

import com.example.demo.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TodoRepository {
    List<Todo> findAll();


    Todo findById(int id);
}