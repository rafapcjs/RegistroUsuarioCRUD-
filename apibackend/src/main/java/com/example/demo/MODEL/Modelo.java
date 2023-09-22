package com.example.demo.MODEL;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cliente")
@Entity

public class Modelo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    private String nombre;
    private  String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

