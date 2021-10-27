package com.example.ejercicioHerencia.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
@Builder

public class ClienteInvididual extends Cliente {

    private String DNI;
    private String nombre;
    private String apellidos;
    private int edad;
}
