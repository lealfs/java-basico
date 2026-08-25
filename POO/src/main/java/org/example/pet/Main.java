package org.example.pet;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Astro",  2, "pinscher", "Pequeno", "Ração");
        Pet pet2 = new Pet("Yuri22", 1, "pitbull", "grande", "carme");

        System.out.println("==PET 1==");
        System.out.println(pet1.toString());


        System.out.println("==PET 2==");
        System.out.println(pet2.toString());

    }
}
