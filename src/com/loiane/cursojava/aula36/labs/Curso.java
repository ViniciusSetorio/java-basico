package com.loiane.cursojava.aula36.labs;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {
    }

    public Curso(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double calcularMediaTurma() {
        double soma = 0;

        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }

        return soma / alunos.length;
    }
}