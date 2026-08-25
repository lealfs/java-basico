package org.example.Funcionario;

public class Main {
    public static void main(String[] args) {
        // Instanciar classes: Livro e Funcionario
        Livro livro1 = new Livro("MAKTUB", "Paulo Coelho", 320, 150);
        Funcionarioo funcionario1 = new Funcionarioo ("Felipe",  18, "felipesantosleal@gmail.com");


        System.out.println("DADOS DO LIVRO");
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de Páginas: " + livro1.getPaginas());
        System.out.println("Preço");
    }
}