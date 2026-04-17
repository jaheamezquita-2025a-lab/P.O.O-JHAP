package com.corhuila.poo.semana7;

import java.util.ArrayList;
import java.util.List;

class Envio {
    private String codigo;
    protected double pesoKg;

    public Envio(String codigo, double pesoKg) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (pesoKg <= 0) {
            throw new IllegalArgumentException();
        }
        this.codigo = codigo;
        this.pesoKg = pesoKg;
    }

    public double calcularCosto() {
        return 0;
    }

    public String resumen() {
        return "Codigo: " + codigo + " | Peso: " + pesoKg + "kg";
    }
}

class EnvioEstandar extends Envio {

    public EnvioEstandar(String codigo, double pesoKg) {
        super(codigo, pesoKg);
    }

    @Override
    public double calcularCosto() {
        return 8000 + (pesoKg * 2000);
    }
}

class EnvioExpress extends Envio {

    public EnvioExpress(String codigo, double pesoKg) {
        super(codigo, pesoKg);
    }

    @Override
    public double calcularCosto() {
        return 15000 + (pesoKg * 3500);
    }
}

class EnvioInternacional extends Envio {
    private String paisDestino;

    public EnvioInternacional(String codigo, double pesoKg, String paisDestino) {
        super(codigo, pesoKg);
        if (paisDestino == null || paisDestino.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.paisDestino = paisDestino;
    }

    @Override
    public double calcularCosto() {
        return 30000 + (pesoKg * 6000);
    }

    @Override
    public String resumen() {
        return super.resumen() + " | Pais: " + paisDestino;
    }
}

public class App {
    public static void main(String[] args) {

        List<Envio> envios = new ArrayList<>();

        envios.add(new EnvioEstandar("E1", 2));
        envios.add(new EnvioExpress("E2", 1.5));
        envios.add(new EnvioInternacional("E3", 3, "Mexico"));

        double total = 0;

        for (Envio e : envios) {
            double costo = e.calcularCosto();
            System.out.println(e.resumen() + " | Costo: " + costo);
            total += costo;
        }

        System.out.println("Total: " + total);
    }
}