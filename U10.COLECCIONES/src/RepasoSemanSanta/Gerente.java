package RepasoSemanSanta;

import java.util.ArrayList;

public class Gerente {

    private ArrayList<Cliente> clientes;

    // Constructor vacío
    public Gerente() {
        this.clientes = new ArrayList<>();
    }

    // ---------------------------------------------------------------
    // Getter de la lista (útil para añadir clientes desde Main)
    // ---------------------------------------------------------------
    public ArrayList<Cliente> getClientes() { return clientes; }

    // ---------------------------------------------------------------
    // Añadir cliente (método auxiliar usado desde Main)
    // ---------------------------------------------------------------
    public void añadirCliente(Cliente c) {
        if (c == null) throw new IllegalArgumentException("El cliente no puede ser nulo.");
        clientes.add(c);
    }

    // ---------------------------------------------------------------
    // Mostrar TODOS los clientes
    // ---------------------------------------------------------------
    public void mostrarTodos() {
        if (clientes.isEmpty()) {
            System.out.println("  No hay clientes registrados.");
            return;
        }
        System.out.println("\n--- Lista completa de clientes (" + clientes.size() + ") ---");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    // ---------------------------------------------------------------
    // Mostrar cliente por DNI
    // ---------------------------------------------------------------
    public void mostrarPorDni(String dni) {
        if (dni == null || dni.isBlank()) {
            throw new IllegalArgumentException("El DNI no puede estar vacío.");
        }
        boolean encontrado = false;
        System.out.println("\n--- Búsqueda por DNI: " + dni + " ---");
        for (Cliente c : clientes) {
            if (c.getDni().equalsIgnoreCase(dni)) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("  No se encontró ningún cliente con el DNI '" + dni + "'.");
        }
    }

    // ---------------------------------------------------------------
    // Borrar cliente por DNI  →  true si se borró, false si no existe
    // ---------------------------------------------------------------
    public boolean borrarCliente(String dni) {
        if (dni == null || dni.isBlank()) {
            throw new IllegalArgumentException("El DNI no puede estar vacío.");
        }
        for (Cliente c : clientes) {
            if (c.getDni().equalsIgnoreCase(dni)) {
                clientes.remove(c);
                return true;
            }
        }
        return false;
    }
}
