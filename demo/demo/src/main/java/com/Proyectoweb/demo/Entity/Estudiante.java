package com.Proyectoweb.demo.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.*;

import com.Proyectoweb.demo.Entity.Inscripcion;
import com.Proyectoweb.demo.Entity.Usuario;


@Entity
public class Estudiante {
    @Id
    private Long id;

    private Carrera carrera;
    private Inscripcion inscripcion;
    private Usuario usuario;



}
