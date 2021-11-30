package com.exemple.ch4.exemple5;

abstract class Felin {
    boolean afaim = true;
    abstract void parler();
    void appeler(){
        System.out.println("Le felin est appelé");
        if (afaim)
            parler();
    }
}
