package com.exemplo.banco.repository;

import com.exemplo.banco.entity.Conta;
import com.exemplo.banco.entity.Transacao;
import jakarta.persistence.EntityManager;
import java.util.List;

public class TransacaoRepository {
    private EntityManager em;

    public TransacaoRepository(EntityManager em) {
        this.em = em;
    }

    public void salvar(Transacao transacao) {
        em.getTransaction().begin();
        em.persist(transacao);
        em.getTransaction().commit();
    }

    public List<Transacao> listarPorConta(Conta conta) {
        return em.createQuery("FROM Transacao t WHERE t.origem = :conta OR t.destino = :conta", Transacao.class)
                .setParameter("conta", conta)
                .getResultList();
    }
}
