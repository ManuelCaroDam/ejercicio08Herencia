package com.example.ejercicioHerencia.repos;

import com.example.ejercicioHerencia.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository <Pedidos,Long> {
}
