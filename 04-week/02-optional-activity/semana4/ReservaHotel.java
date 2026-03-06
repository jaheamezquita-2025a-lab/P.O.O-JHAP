package com.corhuila.poo.semana4;

public class ReservaHotel {

    private String codigo;
    private String nombreHuesped;
    private int noches;
    private double valorNoche;
    private boolean incluyeDesayuno;

    // Constructor principal
    public ReservaHotel(String codigo, String nombreHuesped, int noches, double valorNoche, boolean incluyeDesayuno) {

        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacío");
        }

        if (nombreHuesped == null || nombreHuesped.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (noches <= 0) {
            throw new IllegalArgumentException("Las noches deben ser mayores a 0");
        }

        if (valorNoche <= 0) {
            throw new IllegalArgumentException("El valor por noche debe ser mayor a 0");
        }

        this.codigo = codigo;
        this.nombreHuesped = nombreHuesped;
        this.noches = noches;
        this.valorNoche = valorNoche;
        this.incluyeDesayuno = incluyeDesayuno;
    }

    // Constructor alterno (sin desayuno)
    public ReservaHotel(String codigo, String nombreHuesped, int noches, double valorNoche) {
        this(codigo, nombreHuesped, noches, valorNoche, false);
    }

    // toString para mostrar la reserva
    @Override
    public String toString() {

        double total = noches * valorNoche;

        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", huesped='" + nombreHuesped + '\'' +
                ", noches=" + noches +
                ", total=" + total +
                ", desayuno=" + incluyeDesayuno +
                '}';
    }
}