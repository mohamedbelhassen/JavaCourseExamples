package com.exemple.ch4.exemple5;

public class TestEx5 {
    public static void main(String[] args) {
//        Felin f = new Felin();
//        f.parler();
        Lion l = new Lion();
        l.parler();
        Object t = new Tigre();
        if (t instanceof Tigre)
            ( (Tigre)t).parler();
    }
}
