package com.Proyectoweb.demo.model;

import java.util.Date;
import java.util.Objects;
import jakarta.persistence.*;
import lombok.*;
import com.Proyectoweb.demo.model.Usuario;

@Entity
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String asunto;
    private String contenido;
    private Date fechaEnvio;
    private boolean leido;
    private Usuario remitente;
    private Usuario destinatario;

    public Mensaje() {
    }

    public Mensaje(String asunto, String contenido, Date fechaEnvio, boolean leido, Usuario remitente, Usuario destinatario) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.leido = leido;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    

    @Override
    public String toString() {
        return "model.Mensaje{" +
                "asunto='" + asunto + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                ", leido=" + leido +
                ", remitente=" + remitente +
                ", destinatario=" + destinatario +
                '}';
    }
}
