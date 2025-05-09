package com.Proyectoweb.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date fechaInscripcion;
    private String estado;
    private Estudiante estudiante;
    private Curso curso;

    public Inscripcion() {
    }

    @Override
    public String toString() {
        return "model.Inscripcion{" +
                "fechaInscripcion=" + fechaInscripcion +
                ", estado='" + estado + '\'' +
                ", estudiante=" + estudiante +
                ", curso=" + curso +
                '}';
    }

    @Data
}
