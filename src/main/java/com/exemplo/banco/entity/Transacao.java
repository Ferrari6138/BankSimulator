package com.exemplo.banco.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valor;
    private LocalDateTime dataHora;

    @ManyToOne
    private Conta origem;

    @ManyToOne
    private Conta destino;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public Conta getOrigem() { return origem; }
    public void setOrigem(Conta origem) { this.origem = origem; }
    public Conta getDestino() { return destino; }
    public void setDestino(Conta destino) { this.destino = destino; }
}
