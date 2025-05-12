package com.loiane.cursojava.aula51.labs;

public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda cheia!";
    }
}