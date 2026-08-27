package org.example.computador;

public class Memoria {
    private String capacidadedearmazenamento;

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadedearmazenamento='" + capacidadedearmazenamento + '\'' +
                '}';
    }

    public String getCapacidadedearmazenamento() {
        return capacidadedearmazenamento;
    }

    public void setCapacidadedearmazenamento(String capacidadedearmazenamento) {
        this.capacidadedearmazenamento = capacidadedearmazenamento;
    }

    public Memoria(String capacidadedearmazenamento) {
        this.capacidadedearmazenamento = capacidadedearmazenamento;
    }
}

