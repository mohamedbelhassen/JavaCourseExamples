package com.exemple.interfacing;

public class Point implements Printable{
    private double x,y;
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void print() {
        System.out.println("X= "+x+" / Y= "+y);
    }
}
