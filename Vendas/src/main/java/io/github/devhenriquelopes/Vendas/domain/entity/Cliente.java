package io.github.devhenriquelopes.Vendas.domain.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "cliente")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "nome", length = 100)
    private String nome;





    @OneToMany( mappedBy = "cliente",fetch = FetchType.LAZY)
    private Set<Pedido>pedidos;


    public Cliente() {
    }
    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public Cliente(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}

