package org.example.pessoafj;

public class Main {
    public static void main(String[] args) {
        Fisica fisica1 = new Fisica ("Ramon", "71988602666", "666.666.666-66", "333124124", "20/02/2008");
        Juridica juridica1 = new Juridica("Ramon Imports", "7128714134", "777.777.777-77", "23523547363");

        System.out.println(fisica1.toString());
        System.out.println(juridica1.toString());
    }
}
