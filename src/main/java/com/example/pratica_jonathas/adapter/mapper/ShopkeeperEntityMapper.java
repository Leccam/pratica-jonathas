package com.example.pratica_jonathas.adapter.mapper;


import com.example.pratica_jonathas.core.domain.Shopkeeper;
import com.example.pratica_jonathas.database.entity.ShopkeeperEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShopkeeperEntityMapper {

    ShopkeeperEntity toShopkeeperEntity(Shopkeeper shopkeeper);

    Shopkeeper toShopkeeper(ShopkeeperEntity shopkeeperEntity);

}