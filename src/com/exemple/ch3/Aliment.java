package com.exemple.ch3;

public class Aliment {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstCuit() {
        return estCuit;
    }

    public void setEstCuit(boolean estCuit) {
        this.estCuit = estCuit;
    }

    private String nom;
    private boolean estCuit;
    public void manger(){
        if(estCuit){
            System.out.println("Miam Miam! cet aliment "+nom+" est cuit");
        }else{
            System.out.println("Breek, cet aliment "+ nom+" est cru");
        }
    }
}
