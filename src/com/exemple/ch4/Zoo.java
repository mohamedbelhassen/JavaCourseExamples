package com.exemple.ch4;

public class Zoo {
    int MAX;
    Felin[]liste;
    int compteur=0;
    Zoo(int taille){
        MAX=taille;
        liste= new Felin[MAX];
    }
    void addFelin(Felin newFelin){
        if(compteur<MAX)
            liste[compteur++]= newFelin;
        else
            System.out.println("Pas d'emplacement libre");
    }
    final void appeler(){//cette méthode ne peut pas être redéfinie dans une sous-classe
        for (int i=0;i<compteur;i++) {
            System.out.println("felin N°: "+i+ " est appelé");
            liste[i].parler();//appel polymorphe
        }
    }
}
