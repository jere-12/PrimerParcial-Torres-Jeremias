package model;

import java.util.Objects;

public class Silla extends Mueble {
    private Boolean tieneRuedas;

    public Silla(String nombre, Integer stock, Double precio, Boolean tieneRuedas) {
        super(nombre, stock, precio);
        this.tieneRuedas = tieneRuedas;
    }

    public Boolean getTieneRuedas() {
        return tieneRuedas;
    }

    public void setTieneRuedas(Boolean tieneRuedas) {
        this.tieneRuedas = tieneRuedas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tiene Ruedas: " + tieneRuedas;
    }


}