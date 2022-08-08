package OverloadedMethods;

public class Calculator {
    private int suma(int a, int b) {
        int suma = a + b;
        return suma;
    }
    private int scad(int a, int b, int c){
        int scad = a+b-c;
        return scad;
    }
    public double adun(int a, int b, int c){
        double adun= a+b+c;
        return adun;
    }
    public static void main(String[]args){
    Calculator myCalculator=new Calculator();
    myCalculator.adun(3,4,5);
        System.out.println("Suma este " + myCalculator.suma ( 3,4));
        System.out.println("Scaderea este " + myCalculator.scad(3,4,5));
        System.out.println("Rezultatul este " + myCalculator.adun(3,4,5));
    }
}