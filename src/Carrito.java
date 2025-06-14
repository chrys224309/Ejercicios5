import java.util.ArrayList;

public class Carrito {
    // Usamos ArrayList para guardar los productos
    ArrayList<Producto> productos = new ArrayList<>();
    
    // Método para agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("'" + p.nombre + "' agregado al carrito!");
    }
    
    // Método para ver el carrito
    public void verCarrito() {
        if(productos.isEmpty()) {
            System.out.println("El carrito está vacío");
        } else {
            System.out.println("\n--- TU CARRITO ---");
            for(Producto p : productos) {
                p.mostrar();
            }
            System.out.println("-----------------");
        }
    }
    
    // Método para calcular total
    public double calcularTotal() {
        double total = 0;
        for(Producto p : productos) {
            total += p.precio;
        }
        return total;
    }
}