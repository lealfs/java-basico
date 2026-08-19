package org.example;

public class Boletim {
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8.5;
        double nota2 = 6.0;


        double media = (nota1 + nota2) / 2;

        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Media final: " + media);

        if (media >= 7.0) {
            System.out.println("Resultado: APROVADO!");
        } else {
            System.out.println("Resultado: REPROVADO. ");
        }
    }
}
