package model;

import java.util.Objects;

public abstract class Producto {
    private String nombre;
    private Integer stock;
    private Double precio;

    public Producto(String nombre, Integer stock, Double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Stock: " + stock + ", Precio: $" + precio;
    }

    public Double aplicarDescuento(Double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return Objects.equals(nombre, producto.nombre) && Objects.equals(stock, producto.stock) && Objects.equals(precio, producto.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, stock, precio);
    }
}
