/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author luisr
 */
import catalogo.Tienda;
import producto.*;
import adapter.ProductoExterno;
import adapter.ProductoAdapter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = Tienda.getInstancia();

        while (true) {
            limpiarPantalla();
            System.out.println("-- MENÚ TIENDA --");
            System.out.println("1. Agregar producto físico");
            System.out.println("2. Agregar producto digital");
            System.out.println("3. Agregar producto externo (adapter)");
            System.out.println("4. Ver productos");
            System.out.println("5. Eliminar producto por ID");
            System.out.println("6. Salir");
            System.out.print("Seleccione opción: ");
            int opc = scanner.nextInt();
            scanner.nextLine();

            limpiarPantalla();
            switch (opc) {
                case 1:
                case 2:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    ProductoBase producto;
                    if (opc == 1) {
                        producto = new ProductoFisico(nombre, precio, new VistaFisica());
                    } else {
                        producto = new ProductoDigital(nombre, precio, new VistaDigital());
                    }
                    tienda.agregar(producto);
                    break;
                case 3:
                    tienda.agregar(new ProductoAdapter(new ProductoExterno("Licencia Externa", "45 USD")));
                    break;
                case 4:
                    tienda.mostrar();
                    break;
                case 5:
                    System.out.print("ID a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();
                    tienda.eliminarPorId(idEliminar);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println("\nPresione ENTER para volver al menú...");
            scanner.nextLine();
        }
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


