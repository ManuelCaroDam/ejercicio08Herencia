package com.example.ejercicioHerencia.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
@Builder
public abstract class  Cliente  {

    @Id @GeneratedValue
    private Long id;
    private String telefono;
    private String direccion;
    private String email;
}
