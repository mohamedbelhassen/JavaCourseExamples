package com.exemple.examen_controle_2021;

import java.util.Scanner;

public class Personne {
    String nom;
    String prenom;
    long cin;
    void saisie(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Saisir Nom:");
        nom= sc.nextLine();

        System.out.println("Saisir Preom:");
        prenom= sc.nextLine();

        System.out.println("Saisir CIN:");
        cin= sc.nextLong();
    }

    void affiche(){
        //System.out.println("Détails de la personne: ");
        System.out.println("-Nom: "+nom);
        System.out.println("-Prom: "+prenom);
        System.out.println("- cin: "+cin);
    }
}
