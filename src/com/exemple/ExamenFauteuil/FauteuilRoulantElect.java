package com.exemple.ExamenFauteuil;


public class FauteuilRoulantElect extends FauteuilRoulant{
    MoteurElectFauteuil moteur;

    public FauteuilRoulantElect(double prix, String nature_tissu, String metal, RoueAvant r1, RoueAvant r2, RoueArriere r3, RoueArriere r4, MoteurElectFauteuil moteur) {
        super(prix, nature_tissu, metal, r1, r2, r3, r4);
        this.moteur = moteur;
    }
    @Override
    public String toString() {
        return "FauteuilRoulantElect{}: "+ super.toString();
    }
}


