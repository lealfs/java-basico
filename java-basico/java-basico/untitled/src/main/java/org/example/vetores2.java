package org.example;

import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double soma = 0;

        for (int i = 0; i < 2; i++) {
            double notaTemporaria = -1;


            while (notaTemporaria < 0 || notaTemporaria > 10) {
                System.out.println("Digite a " + (i + 1) + "ª nota (entre 0 e 10): ");
                notaTemporaria = ler.nextDouble();

                if (notaTemporaria < 0 || notaTemporaria > 10) {
                    System.out.println("Nota inválida! Por favor, digite um valor entre 0 e 10.");
                }
            }

            notas[i] = notaTemporaria;
            soma += notas[i];
        }

        System.out.println("\nExibindo as notas: ");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }


        double media = soma / notas.length;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Média aritmética: %.2f\n", media);

        ler.close();
    }
}