/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author luisr
 */
import producto.Producto;

public class ProductoAdapter implements Producto {
    private ProductoExterno externo;
    private int id;

    public ProductoAdapter(ProductoExterno externo) {
        this.externo = externo;
    }

    public void mostrar() {
        System.out.print("#" + id + " ");
        externo.mostrarExterno();
    }

    public Producto clonar() {
        ProductoAdapter copia = new ProductoAdapter(externo);
        copia.setId(id);
        return copia;
    }

    public String getNombre() {
        return externo.getDescripcion();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}