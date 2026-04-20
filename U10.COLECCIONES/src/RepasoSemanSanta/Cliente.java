package RepasoSemanSanta;

public class Cliente {

    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    // Constructor sin parámetros
    public Cliente() {
        this.dni = "";
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.direccion = "";
    }

    // Constructor con parámetros
    public Cliente(String dni, String nombre, String apellido, String telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getDni()                  { return dni; }
    public void   setDni(String dni)        { this.dni = dni; }

    public String getNombre()               { return nombre; }
    public void   setNombre(String nombre)  { this.nombre = nombre; }

    public String getApellido()                 { return apellido; }
    public void   setApellido(String apellido)  { this.apellido = apellido; }

    public String getTelefono()                  { return telefono; }
    public void   setTelefono(String telefono)   { this.telefono = telefono; }

    public String getDireccion()                   { return direccion; }
    public void   setDireccion(String direccion)   { this.direccion = direccion; }

    @Override
    public String toString() {
        return String.format("  DNI: %-10s | Nombre: %-10s | Apellido: %-15s | Tel: %-12s | Dir: %s",
                dni, nombre, apellido, telefono, direccion);
    }
}
