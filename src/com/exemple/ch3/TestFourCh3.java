package com.exemple.ch3;

public class TestFourCh3 {
    public static void main(String[] args) {
        Four f1= new Four();
        //f1.puissance=280;
        //f1.capacite=30;
        f1.setPuissance(260);
        System.out.println("capacité de f1: "+f1.getCapacite());
        Aliment viande= new Aliment();
        viande.setNom("viande");
        viande.setEstCuit(false);
        System.out.println("la viande est cuit: "+viande.isEstCuit());
        viande.manger();
        f1.cuire(viande);
        System.out.println("la viande est cuit: "+viande.isEstCuit());
        viande.manger();


    }
}
