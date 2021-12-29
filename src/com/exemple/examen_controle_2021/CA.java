package com.exemple.examen_controle_2021;

import java.util.Scanner;

public class CA extends Personne{
    String fonction;
    void saisie(){
        super.saisie();
        Scanner sc= new Scanner(System.in);
        System.out.println("Saisir Fonction:");
        fonction= sc.nextLine();
    }
    void affiche(){
        super.affiche();
        System.out.println("-Fonction: "+fonction);
    }
}
