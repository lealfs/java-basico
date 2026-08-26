package org.example.Banco;

public class Funcionario {
    private int CodigoFuncionario;
    private String Nome;
    private String Endereço;
    private int Telefone;
    private String Email;
    private Conta Conta;

    public int getCodigoFuncionario() {
        return CodigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        CodigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public org.example.Banco.Conta getConta() {
        return Conta;
    }

    public void setConta(org.example.Banco.Conta conta) {
        Conta = conta;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "CodigoFuncionario=" + CodigoFuncionario +
                ", Nome='" + Nome + '\'' +
                ", Endereço='" + Endereço + '\'' +
                ", Telefone=" + Telefone +
                ", Email='" + Email + '\'' +
                ", Conta=" + Conta +
                '}';
    }

    public Funcionario(int codigoFuncionario, String nome, String endereço, int telefone, String email, org.example.Banco.Conta conta) {
        CodigoFuncionario = codigoFuncionario;
        Nome = nome;
        Endereço = endereço;
        Telefone = telefone;
        Email = email;
        Conta = conta;
    }
}
