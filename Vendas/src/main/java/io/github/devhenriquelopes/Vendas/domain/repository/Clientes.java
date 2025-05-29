package io.github.devhenriquelopes.Vendas.domain.repository;

import io.github.devhenriquelopes.Vendas.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    // Consulta SQL nativa para encontrar clientes pelo nome (corrigida)
    @Query(value = "select * from Cliente c where c.nome like %:nome%", nativeQuery = true)
    List<Cliente> encontrarPorNome(@Param("nome") String nome);

    // Consulta JPQL para deletar cliente pelo nome (corrigida)
    @Transactional
    @Modifying
    @Query("delete from Cliente c where c.nome = :nome")
    void deleteByNome(@Param("nome") String nome);

    // Verifica se um cliente existe pelo nome
    boolean existsByNome(String nome);
    @Query("select c from Cliente c left join fetch c.pedidos ")
    Cliente findClienteFetchPedidos( Integer id);
}
