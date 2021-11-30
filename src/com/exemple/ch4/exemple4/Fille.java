package com.exemple.ch4.exemple4;

class Fille extends Mere{
    boolean flag;
    Fille(int a){
        super(a);
        flag=true;
    }
    void print(){
        super.print();
        System.out.println("dérivée");
    }
}

