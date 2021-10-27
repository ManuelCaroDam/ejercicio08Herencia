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

public class Pedidos  {
    @Id @GeneratedValue
    private Long id;
    private double precio;
    private String direccion;



}
