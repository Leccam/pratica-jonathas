package com.example.pratica_jonathas.database.repository;


import com.example.pratica_jonathas.core.domain.User;
import com.example.pratica_jonathas.database.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    void save(User user);
}
