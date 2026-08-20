package org.example;

public class produtos {
    private String Nome;
    private double Preco;
    private int Quantidade;

    public produtos(String nome, double preco, int quantidade) {
        Nome = nome;
        Preco = preco;
        Quantidade = quantidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
}

