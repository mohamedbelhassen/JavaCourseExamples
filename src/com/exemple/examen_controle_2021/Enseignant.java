package com.exemple.examen_controle_2021;

import java.util.Scanner;

public class Enseignant extends Personne{
    String departement;
    String[]matieres;

    void saisie(){
        super.saisie();
        Scanner sc= new Scanner(System.in);
        System.out.println("Saisir departement:");
        departement= sc.nextLine();
        System.out.println("Saisir nombre de matières:");
        int n= sc.nextInt();
        matieres= new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Donnez le nom de la matière N°: "+(i+1));
            matieres[i]=sc.nextLine();
        }
    }


    void affiche(){
        super.affiche();
        System.out.println("-Departement: "+departement);
        System.out.println("Les matières enseignées sont: ");
        for (String matiere : matieres) {
            System.out.println(matiere);
        }
    }

}
