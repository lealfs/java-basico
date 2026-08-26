package org.example.Banco;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta ("Banco do Brasil", 7129, "1945023481239468", "Corrente", 1500, 4500);
        Funcionario funcionario1 = new Funcionario (17232784, "Leal", "Bonfim, Salvador-BA", 719831434, "felipe@gmail.com", conta1);

        System.out.println("== CONTA BANCARIA ==");
        System.out.println(funcionario1.toString());
    }
}
