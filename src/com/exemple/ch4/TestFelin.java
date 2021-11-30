package com.exemple.ch4;

public class TestFelin {
    public static void main(String[] args) {

        //Exemple 1

//        Tigre tigre = new Tigre();
//        tigre.chasser();
//        tigre.appeler();

        //Exemple 1 extras

//        tigre.afaim=false;
//        tigre.appeler();

        //Exemple 2

        Felin felin;
        Tigre tigre = new Tigre();
//        felin = tigre;
//        felin.parler();
//        felin.chasser();
//        tigre = felin;
//        tigre= (Tigre) felin;
//        tigre.parler();
//        tigre.chasser();
//        Chat chat = new Chat();
//        felin = chat;
//        Lion lion = (Lion)felin;
        Chat chat = new Chat();
        Felin f= new Chat();
        f.parler();

    }
}
