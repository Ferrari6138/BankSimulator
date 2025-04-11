package com.exemplo.banco.entity;

import jakarta.persistence.*;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titular;
    private double saldo;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
}
