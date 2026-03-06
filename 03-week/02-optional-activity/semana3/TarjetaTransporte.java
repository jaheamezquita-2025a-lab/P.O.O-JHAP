package com.corhuila.poo.semana3;

public class TarjetaTransporte {

    private String codigo;
    private double saldo;
    private boolean activa;

    public TarjetaTransporte(String codigo, double saldoInicial) {
        this.codigo = codigo;

        if (saldoInicial < 0) {
            System.out.println("El saldo inicial no puede ser negativo");
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }

        this.activa = true;
    }

    public void recargar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        } else {
            System.out.println("Monto inválido");
        }
    }

    public void pagarPasaje(double valorPasaje) {
        if (!activa) {
            System.out.println("La tarjeta está desactivada");
        } else if (valorPasaje > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valorPasaje;
        }
    }

    public void activar() {
        activa = true;
    }

    public void desactivar() {
        activa = false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String resumen() {
        return "Codigo: " + codigo + " | Saldo: " + saldo + " | Activa: " + activa;
    }
}