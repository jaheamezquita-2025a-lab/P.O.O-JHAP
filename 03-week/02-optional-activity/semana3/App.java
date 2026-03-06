package com.corhuila.poo.semana3;

public class App {

    public static void main(String[] args) {

        TarjetaTransporte tarjeta = new TarjetaTransporte("T001", 5000);

        System.out.println(tarjeta.resumen());

        tarjeta.pagarPasaje(2500);
        System.out.println(tarjeta.resumen());

        tarjeta.recargar(3000);
        System.out.println(tarjeta.resumen());

        tarjeta.desactivar();
        tarjeta.pagarPasaje(1000);

        System.out.println("Saldo actual: " + tarjeta.getSaldo());
    }
}