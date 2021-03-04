package com.curso.activity;

import java.io.Serializable;

//interface Serializable permite nosso objeto Usuario possa ser convertido em bites
public class Usuario implements Serializable {

    private String nome, email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
