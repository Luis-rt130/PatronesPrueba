/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

/**
 *
 * @author luisr
 */
public class ProductoFisico extends ProductoBase {
    public ProductoFisico(String nombre, double precio, VistaProducto vista) {
        super(nombre, precio, vista);
    }

    public void mostrar() {
        System.out.print("#" + id + " ");
        vista.mostrar(nombre, precio);
    }

    public Producto clonar() {
        ProductoFisico copia = new ProductoFisico(nombre, precio, vista);
        copia.setId(id);
        return copia;
    }
}
