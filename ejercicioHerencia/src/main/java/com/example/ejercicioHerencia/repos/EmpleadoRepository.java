package com.example.ejercicioHerencia.repos;

import com.example.ejercicioHerencia.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository <Empleado,Long> {
}
