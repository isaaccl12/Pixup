package org.gerdoc.vista;

import org.gerdoc.vista.Consola;
import java.util.Scanner;

public class Menu {
    private Consola Consola;
    private Scanner scanner;

    public Menu() {
        Consola = new Consola();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Catálogo");
            System.out.println("2. Padrón de Estados");
            System.out.println("3. Alta");
            System.out.println("4. Baja");
            System.out.println("5. Ver Estado");
            System.out.println("6. Actualizar Estado");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Consola.listarEstados();
                    break;
                case 2:
                    Consola.listarEstados();
                    break;
                case 3:
                    agregarEstado();
                    break;
                case 4:
                    eliminarEstado();
                    break;
                case 5:
                    verEstado();
                    break;
                case 6:
                    actualizarEstado();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
    }

    private void agregarEstado() {
        System.out.print("Ingresa el ID del estado: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingresa el nombre del estado: ");
        String nombre = scanner.nextLine();
        Consola.agregarEstado(id, nombre);
    }

    private void eliminarEstado() {
        System.out.print("Ingresa el ID del estado a eliminar: ");
        int id = scanner.nextInt();
        Consola.eliminarEstado(id);
    }

    private void verEstado() {
        System.out.print("Ingresa el ID del estado a consultar: ");
        int id = scanner.nextInt();
        Consola.verEstado(id);
    }

    private void actualizarEstado() {
        System.out.print("Ingresa el ID del estado a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingresa el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        Consola.actualizarEstado(id, nuevoNombre);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}