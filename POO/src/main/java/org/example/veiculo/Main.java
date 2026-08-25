package org.example.veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("RTU3D34", "Branco", 4, 47, 164, 13.4);
        Livro livro1 = new Livro("Conto de fadas", "Leal", "978-85-473-1928-3", 67, 67);

        System.out.println("==Veiculo==");
        System.out.println(veiculo1.toString());


        System.out.println("==Livro==");
        System.out.println(livro1.toString());
    }
}
