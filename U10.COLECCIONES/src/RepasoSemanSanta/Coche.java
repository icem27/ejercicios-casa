package RepasoSemanSanta;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private int km;
    private double precio;

    // Constructor sin parámetros
    public Coche() {
        this.matricula = "";
        this.marca = "";
        this.modelo = "";
        this.km = 0;
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Coche(String matricula, String marca, String modelo, int km, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.precio = precio;
    }

    // Getters y Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getKm() { return km; }
    public void setKm(int km) { this.km = km; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return String.format("  Matrícula: %-10s | Marca: %-12s | Modelo: %-15s | Km: %7d | Precio: %10.2f €",
                matricula, marca, modelo, km, precio);
    }
}
