package com.example.ejercicioHerencia.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder

public class Empleado  {
    @Id @GeneratedValue
    private double sueldo;
    private String nombre;
    private String apellidos;
}
