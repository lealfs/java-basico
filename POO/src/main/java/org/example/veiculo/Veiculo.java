package org.example.veiculo;

public class Veiculo {
    private String placa;
    private String cor;
    private int NumeroPassageiros;
    private double CapacidadeTanque;
    private int VelocidadeMaxima;
    private double ConsumoMedio;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return NumeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        NumeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeTanque() {
        return CapacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        CapacidadeTanque = capacidadeTanque;
    }

    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return ConsumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        ConsumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", NumeroPassageiros=" + NumeroPassageiros +
                ", CapacidadeTanque=" + CapacidadeTanque +
                ", VelocidadeMaxima=" + VelocidadeMaxima +
                ", ConsumoMedio=" + ConsumoMedio +
                '}';
    }

    public Veiculo(String placa, String cor, int numeroPassageiros, double capacidadeTanque, int velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        NumeroPassageiros = numeroPassageiros;
        CapacidadeTanque = capacidadeTanque;
        VelocidadeMaxima = velocidadeMaxima;
        ConsumoMedio = consumoMedio;
    }
}
