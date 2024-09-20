import model.*;
import Service.ProductoService;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Creo la Lista en el main, pero no es lo mas optimo para la memoria.
        List<Producto> productos = new ArrayList<>();

        // Instancio los productos
        Silla silla = new Silla("Silla Ejecutiva", 10, 150.00, true);
        Escritorio escritorio = new Escritorio("Escritorio de Madera", 5, 300.00, 1.2, 0.8);
        Impresora impresora = new Impresora("Impresora HP", 7, 120.00, 30);
        Notebook notebook = new Notebook("Notebook Dell", 15, 800.00, 16);

        // Agregar productos a la lista
        productos.add(silla);
        productos.add(escritorio);
        productos.add(impresora);
        productos.add(notebook);


        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }


        System.out.println(" ");
        ProductoService productoService = new ProductoService();

       productoService.aplicarDescuentos(productos);
        System.out.println(" ");
        productoService.actualizarPrecios(productos);

        }
    }
