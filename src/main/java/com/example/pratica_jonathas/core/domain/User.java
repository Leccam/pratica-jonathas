package com.example.pratica_jonathas.core.domain;

public class User {

    private String id;

    private String nomeCompleto;

    private String cpf;

    private String email;

    private String senha;

    private double dinheiro;

    public User(){
    }

    public User(String nomeCompleto, String cpf, String email, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public User(String nomeCompleto, String cpf, String email, String senha, double dinheiro) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dinheiro = dinheiro;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dinheiro=" + dinheiro +
                '}';
    }
}

