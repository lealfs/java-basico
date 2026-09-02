package org.example.exemplo;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Joao", "23/08/2005", Sexo.MASCULINO, Setor.OPERACOES, 2600, "AB");
        Diretor diretor = new Diretor("Maria", "21/09/2005,", Sexo.FEMININO, Setor.FINANCEIRO, 5000);

        System.out.println(diretor.toString());
        diretor.admitir(motoboy);
        System.out.println(motoboy.toString());

    }
}
