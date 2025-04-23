package com.loiane.cursojava.aula43.labs.Exer03;

public class Teste {

    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(1.5);

        Animal[] animais = {camelo, tubarao, urso};

        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("-------------------");
        }
    }
}