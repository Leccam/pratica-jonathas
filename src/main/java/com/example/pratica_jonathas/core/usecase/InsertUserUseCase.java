package com.example.pratica_jonathas.core.usecase;


import com.example.pratica_jonathas.core.domain.User;
import com.example.pratica_jonathas.ports.input.InsertUserInputPort;
import com.example.pratica_jonathas.ports.output.InsertUserOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUserUseCase implements InsertUserInputPort {

    @Autowired
    private final InsertUserOutputPort insertUserOutputPort;

    public InsertUserUseCase(InsertUserOutputPort insertUserOutputPort) {
        this.insertUserOutputPort = insertUserOutputPort;
    }


    @Override
    public void insert(User user){
        insertUserOutputPort.insert(user);
    }
}
