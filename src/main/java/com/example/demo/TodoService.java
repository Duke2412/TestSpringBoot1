package com.example.demo;

import com.example.demo.TodoRepository;
import com.example.demo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public int countTodo(){
        return todoRepository.findAll().size();
    }

    public Todo getTodo(int id){
        return todoRepository.findById(id);
    }

    public List<Todo> getAll(){
        return todoRepository.findAll();
    }
}
