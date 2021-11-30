package com.exemple.ExamenFauteuil;



public class Fauteuil {
    private double prix;
    private String nature_tissu;
    private String metal;

    Fauteuil(double prix, String nature_tissu, String metal) {
        this.prix = prix;
        this.nature_tissu = nature_tissu;
        this.metal = metal;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public String getNature_tissu() {
        return nature_tissu;
    }

    public String getMetal() {
        return metal;
    }

    public String toString() {
        return "Prix: " + prix + " / nature tissu: " + nature_tissu + " / metal: " + metal;
    }

}


