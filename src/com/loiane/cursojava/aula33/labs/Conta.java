package com.loiane.cursojava.aula33.labs;

public class Conta {

    private String numConta;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado;

    public Conta() {
    }

    public Conta(String numConta, double saldo, boolean especial, double limiteEspecial, double valorEspecialUsado) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    private boolean verificarEspecial(double saque) {
        if (isEspecial()) {
            double limite = this.limiteEspecial + this.saldo;

            if (limite >= saque) {
                this.saldo -= saque;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean realizarSaque (double saque) {
        if (saque <= getSaldo()) {
            this.saldo -= saque;
            return true;
        } else {
           return verificarEspecial(saque);
        }
    }

    public boolean verificarEspecial() {
        return saldo < 0;
    }

    public void depositar (double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado!");
    }

    public void consultarSaldo () {
        System.out.println("Saldo atual: " + this.saldo);
    }
}
