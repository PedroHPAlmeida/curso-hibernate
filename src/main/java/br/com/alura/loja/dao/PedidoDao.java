package br.com.alura.loja.dao;

import br.com.alura.loja.model.Pedido;

import javax.persistence.EntityManager;

public class PedidoDao {

    private EntityManager entityManager;

    public PedidoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Pedido pedido){
        this.entityManager.persist(pedido);
    }
}
