package model;

public class Impresora extends ProductoInformatico {
    private Integer impresionesPorMinuto;

    public Impresora(String nombre, Integer stock, Double precio, Integer impresionesPorMinuto) {
        super(nombre, stock, precio);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Impresiones por minuto: " + impresionesPorMinuto;
    }
}