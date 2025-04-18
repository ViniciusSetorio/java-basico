package com.loiane.cursojava.aula27.labs;

public class ContaCorrente {

    String numConta;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;

    boolean realizarSaque (double saque) {
        if (saque <= saldo) {
            saldo -= saque;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;

                if (limite >= saque) {
                    saldo -= saque;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    boolean verificarEspecial() {
        return saldo < 0;
    }

    void depositar (double valor) {
        saldo += valor;
        System.out.println("Deposito realizado!");
    }

    void consultarSaldo () {
        System.out.println("Saldo atual: " + saldo);
    }
}
