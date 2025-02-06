package com.Puntaverde.ProyectoIHPspring;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity  // Anotación para indicar que esta clase es una entidad JPA
public class Usuario {

    @Id  // Anotación para indicar que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Indica que el valor de 'id' se genera automáticamente (autoincremental)
    private Long id;

    private String nombre;
    private String email;

    // Getters y Setters
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
