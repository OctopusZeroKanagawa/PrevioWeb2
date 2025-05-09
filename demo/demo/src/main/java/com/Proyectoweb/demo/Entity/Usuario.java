package com.Proyectoweb.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

public class Usuario {
    @Id
    private long id;

    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String sexo;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;
    private Date ultimoAcceso;
    private boolean cuentaActiva;

    public Usuario() {}




}
