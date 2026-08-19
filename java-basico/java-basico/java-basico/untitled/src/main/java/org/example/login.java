package org.example;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        // Criando o leitor de entradas do console
        Scanner scanner = new Scanner(System.in);

        // Definindo as credenciais corretas para validação
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";

        // Solicitando os dados ao usuário
        System.out.print("Digite o seu nome de login: ");
        String login = scanner.nextLine();

        System.out.print("Digite a sua senha: ");
        String senha = scanner.nextLine();

        // Verificando se as credenciais correspondem
        if (login.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Bem vindo, usuario logado!");
        } else {
            System.out.println("Nome de usuario ou senha invalidos");
        }

        // Fechando o scanner
        scanner.close();
    }
}