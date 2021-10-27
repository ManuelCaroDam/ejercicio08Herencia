package com.example.ejercicioHerencia.repos;

import com.example.ejercicioHerencia.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente,Long> {
}
