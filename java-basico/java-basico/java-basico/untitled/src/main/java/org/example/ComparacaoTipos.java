package org.example;

public class ComparacaoTipos {
    public static void main(String[] args) {
        //Declaração de variaveis
        String nomeUsuario= "Lorrane";
        int senha = 123;

        // Comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Lorrane");
        boolean resultadoSenha = (senha == 456);

        // Exibindo resultados
        System.out.println("O nome do usuário está correto?" + resultadoNome);
        System.out.println("A senha está correta?" + resultadoSenha);
    }
}
