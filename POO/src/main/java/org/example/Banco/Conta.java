package org.example.Banco;

public class Conta {
    private String Banco;
    private int Agência;
    private String NumeroConta;
    private String TipoDaConta;
    private double SaldoAtual;
    private double LimiteDisponivel;

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public int getAgência() {
        return Agência;
    }

    public void setAgência(int agência) {
        Agência = agência;
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        NumeroConta = numeroConta;
    }

    public String getTipoDaConta() {
        return TipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        TipoDaConta = tipoDaConta;
    }

    public double getSaldoAtual() {
        return SaldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        SaldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return LimiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        LimiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Banco='" + Banco + '\'' +
                ", Agência=" + Agência +
                ", NumeroConta='" + NumeroConta + '\'' +
                ", TipoDaConta='" + TipoDaConta + '\'' +
                ", SaldoAtual=" + SaldoAtual +
                ", LimiteDisponivel=" + LimiteDisponivel +
                '}';
    }

    public Conta(String banco, int agência, String numeroConta, String tipoDaConta, double saldoAtual, double limiteDisponivel) {
        Banco = banco;
        Agência = agência;
        NumeroConta = numeroConta;
        TipoDaConta = tipoDaConta;
        SaldoAtual = saldoAtual;
        LimiteDisponivel = limiteDisponivel;
    }
}
