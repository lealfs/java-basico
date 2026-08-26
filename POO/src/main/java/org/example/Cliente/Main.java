package org.example.Cliente;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet ("Ney", 1, "Pitbull");
        Cliente cliente1 = new Cliente ("Leal", 18, pet1);

        System.out.println("== CLIENTE E PET ==");
        System.out.println(cliente1.toString());
    }
}
