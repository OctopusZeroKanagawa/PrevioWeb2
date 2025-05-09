package com.Proyectoweb.demo.model;

import com.Proyectoweb.demo.model.Inscripcion;
import jakarta.persistence.*;
import lombok.Data;

public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String carrera;
    private byte semestre;
    private boolean estado;
    private Usuario usuario;
    private Inscripcion inscripcion;

    public Estudiante(int id, String carrera, byte semestre, boolean estado, Usuario usuario, Inscripcion inscripcion) {
        this.id = id;
        this.carrera = carrera;
        this.semestre = semestre;
        this.estado = estado;
        this.usuario = usuario;
        this.inscripcion = inscripcion;
    }





}
