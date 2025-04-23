package com.loiane.cursojava.aula43.labs.Exer02;

public class Teste {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.setNome("Contribuinte 01");
        pessoaFisica1.setRendaBruta(1000);

        PessoaFisica pessoaFisica2 = new PessoaFisica();
        pessoaFisica2.setNome("Contribuinte 02");
        pessoaFisica2.setRendaBruta(2000);

        PessoaFisica pessoaFisica3 = new PessoaFisica();
        pessoaFisica3.setNome("Contribuinte 03");
        pessoaFisica3.setRendaBruta(5000);

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        pessoaJuridica1.setNome("Contribuinte 04");
        pessoaJuridica1.setRendaBruta(3000);

        PessoaJuridica pessoaJuridica2 = new PessoaJuridica();
        pessoaJuridica2.setNome("Empresa 01");
        pessoaJuridica2.setRendaBruta(10000);

        PessoaJuridica pessoaJuridica3 = new PessoaJuridica();
        pessoaJuridica3.setNome("Empresa 02");
        pessoaJuridica3.setRendaBruta(100000);

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pessoaFisica1;
        contribuintes[1] = pessoaFisica2;
        contribuintes[2] = pessoaFisica3;
        contribuintes[3] = pessoaJuridica1;
        contribuintes[4] = pessoaJuridica2;
        contribuintes[5] = pessoaJuridica3;

        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte);
        }
    }
}
