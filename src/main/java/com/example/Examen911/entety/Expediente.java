package com.example.Examen911.entety;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Expediente")
public class Expediente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String fechaInsc;
    private int calificacion;
    private String fechaFin;

    public Expediente() {
    }

    public Expediente(String fechaInsc, int calificacion, String fechaFin) {
        this.fechaInsc = fechaInsc;
        this.calificacion = calificacion;
        this.fechaFin = fechaFin;
    }

    public Expediente(String fechaInsc) {
        this.fechaInsc = fechaInsc;
    }

    public String getFechaInsc() {
        return fechaInsc;
    }

    public void setFechaInsc(String fechaInsc) {
        this.fechaInsc = fechaInsc;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
