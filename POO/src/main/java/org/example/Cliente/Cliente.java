package org.example.Cliente;

public class Cliente {
    private String nome;
    private int Idade;
    private Pet pet;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", Idade=" + Idade +
                ", pet=" + pet +
                '}';
    }

    public Cliente(String nome, int idade, Pet pet) {
        this.nome = nome;
        Idade = idade;
        this.pet = pet;
    }
}
