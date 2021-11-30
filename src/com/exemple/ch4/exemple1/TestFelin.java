package com.exemple.ch4.exemple1;

public class TestFelin {
    public static void main(String[] args) {
        //Exemple 1
        Tigre tigre = new Tigre();
        tigre.chasser();//Ok
        tigre.appeler();//Ok: méthode héritée de la classe Felin

        tigre.afaim=false;
        tigre.appeler(); // Si n'est pas faim, l'animal ne parle pas
    }
}
