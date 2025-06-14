
/* Programa para llevar inventario de productos
   Hecho por: Chrystian VIera 31.418.023
   Materia: Programación II UBA */

import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
       // Creamos el Scanner para leer entrada
        try (Scanner sc = new Scanner(System.in)) {
            
            //creamos el objeto
            Carrito miCarrito = new Carrito();
            
            System.out.println("BIENVENIDO A MI TIENDA ONLINE");
            System.out.println("------------------------------");
            
            int opcion;
// Ciclo do-while que se repite hasta que elijamos salir 
            do {
                 // Mostramos el menú de opciones
                System.out.println("\n¿Qué quieres hacer?");
                System.out.println("1. Agregar producto");
                System.out.println("2. Ver carrito");
                System.out.println("3. Calcular total");
                System.out.println("4. Salir");
                System.out.print("Elige una opción (1-4): ");
                
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                
                switch(opcion) {
                    case 1 -> {

                          // switch para manejar las diferentes opciones
                        System.out.print("Nombre del producto: ");
                        String nombre = sc.nextLine();
                        
                        System.out.print("Precio del producto: ");
                        double precio = sc.nextDouble();
                        
                        Producto nuevo = new Producto(nombre, precio);
                        miCarrito.agregarProducto(nuevo);
                    }
                    
                    case 2 -> miCarrito.verCarrito();
                    
                    case 3 -> {
                        if(miCarrito.productos.isEmpty()) {
                            System.out.println("No hay productos en el carrito");
                        } else {
                            System.out.println("\nTOTAL A PAGAR: $" + miCarrito.calcularTotal());
                        }
                    }
                    
                    case 4 -> System.out.println("Gracias por tu compra!");
                    
                    default -> System.out.println("Opción no válida, intenta de nuevo");
                }
            } while(opcion != 4);
        }
    }
}