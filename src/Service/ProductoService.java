package Service;
import model.Producto;
import java.util.List;

public class ProductoService {

    public void aplicarDescuentos(List<Producto> productos) {
        for (Producto producto : productos) {
            Double descuento = 0.00;
            if (producto instanceof model.Silla) {
                descuento = 5.00;
            } else if (producto instanceof model.Impresora) {
                descuento = 15.00;
            }
            double precioConDescuento = producto.aplicarDescuento(descuento);
            System.out.println("Precio con descuento de " + producto.getNombre() + ": $" + precioConDescuento);
        }
    }

    public void actualizarPrecios(List<Producto> productos) {
        for (Producto producto : productos) {
            double aumento = 0;
            if (producto instanceof model.Silla) {
                aumento = 5;
            } else if (producto instanceof model.Escritorio) {
                aumento = 10;
            } else if (producto instanceof model.Impresora) {
                aumento = 15;
            } else if (producto instanceof model.Notebook) {
                aumento = 20;
            }
            double precioOriginal = producto.getPrecio();
            double nuevoPrecio = precioOriginal + (precioOriginal * aumento / 100);
            System.out.printf("Producto: %s - Precio original: $%.2f, Nuevo precio: $%.2f%n",
                    producto.getNombre(), precioOriginal, nuevoPrecio);
        }
    }
}
