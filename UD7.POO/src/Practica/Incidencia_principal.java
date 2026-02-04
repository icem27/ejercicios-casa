package Practica;

import java.util.Scanner;

public class Incidencia_principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Incidencia[] incidencias = new Incidencia[30];
        int opcion;

        do {
            opcion = menu(sc);

            switch (opcion) {

                case 1:
                    listarIncidencias(incidencias);
                    break;

                case 2:
                    abrirIncidencia(sc, incidencias);
                    break;

                case 3:
                    cerrarIncidencia(sc, incidencias);
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 4);

        sc.close();
    }

    public static int menu(Scanner sc) {
        System.out.println("Seleccione una opcion (1-4):");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Salir");
        return sc.nextInt();
    }

    public static void listarIncidencias(Incidencia[] incidencias) {
        boolean hay = false;

        for (Incidencia i : incidencias) {
            if (i != null) {
                System.out.println(i);
                hay = true;
            }
        }

        if (!hay) {
            System.out.println("No existen incidencias");
        }
    }

    public static void abrirIncidencia(Scanner sc, Incidencia[] incidencias) {

        System.out.println("Ingresa el numero de puesto:");
        int puesto = sc.nextInt();
        sc.nextLine();

        if (puesto < 0 || puesto >= incidencias.length) {
            System.out.println("Puesto no válido.");
            return;
        }

        if (incidencias[puesto] != null && incidencias[puesto].getEstado() == Estado.PENDIENTE) {
            System.out.println("Ya existe una incidencia no resuelta en este puesto.");
            return;
        }

        System.out.println("Ingresa la descripcion de la incidencia:");
        String averia = sc.nextLine();

        incidencias[puesto] = new Incidencia(puesto, averia);
    }

    public static void cerrarIncidencia(Scanner sc, Incidencia[] incidencias) {

        System.out.println("Ingresa el numero de puesto:");
        int puesto = sc.nextInt();

        if (puesto < 0 || puesto >= incidencias.length) {
            System.out.println("Puesto no válido.");
            return;
        }

        if (incidencias[puesto] == null || incidencias[puesto].getEstado() != Estado.PENDIENTE) {

            System.out.println("No existe una incidencia no resuelta en este puesto.");
            return;
        }
        incidencias[puesto].setEstado(Estado.RESUELTA);
    }
}
