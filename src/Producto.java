public class Producto {
    // Atributos básicos
    String nombre;
    double precio;
    
    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Método para mostrar info del producto
    public void mostrar() {
        System.out.println(nombre + " - $" + precio);
    }
}