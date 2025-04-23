package com.loiane.cursojava.aula43.labs.Exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            setSaldo(getSaldo() + (getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        return "ContaPoupanca{" +
                "nomeCliente='" + getNomeCliente() + '\'' +
                ", numConta='" + getNumConta() + '\'' +
                ", saldo=" + getSaldo() +
                ", diaRendimento=" + diaRendimento +
                '}';
    }
}