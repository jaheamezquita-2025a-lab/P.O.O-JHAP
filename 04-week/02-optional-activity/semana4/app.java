package com.corhuila.poo.semana4;

public class app {

    public static void main(String[] args) {

        ReservaHotel r1 = new ReservaHotel("R001", "Carlos", 3, 120000, true);

        ReservaHotel r2 = new ReservaHotel("R002", "Maria", 2, 100000);

        ReservaHotel r3 = new ReservaHotel("R003", "Luis", 1, 90000, false);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}