/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogo;

/**
 *
 * @author luisr
 */
import producto.Producto;
import java.util.*;

public class Tienda {
    private static Tienda instancia;
    private List<Producto> lista = new ArrayList<>();

    private Tienda() {}

    public static Tienda getInstancia() {
        if (instancia == null) instancia = new Tienda();
        return instancia;
    }

    public void agregar(Producto p) {
        asignarIds();
        lista.add(p);
        p.setId(lista.size());
        System.out.println("Producto agregado.");
    }

    public void mostrar() {
        for (Producto p : lista) p.mostrar();
    }

    public void eliminarPorId(int id) {
        boolean eliminado = lista.removeIf(p -> p.getId() == id);
        if (eliminado) {
            reasignarIds();
            System.out.println("Eliminado.");
        } else {
            System.out.println("No encontrado.");
        }
    }

    private void asignarIds() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setId(i + 1);
        }
    }

    private void reasignarIds() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setId(i + 1);
        }
    }
}
