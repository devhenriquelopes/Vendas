package io.github.devhenriquelopes.Vendas.domain.repository;

import io.github.devhenriquelopes.Vendas.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Itemspedido extends JpaRepository<ItemPedido,Integer> {
}
