/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

/**
 *
 * @author luisr
 */
public class VistaFisica implements VistaProducto {
    public void mostrar(String nombre, double precio) {
        System.out.println("[Físico] " + nombre + " - $" + precio);
    }
}
