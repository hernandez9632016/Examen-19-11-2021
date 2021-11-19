package com.example.Examen911.entety;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private  String nombre;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public Curso() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}