package org.example.computador;

public class Processador extends Componentes {
    private String potenciaemMhz;

    public String getPotenciaemMhz() {
        return potenciaemMhz;
    }

    public void setPotenciaemMhz(String potenciaemMhz) {
        this.potenciaemMhz = potenciaemMhz;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "potenciaemMhz='" + potenciaemMhz + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public Processador(String marca, String modelo, String potenciaemMhz) {
        super(marca, modelo);
        this.potenciaemMhz = potenciaemMhz;
    }
}
