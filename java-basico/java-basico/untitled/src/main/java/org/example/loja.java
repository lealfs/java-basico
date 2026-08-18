package org.example;

public class loja {
    public static void main(String[] args) {
        //Declaraçao de variaveis
        String nomeMercado = "mamao com açucar";
                double valorCompra = 250.0;
                int prestacoes = 5;

                double valorParcela = valorCompra / prestacoes;

        // exibindo os resultados
        System.out.println("--- Resumo da compra ----");
        System.out.println("Mercado: " + nomeMercado);
        System.out.println("Valor total: R$ " + valorCompra);
        System.out.println("Sua compra foi dividida em " + prestacoes);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);

    }
}
