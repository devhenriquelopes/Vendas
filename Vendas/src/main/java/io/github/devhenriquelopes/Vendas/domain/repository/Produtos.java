package io.github.devhenriquelopes.Vendas.domain.repository;

import io.github.devhenriquelopes.Vendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {

}
