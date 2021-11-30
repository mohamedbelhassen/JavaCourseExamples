package com.exemple.ch4.exemple4;

public class TestEx4 {
    public static void main(String[] args) {
        Fille f = new Fille(2);
        Mere m = f;
        m.print();
        //affiche:
        // base 2
        //dérivée
    }
}

