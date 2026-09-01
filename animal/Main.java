package org.example.animal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.println("Cachorro" + cachorro.emitirSom());
        System.out.println("Cachorro" + cachorro.comer());
        System.out.println("Gato" + gato.emitirSom());
        System.out.println("Gato" + gato.comer());
        System.out.println("Galo" + galo.emitirSom());
        System.out.println("Galo" + galo.Comer());
        System.out.println("Pato" + pato.emitirSom());
        System.out.println("Pato" + pato.Comer());

    }
}
