package br.com.alura.loja.dao;

import br.com.alura.loja.model.Pedido;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class PedidoDao {

    private EntityManager entityManager;

    public PedidoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Pedido pedido){
        this.entityManager.persist(pedido);
    }

    public BigDecimal valorTotalVendido(){
        String jpql = "SELECT SUM(p.valorTotal) FROM Pedido AS p";
        return entityManager.createQuery(jpql, BigDecimal.class)
                .getSingleResult();
    }
}
