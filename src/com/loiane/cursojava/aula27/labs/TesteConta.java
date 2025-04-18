package com.loiane.cursojava.aula27.labs;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.saldo = -10;

        boolean saqueEfetuado = contaCorrente.realizarSaque(10);
        System.out.println("Saque de 10 reais");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado!");
            contaCorrente.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente.");
        }

        boolean tetSaque = contaCorrente.realizarSaque(500);
        System.out.println("Tentando sacar 500 reais");
        if (tetSaque) {
            System.out.println("Saque efetuado!");
            contaCorrente.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Deposito de 500 reais");
        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();

        if (contaCorrente.verificarEspecial()) {
            System.out.println("Usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        contaCorrente.realizarSaque(600);
        contaCorrente.consultarSaldo();

        if (contaCorrente.verificarEspecial()) {
            System.out.println("Usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}
