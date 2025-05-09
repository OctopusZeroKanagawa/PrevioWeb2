package com.Proyectoweb.demo.Entity;

import com.Proyectoweb.demo.Entity.Curso;
import com.Proyectoweb.demo.Entity.Estudiante;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.*;

import java.util.Date;

public class Inscripcion {
    @Id
    private long id;

    private Date fechaInscripcion;
    private String estado;
    private Estudiante estudiante;
    private Curso curso;

    public Inscripcion(long id, Date fechaInscripcion, String estado, Estudiante estudiante, Curso curso) {}


}
