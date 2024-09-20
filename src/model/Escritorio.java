package model;

import java.util.Objects;

public  class Escritorio extends Mueble {
    private Double alto;
    private Double ancho;

    public Escritorio(String nombre, Integer stock, Double precio, Double alto, Double ancho) {
        super(nombre, stock, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alto: " + alto + "m, Ancho: " + ancho + "m";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Escritorio that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(alto, that.alto) && Objects.equals(ancho, that.ancho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), alto, ancho);
    }
}