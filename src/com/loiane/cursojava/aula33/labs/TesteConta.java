package com.loiane.cursojava.aula33.labs;

public class TesteConta {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setNumConta("12345");
        conta.setSaldo(-10);
        conta.setEspecial(true);
        conta.setLimiteEspecial(600);
        conta.setValorEspecialUsado(0);

        boolean saqueEfetuado = conta.realizarSaque(10);
        System.out.println("Saque de 10 reais");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado!");
            conta.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente.");
        }

        boolean tetSaque = conta.realizarSaque(500);
        System.out.println("Tentando sacar 500 reais");
        if (tetSaque) {
            System.out.println("Saque efetuado!");
            conta.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Deposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarEspecial()) {
            System.out.println("Usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();

        if (conta.verificarEspecial()) {
            System.out.println("Usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}
