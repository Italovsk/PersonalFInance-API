package model;

import java.time.LocalDate;

public class Transacao {
    private String descricao;
    private double valor;
    private String tipo; // "RECEITA" ou "DESPESA"
    private LocalDate data;

    // Construtor: define como criar uma nova transação
    public Transacao(String descricao, double valor, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.data = LocalDate.now(); // Pega a data atual automaticamente
    }

    // Getters: permitem que outras partes do código leiam os dados protegidos
    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }
    public String getTipo() { return tipo; }
    public LocalDate getData() { return data; }
}