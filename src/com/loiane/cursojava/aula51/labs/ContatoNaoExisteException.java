package com.loiane.cursojava.aula51.labs;

public class ContatoNaoExisteException extends Exception {

    private final String nome;

    public ContatoNaoExisteException(String nome) {
        this.nome = nome;
    }

    @Override
    public String getMessage() {
        return "Contato " + nome + " não existe na agenda!";
    }
}
