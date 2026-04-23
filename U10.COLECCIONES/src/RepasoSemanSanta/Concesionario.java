package RepasoSemanSanta;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {

    private ArrayList<Coche> coches;

    // Constructor sin parámetros
    public Concesionario() {
        this.coches = new ArrayList<>();
    }

    // Constructor con parámetros
    public Concesionario(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    // Getters y Setters
    public ArrayList<Coche> getCoches() { return coches; }
    public void setCoches(ArrayList<Coche> coches) { this.coches = coches; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Concesionario con " + coches.size() + " coches:\n");
        for (Coche c : coches) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }

    // ---------------------------------------------------------------
    // cargarCoches(): pide datos por teclado hasta que matrícula = "0"
    // ---------------------------------------------------------------
    public void cargarCoches() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Carga de coches (introduce '0' en matrícula para terminar) ===");

        while (true) {
            try {
                System.out.print("Matrícula: ");
                String matricula = sc.nextLine().trim();
                if (matricula.equals("0")) break;

                System.out.print("Marca: ");
                String marca = sc.nextLine().trim();

                System.out.print("Modelo: ");
                String modelo = sc.nextLine().trim();

                System.out.print("Kilómetros: ");
                int km = Integer.parseInt(sc.nextLine().trim());

                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine().trim());

                coches.add(new Coche(matricula, marca, modelo, km, precio));
                System.out.println("  ✔ Coche añadido correctamente.\n");

            } catch (NumberFormatException e) {
                System.out.println("  ✘ Dato numérico inválido. Vuelve a introducir este coche.\n");
            }
        }
    }

    // ---------------------------------------------------------------
    // venderCoche(): elimina el coche con la matrícula indicada
    // ---------------------------------------------------------------
    public boolean venderCoche(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equalsIgnoreCase(matricula)) {
                coches.remove(c);
                return true;
            }
        }
        return false;
    }

    // ---------------------------------------------------------------
    // nuevoCoche(): añade un coche con los datos recibidos
    // ---------------------------------------------------------------
    public void nuevoCoche(String matricula, String marca, String modelo, int km, double precio) {
        coches.add(new Coche(matricula, marca, modelo, km, precio));
    }

    // ---------------------------------------------------------------
    // mostrar(): listado completo
    // ---------------------------------------------------------------
    public void mostrar() {
        if (coches.isEmpty()) {
            System.out.println("  No hay coches en el concesionario.");
            return;
        }
        System.out.println("\n--- Todos los coches (" + coches.size() + ") ---");
        for (Coche c : coches) System.out.println(c);
    }

    // ---------------------------------------------------------------
    // mostrar(String marca): filtra por marca
    // ---------------------------------------------------------------
    public void mostrar(String marca) {
        boolean encontrado = false;
        System.out.println("\n--- Coches de la marca: " + marca + " ---");
        for (Coche c : coches) {
            if (c.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("  No se encontraron coches de esa marca.");
    }

    // ---------------------------------------------------------------
    // mostrar(String marca, String modelo): filtra por marca y modelo
    // ---------------------------------------------------------------
    public void mostrar(String marca, String modelo) {
        boolean encontrado = false;
        System.out.println("\n--- Coches de " + marca + " " + modelo + " ---");
        for (Coche c : coches) {
            if (c.getMarca().equalsIgnoreCase(marca) && c.getModelo().equalsIgnoreCase(modelo)) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("  No se encontraron coches con esa marca y modelo.");
    }

    // ---------------------------------------------------------------
    // mostrar(int km): coches con km <= parámetro
    // ---------------------------------------------------------------
    public void mostrar(int km) {
        boolean encontrado = false;
        System.out.println("\n--- Coches con km ≤ " + km + " ---");
        for (Coche c : coches) {
            if (c.getKm() <= km) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("  No se encontraron coches con ese kilometraje.");
    }

    // ---------------------------------------------------------------
    // mostrar(double, double): coches en rango de precio
    // ---------------------------------------------------------------
    public void mostrar(double precio1, double precio2) {
        boolean encontrado = false;
        double min = Math.min(precio1, precio2);
        double max = Math.max(precio1, precio2);
        System.out.printf("%n--- Coches con precio entre %.2f € y %.2f € ---%n", min, max);
        for (Coche c : coches) {
            if (c.getPrecio() >= min && c.getPrecio() <= max) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("  No se encontraron coches en ese rango de precio.");
    }
}
