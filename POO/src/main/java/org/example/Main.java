package org.example;

public class Main {
    public static void main(String[] args) {
        // ATRIBUTOS.
        String nome= "Marta";
        int idade = 25;

        //Clientes cliente1 = new Clientes();

        //cliente1.nome = "Marta";
        //cliente1.idade = 25;

        Clientes clientes1 = new Clientes();
        clientes1.setNome("Marta");
        clientes1.setIdade(25);

        System.out.println("nome:" + clientes1.getNome());
        System.out.println("idade:" + clientes1.getIdade());

    // FUNCIONARIOS
        funcionarios funcionario1 = new funcionarios("Maria", 35, "maria@gmail.com");
//        funcionario1.setNome("Joao");
//        funcionario1.setIdade(30);
//        funcionario1.setEmail("joao@gmail.com");

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Email: " + funcionario1.getEmail());

        //produtos
       produtos produto1 = new produtos("PS5", 2600, 300 );
//        produto1.setNome("PS5");
//        produto1.setPreco(2600);
//        produto1.setQuantidade(300);

        System.out.println("\n ==Produtos==");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Quantidade: " + produto1.getQuantidade());


    //Livros
        livros livro1 = new livros("Biblia sagrada", "Deus", 1000,25.00);
        livros livro2 = new livros ("Harry potter", "JK Rowling",  4000, 40.00);


        System.out.println("\n ==Livros==");
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Paginas: " + livro1.getPaginas());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Paginas: " + livro2.getPaginas());
        System.out.println("Preço: " + livro2.getPreco());


    }
}