package com.loiane.cursojava.aula43.labs.Exer01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial() {
        super();
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        double saldoComLimite = getSaldo() + limite;

        if ((saldoComLimite - valor) >= 0) {
            setSaldo(getSaldo() - valor);
            return true;

        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "nomeCliente='" + getNomeCliente() + '\'' +
                ", numConta='" + getNumConta() + '\'' +
                ", saldo=" + getSaldo() +
                ", limite=" + limite +
                '}';
    }
}
