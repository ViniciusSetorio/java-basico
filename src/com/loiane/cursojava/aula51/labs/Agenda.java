package com.loiane.cursojava.aula51.labs;

import java.util.Arrays;

public class Agenda extends Contato {

    private final Contato[] contatos;

    public Agenda() {
        contatos = new Contato[1];
    }

    public void adicionarContato(Contato contato) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                cheia = false;
            }
        }

        if (cheia) {
            throw new AgendaCheiaException();
        }
    }

    public int consultarContato(String nome) throws ContatoNaoExisteException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i].getNome().equals(nome)) {
                return i;
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + Arrays.toString(contatos) +
                '}';
    }
}