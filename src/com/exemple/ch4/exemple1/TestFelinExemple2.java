package com.exemple.ch4.exemple1;

public class TestFelinExemple2 {
    public static void main(String[] args) {
          //Exemple 2

        Felin felin;
        Tigre tigre = new Tigre();
        felin = tigre;
        felin.parler();
        //felin.chasser();
        //tigre = felin;
        tigre= (Tigre) felin;
        tigre.parler();
        tigre.chasser();
        Chat chat = new Chat();
        //felin = chat;
        //Lion lion = (Lion)felin;
        Chat chat2 = new Chat();
        Felin f= chat2;
        f.parler();

    }
}
