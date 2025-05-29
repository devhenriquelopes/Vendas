package io.github.devhenriquelopes.Vendas.domain.repository;

import io.github.devhenriquelopes.Vendas.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository <Pedido,Integer> {
}
