package com.loiane.cursojava.aula36.labs;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo() {
        String info = "Agenda: " + nome + "\n";

        for (Contato contato : contatos) {
            info += contato.obterInfo() + "\n";
        }

        return info;
    }
}
