/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

/**
 *
 * @author luisr
 */

public interface Producto extends Cloneable {
    void mostrar();
    Producto clonar();
    String getNombre();
    int getId();
    void setId(int id);
}