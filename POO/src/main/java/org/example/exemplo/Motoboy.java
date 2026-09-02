package org.example.exemplo;

public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public Motoboy(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;


    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                ", salario Final" + this.getSalarioFinal() +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;

    }
}

