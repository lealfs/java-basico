package org.example.Funcionario2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1,"Leal",6500,Setor.FINANCEIRO,Sexo.MASCULINO,18);

        System.out.println(funcionario1.toString());

    }
}
