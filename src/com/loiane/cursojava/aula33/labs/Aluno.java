package com.loiane.cursojava.aula33.labs;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[]nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][3];
    }

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][3];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome do curso: " + this.nomeCurso);

        for (int i = 0; i < nomeDisciplinas.length; i++) {
            System.out.println("Disciplina " + (i+1)+ ": " + this.nomeDisciplinas[i]);
        }

        for (int i = 0; i < this.notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina - " + this.nomeDisciplinas[i]);
            for (int j = 0; j < this.notasDisciplinas[i].length; j++) {
                System.out.print("Nota " + (j+1) + ": " + this.notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void verificarMedia(double media, String disciplina) {
        if (media >= 7) {
            System.out.println("Aluno aprovado em " + disciplina);
        } else {
            System.out.println("Aluno reprovado em " + disciplina);
        }
    }

    public void verificarAprovacao(String disciplina) {
        boolean encontrou = false;
        double soma = 0;
        double media;

        for (int i = 0; i < this.nomeDisciplinas.length; i++) {
            if (disciplina.equals(this.nomeDisciplinas[i])) {
                encontrou = true;

                for (int j = 0; j < this.notasDisciplinas[i].length; j++) {
                    soma += this.notasDisciplinas[i][j];
                }
                media = soma / this.notasDisciplinas[i].length;
                System.out.println("Média da disciplina " + disciplina + ": " + media);

                verificarMedia(media, disciplina);
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Disciplina inválida");
        }
    }

    public void setDisciplinaPos(int pos, String nomeDisciplina) {
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotaPosIJ(int posI, int posJ, double nota) {
        this.notasDisciplinas[posI][posJ] = nota;
    }
}