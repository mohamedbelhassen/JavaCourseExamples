package com.exemple.ch3;

public class Four {
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getPuissance() {
        return puissance;
    }

    public int getCapacite() {
        return capacite;
    }

    private int puissance;
    private int capacite;
    public Four(){
        puissance=250;
        capacite=20;
    }
    public Four(int puissance, int  capacite){
      this.puissance=puissance;
      this.capacite=capacite;
    }
    public void cuire(Aliment aliment){
        System.out.println("Je cuis un aliment: "+ aliment.getNom() );
        System.out.println("avec ma capacité: "+capacite+" litres");
        System.out.println("et avec ma puissance = "+puissance+" degré");
        aliment.setEstCuit(true);
    }
}
