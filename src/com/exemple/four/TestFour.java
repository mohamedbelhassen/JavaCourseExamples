package com.exemple.four;

public class TestFour {
/*
    public static void main(String[] args) {
        Four petitFour = new Four();
        petitFour.capacite = 30;
        petitFour.puissance = 180;

        Four grandFour = new Four();
        grandFour.capacite = 55;
        grandFour.puissance = 260;

        //petitFour.cuire();
        System.out.println("");
        //grandFour.cuire();
    }*/

    public static void main(String[] args) {
        Four grandFour = new Four();
        grandFour.capacite = 55;
        grandFour.puissance = 260;

        Aliment cake = new Aliment();
        cake.nom = "cake aux fruits";
        cake.estCuit = false;
        cake.manger();
        System.out.println("");
        grandFour.cuire(cake);
        System.out.println("");
        cake.manger();
//        boolean b= (grandFour instanceof Four);
        //System.out.println(b);

    }
}