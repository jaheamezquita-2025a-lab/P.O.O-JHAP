package com.corhuila.poo.semana2;

public class App {

    public static void main(String[] args) {

        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        p2 = p1;

        System.out.println("\nDespués de p2 = p1");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        Producto pNull = null;
        System.out.println("\npNull = " + pNull);
    }
}