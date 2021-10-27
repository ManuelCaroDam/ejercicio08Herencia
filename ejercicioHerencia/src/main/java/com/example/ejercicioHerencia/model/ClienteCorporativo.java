package com.example.ejercicioHerencia.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor
@Builder

public class ClienteCorporativo extends Cliente {

    private String NIF;
}
