package com.example.pratica_jonathas.controller;

import com.example.pratica_jonathas.core.domain.Transfer;
import com.example.pratica_jonathas.core.domain.User;
import com.example.pratica_jonathas.core.usecase.InsertUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private InsertUserUseCase insertUserUseCase;

    @PostMapping("/insert")
    void insertUser(@RequestBody User user){
        insertUserUseCase.insert(user);
    }

    @PostMapping("/transfer")
    String transfer(@RequestBody Transfer transfer){
        return transfer.toString();
    }

}