package RepasoSemanSanta;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Concesionario concesionario = new Concesionario();
        concesionario.cargarCoches();

        int opcion = 0;

        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1 -> menuVenderCoche(concesionario);
                case 2 -> menuNuevoCoche(concesionario);
                case 3 -> menuMostrar(concesionario);
                case 4 -> System.out.println("\n👋 Hasta pronto.");
                default -> System.out.println("  ✘ Opción no válida. Elige entre 1 y 4.");
            }

        } while (opcion != 4);
    }

    // ---------------------------------------------------------------
    // Menú principal
    // ---------------------------------------------------------------
    private static void mostrarMenuPrincipal() {
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║      CONCESIONARIO MENÚ      ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║  1. Vender coche             ║");
        System.out.println("║  2. Nuevo coche              ║");
        System.out.println("║  3. Mostrar coches           ║");
        System.out.println("║  4. Salir                    ║");
        System.out.println("╚══════════════════════════════╝");
    }

    // ---------------------------------------------------------------
    // Opción 1: vender coche
    // ---------------------------------------------------------------
    private static void menuVenderCoche(Concesionario c) {
        System.out.print("Introduce la matrícula del coche a vender: ");
        String matricula = sc.nextLine().trim();

        if (matricula.isEmpty()) {
            System.out.println("  ✘ La matrícula no puede estar vacía.");
            return;
        }

        boolean vendido = c.venderCoche(matricula);
        if (vendido) {
            System.out.println("  ✔ Coche con matrícula '" + matricula + "' vendido y eliminado del sistema.");
        } else {
            System.out.println("  ✘ No se encontró ningún coche con la matrícula '" + matricula + "'.");
        }
    }

    // ---------------------------------------------------------------
    // Opción 2: nuevo coche
    // ---------------------------------------------------------------
    private static void menuNuevoCoche(Concesionario conc) {
        System.out.println("\n--- Añadir nuevo coche ---");
        try {
            System.out.print("Matrícula: ");
            String matricula = sc.nextLine().trim();
            if (matricula.isEmpty()) throw new IllegalArgumentException("La matrícula no puede estar vacía.");

            System.out.print("Marca: ");
            String marca = sc.nextLine().trim();
            if (marca.isEmpty()) throw new IllegalArgumentException("La marca no puede estar vacía.");

            System.out.print("Modelo: ");
            String modelo = sc.nextLine().trim();
            if (modelo.isEmpty()) throw new IllegalArgumentException("El modelo no puede estar vacío.");

            int km = leerEntero("Kilómetros: ");
            if (km < 0) throw new IllegalArgumentException("Los kilómetros no pueden ser negativos.");

            double precio = leerDouble("Precio: ");
            if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo.");

            conc.nuevoCoche(matricula, marca, modelo, km, precio);
            System.out.println("  ✔ Coche añadido correctamente.");

        } catch (IllegalArgumentException e) {
            System.out.println("  ✘ Error: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // Opción 3: submenú mostrar
    // ---------------------------------------------------------------
    private static void menuMostrar(Concesionario c) {
        System.out.println("\n┌─────────────────────────────┐");
        System.out.println("│      MOSTRAR COCHES         │");
        System.out.println("├─────────────────────────────┤");
        System.out.println("│  1. Mostrar todos           │");
        System.out.println("│  2. Mostrar por marca       │");
        System.out.println("│  3. Mostrar por marca/model │");
        System.out.println("│  4. Mostrar por kilometraje │");
        System.out.println("│  5. Mostrar por precio      │");
        System.out.println("└─────────────────────────────┘");

        int opcion = leerEntero("Elige una opción: ");

        switch (opcion) {
            case 1 -> c.mostrar();

            case 2 -> {
                System.out.print("Marca: ");
                String marca = sc.nextLine().trim();
                if (marca.isEmpty()) { System.out.println("  ✘ La marca no puede estar vacía."); break; }
                c.mostrar(marca);
            }

            case 3 -> {
                System.out.print("Marca: ");
                String marca = sc.nextLine().trim();
                System.out.print("Modelo: ");
                String modelo = sc.nextLine().trim();
                if (marca.isEmpty() || modelo.isEmpty()) {
                    System.out.println("  ✘ Marca y modelo son obligatorios.");
                    break;
                }
                c.mostrar(marca, modelo);
            }

            case 4 -> {
                int km = leerEntero("Kilómetros máximos: ");
                if (km < 0) { System.out.println("  ✘ El valor de km no puede ser negativo."); break; }
                c.mostrar(km);
            }

            case 5 -> {
                double p1 = leerDouble("Precio mínimo: ");
                double p2 = leerDouble("Precio máximo: ");
                if (p1 < 0 || p2 < 0) { System.out.println("  ✘ Los precios no pueden ser negativos."); break; }
                c.mostrar(p1, p2);
            }

            default -> System.out.println("  ✘ Opción no válida.");
        }
    }

    // ---------------------------------------------------------------
    // Helpers de lectura con gestión de excepciones
    // ---------------------------------------------------------------
    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("  ✘ Debes introducir un número entero.");
            }
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("  ✘ Debes introducir un número decimal (usa punto o coma).");
            }
        }
    }
}
