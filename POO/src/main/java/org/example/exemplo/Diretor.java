package org.example.exemplo;

public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 1.2;

    public double getPREMIO() {
        return PREMIO;
    }

    public Diretor(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);


    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase * this.PREMIO;
    }


    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir: " + funcionario.toString());


    }
}


