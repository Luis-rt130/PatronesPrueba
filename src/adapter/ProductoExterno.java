/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author luisr
 */
public class ProductoExterno {
    private String descripcion;
    private String costo;

    public ProductoExterno(String descripcion, String costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public void mostrarExterno() {
        System.out.println("[Externo] " + descripcion + " - " + costo);
    }

    public String getDescripcion() { return descripcion; }
}
