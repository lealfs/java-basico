package org.example;

public class metodosString {
    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silva";

        // exibindo a quantidade de caracteres
        System.out.println("tamanho do nome:" + nome.length());
        System.out.println("tamanho do sobrenome:"+ sobrenome.length());

        // concatendo nome + sobrenome
        String nomeCompleto = nome.concat(" "). concat(sobrenome);

        // exibindo nome completo usando métodos String - Maiúscula
        System.out.println("Concatenação Maiúscula:" + nomeCompleto.toUpperCase());

        // exibindo nome completo usando metodos String - minúsculas
        System.out.println("Concatenação Minúscula:" + nomeCompleto.toLowerCase());
    }
}
