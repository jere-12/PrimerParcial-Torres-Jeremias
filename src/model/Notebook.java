package model;

public class Notebook extends ProductoInformatico {
    private Integer memoriaGB;

    public Notebook(String nombre, Integer stock, Double precio, Integer memoriaGB) {
        super(nombre, stock, precio);
        this.memoriaGB = memoriaGB;
    }

    @Override
    public String toString() {
        return super.toString() + ", Memoria: " + memoriaGB + "GB";
    }
}