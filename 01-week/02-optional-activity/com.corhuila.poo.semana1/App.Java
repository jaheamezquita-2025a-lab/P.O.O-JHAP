package com.corhuila.poo.semana1.app;
;

public class App {
    public static void main(String[] args) {
        Tarea t1 = new Tarea("Estudiar", "Repasar POO");
        Tarea t2 = new Tarea("Ejercicio", "30 minutos");
        Tarea t3 = new Tarea("Leer", "20 paginas");

        System.out.println(t1.resumen());
        System.out.println(t2.resumen());
        System.out.println(t3.resumen());

        t1.marcarComoHecha();
        t3.marcarComoHecha();

        System.out.println(t1.resumen());
        System.out.println(t2.resumen());
        System.out.println(t3.resumen());
    }
}