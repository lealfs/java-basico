package org.example.computador2;

public class Armazenamento extends Componentes{
    private String capacidade;
    private String tipoDeConexao;

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "Armazenamento{" +
                "capacidade='" + capacidade + '\'' +
                ", tipoDeConexao='" + tipoDeConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public Armazenamento(String marca, String modelo, String capacidade, String tipoDeConexao) {
        super(marca, modelo);
        this.capacidade = capacidade;
        this.tipoDeConexao = tipoDeConexao;
    }
}
