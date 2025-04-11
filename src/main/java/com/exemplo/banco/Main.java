package com.exemplo.banco;

import com.exemplo.banco.entity.Conta;
import com.exemplo.banco.service.BancoService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoPU");
        EntityManager em = emf.createEntityManager();

        BancoService banco = new BancoService(em);

        Conta c1 = banco.criarConta("Gabriel", 1000);
        Conta c2 = banco.criarConta("Maria", 500);

        banco.transferir(c1.getId(), c2.getId(), 200);

        System.out.println("Extrato de Gabriel:");
        banco.extrato(c1.getId()).forEach(System.out::println);

        System.out.println("Extrato de Maria:");
        banco.extrato(c2.getId()).forEach(System.out::println);

        em.close();
        emf.close();
    }
}
