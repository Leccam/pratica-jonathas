package com.example.pratica_jonathas.database.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "shopkeeper")
public class ShopkeeperEntity {

    @Id
    private String id;

    private String nomeCompleto;

    private String cpf;

    private String email;

    private String senha;

    private double dinheiro;

}
