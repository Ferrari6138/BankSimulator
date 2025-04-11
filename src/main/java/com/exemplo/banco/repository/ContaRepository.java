package com.exemplo.banco.repository;

import com.exemplo.banco.entity.Conta;
import jakarta.persistence.EntityManager;
import java.util.List;

public class ContaRepository {
    private EntityManager em;

    public ContaRepository(EntityManager em) {
        this.em = em;
    }

    public void salvar(Conta conta) {
        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
    }

    public Conta buscar(Long id) {
        return em.find(Conta.class, id);
    }

    public void atualizar(Conta conta) {
        em.getTransaction().begin();
        em.merge(conta);
        em.getTransaction().commit();
    }

    public List<Conta> listarTodas() {
        return em.createQuery("FROM Conta", Conta.class).getResultList();
    }
}
