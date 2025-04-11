package com.exemplo.banco.service;

import com.exemplo.banco.entity.Conta;
import com.exemplo.banco.entity.Transacao;
import com.exemplo.banco.repository.ContaRepository;
import com.exemplo.banco.repository.TransacaoRepository;
import jakarta.persistence.EntityManager;

import java.time.LocalDateTime;
import java.util.List;

public class BancoService {
    private ContaRepository contaRepo;
    private TransacaoRepository transacaoRepo;

    public BancoService(EntityManager em) {
        this.contaRepo = new ContaRepository(em);
        this.transacaoRepo = new TransacaoRepository(em);
    }

    public Conta criarConta(String titular, double saldoInicial) {
        Conta conta = new Conta();
        conta.setTitular(titular);
        conta.setSaldo(saldoInicial);
        contaRepo.salvar(conta);
        return conta;
    }

    public void transferir(Long origemId, Long destinoId, double valor) {
        Conta origem = contaRepo.buscar(origemId);
        Conta destino = contaRepo.buscar(destinoId);

        if (origem.getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }

        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);

        contaRepo.atualizar(origem);
        contaRepo.atualizar(destino);

        Transacao t = new Transacao();
        t.setValor(valor);
        t.setDataHora(LocalDateTime.now());
        t.setOrigem(origem);
        t.setDestino(destino);

        transacaoRepo.salvar(t);
    }

    public List<Transacao> extrato(Long contaId) {
        Conta conta = contaRepo.buscar(contaId);
        return transacaoRepo.listarPorConta(conta);
    }
}
