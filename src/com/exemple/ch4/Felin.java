package com.exemple.ch4;

public class Felin {
    boolean afaim = true;
    public void parler(){
        System.out.println("Le felin parle");
    }
    void appeler(){
        System.out.println("Le felin est appelé");
        if (afaim)
            parler();
    }
}

