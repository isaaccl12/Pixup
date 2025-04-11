package org.gerdoc.vista;

import org.gerdoc.model.Estado;
import java.util.ArrayList;
import java.util.List;

public class Consola {
    private List<Estado> estados;

    public Consola() {
        estados = new ArrayList<>();
    }

    public void agregarEstado(int id, String nombre) {
        estados.add(new Estado(id, nombre));
        System.out.println("Estado agregado: " + nombre);
    }

    public void eliminarEstado(int id) {
        estados.removeIf(estado -> estado.getId() == id);
        System.out.println("Estado eliminado con ID: " + id);
    }

    public void actualizarEstado(int id, String nuevoNombre) {
        for (Estado estado : estados) {
            if (estado.getId() == id) {
                estado.setNombre(nuevoNombre);
                System.out.println("Estado actualizado: " + estado);
                return;
            }
        }
        System.out.println("Estado no encontrado");
    }

    public void verEstado(int id) {
        for (Estado estado : estados) {
            if (estado.getId() == id) {
                System.out.println("Estado encontrado: " + estado);
                return;
            }
        }
        System.out.println(" Estado no encontrado");
    }

    public void listarEstados() {
        if (estados.isEmpty()) {
            System.out.println("No hay estados registrados");
            return;
        }
        System.out.println(" Catálogo de Estados:");
        for (Estado estado : estados) {
            System.out.println(estado);
        }
    }
}