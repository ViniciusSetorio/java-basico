package com.loiane.cursojava.aula43.labs.Exer02;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return getRendaBruta() * 0.01;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + getNome() + '\'' +
                ", rendaBruta='" + getRendaBruta() + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", imposto a ser pago = " + calcularImposto() +
                '}';
    }
}
