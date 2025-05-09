package com.Proyectoweb.demo.model;

import lombok.*;
import jakarta.persistence.*;

import java.util.Date;

public class Usuario {

    @Id
    private String cedula;

    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private Date fechaNacimiento;
    private String direccion;
    private long telefono;
    private Rol roles;
    private Mensaje mensajeEnviado;
    private Mensaje mensajeRecibido;
    private Notificacion notificacion;
    private Date ultimoAcceso;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String cedula, String nombre, String apellido, String correo, String contrasenia, Date fechaNacimiento, String direccion, long telefono, Rol roles, Mensaje mensajeEnviado, Mensaje mensajeRecibido, Notificacion notificacion, Date ultimoAcceso, boolean activo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.roles = roles;
        this.mensajeEnviado = mensajeEnviado;
        this.mensajeRecibido = mensajeRecibido;
        this.notificacion = notificacion;
        this.ultimoAcceso = ultimoAcceso;
        this.activo = activo;
    }

    @Data

    @Override
    public String toString() {
        return "model.Usuario{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", roles=" + roles +
                ", mensajeEnviado=" + mensajeEnviado +
                ", mensajeRecibido=" + mensajeRecibido +
                ", notificacion=" + notificacion +
                ", ultimoAcceso=" + ultimoAcceso +
                ", activo=" + activo +
                '}';
    }
}
