package com.exemple.ExamenFauteuil;

public class FauteuilRoulant extends Fauteuil {
    private RoueAvant r1,r2;
    private RoueArriere r3,r4;

    public FauteuilRoulant(double prix, String nature_tissu, String metal, RoueAvant r1, RoueAvant r2, RoueArriere r3, RoueArriere r4) {
        super(prix, nature_tissu, metal);
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
    }

    @Override
    public String toString() {
        return "FauteuilRoulant{}: "+ super.toString();
    }
}