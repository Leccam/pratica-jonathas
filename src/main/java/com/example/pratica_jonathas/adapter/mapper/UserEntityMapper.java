package com.example.pratica_jonathas.adapter.mapper;


import com.example.pratica_jonathas.core.domain.User;
import com.example.pratica_jonathas.database.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserEntity toUserEntity(User user);

    User toUser(UserEntity userEntity);

}
