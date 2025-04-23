package com.loiane.cursojava.aula43.labs.Exer01;

public class TesteContaBancaria {

    public static void main(String[] args) {

        System.out.println("Testando a Conta Bancária");
        ContaBancaria contaBancaria = new ContaBancaria("Vinicius", "con123", 0);

        contaBancaria.depositar(100);
        System.out.println(contaBancaria);

        realizarSaque(contaBancaria, 101);

        System.out.println(contaBancaria);


        System.out.println("Testando a Conta Poupança");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Vinicius", "con123", 0, 22);

        contaPoupanca.depositar(100);
        System.out.println(contaPoupanca);

        realizarSaque(contaPoupanca, 101);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado!");
        } else {
            System.out.println("Hoje não é dia de rendimento.");
        }
        System.out.println(contaPoupanca);


        System.out.println("Testando a Conta Especial");
        ContaEspecial contaEspecial = new ContaEspecial("Vinicius", "con123", 0, 50);

        contaEspecial.depositar(100);
        System.out.println(contaEspecial);

        realizarSaque(contaEspecial, 150);

        System.out.println(contaEspecial);
    }

    public static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
