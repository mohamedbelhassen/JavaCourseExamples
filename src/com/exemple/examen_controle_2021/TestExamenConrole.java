package com.exemple.examen_controle_2021;

import java.util.Scanner;

public class TestExamenConrole {
    public static void main(String[] args) {
        int n=1;
        if(args.length==1){
            n=Integer.parseInt(args[0]);
        }
        else{
            System.out.println("Veuilez saisir un argument entier");
            System.exit(1);
        }
        Personne []liste= new Personne[n];
        for(int i=0;i<n;i++){
            System.out.println("Saisir 0 pour CA ou 1 pour enseignant");
            Scanner sc= new Scanner(System.in);
            int choix=sc.nextInt();
            if(choix==1){
                liste[i]= new Enseignant();
            }else
            {
                liste[i]= new CA();
            }
            liste[i].saisie();


        }
        for(int i=0;i<n;i++){
            liste[i].affiche();
        }

    }
}
