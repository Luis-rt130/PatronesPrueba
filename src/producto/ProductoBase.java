/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

/**
 *
 * @author luisr
 */
public abstract class ProductoBase implements Producto {
    protected int id;
    protected String nombre;
    protected double precio;
    protected VistaProducto vista;

    public ProductoBase(String nombre, double precio, VistaProducto vista) {
        this.nombre = nombre;
        this.precio = precio;
        this.vista = vista;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
}
