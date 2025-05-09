package com.Proyectoweb.demo.Entity;

import com.Proyectoweb.demo.model.*;
import com.Proyectoweb.demo.model.Inscripcion;
import jakarta.persistence.*;
import lombok.*;

@Entity
public class Curso {
    @Id
    private long id;

    private PeriodoAcademico periodoAcademico;
    private short cupoMaximo;
    private short cupoActual;
    private Asignatura asignatura;
    private SesionClase clase;
    private Profesor profesor;
    private Inscripcion inscripcion;
    private Evaluacion evaluacion;
    private RecursoAcademico recurso;


}
