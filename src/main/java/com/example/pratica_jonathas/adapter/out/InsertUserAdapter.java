package com.example.pratica_jonathas.adapter.out;

import com.example.pratica_jonathas.adapter.mapper.UserEntityMapper;
import com.example.pratica_jonathas.core.domain.User;
import com.example.pratica_jonathas.database.repository.UserRepository;
import com.example.pratica_jonathas.ports.output.InsertUserOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertUserAdapter implements InsertUserOutputPort {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityMapper userEntityMapper;

    public void insert(User user) {
        var userEntity = userEntityMapper.toUserEntity(user);
        userRepository.save(userEntity);
    }
}
