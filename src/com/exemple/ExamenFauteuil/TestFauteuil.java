package com.exemple.ExamenFauteuil;


public class TestFauteuil {
    public static void main(String[] args) {
        Fauteuil liste_fauteuils[]= new Fauteuil[3];
        Fauteuil f1= new Fauteuil(150,"cuir","Fer");
        liste_fauteuils[0]=f1;
        RoueAvant r1= new RoueAvant();
        RoueAvant r2= new RoueAvant();
        RoueArriere r3= new RoueArriere();
        RoueArriere r4= new RoueArriere();
        liste_fauteuils[1]= new FauteuilRoulant(300, "semi-cuir", "aluminium", r1,r2,r3,r4);
        MoteurElectFauteuil m= new MoteurElectFauteuil();
        RoueAvant rfe1= new RoueAvant();
        RoueAvant rfe2= new RoueAvant();
        RoueArriere rfe3= new RoueArriere();
        RoueArriere rfe4= new RoueArriere();
        liste_fauteuils[2]= new FauteuilRoulantElect(500,"cuir luxe","alu",rfe1,rfe2,rfe3,rfe4,m);
        double total=0;
        for (int i= 0; i<liste_fauteuils.length;i++){
            total+=liste_fauteuils[i].getPrix();
            System.out.println(liste_fauteuils[i]);
        }
        System.out.println("Prix total: "+total);
    }
}
