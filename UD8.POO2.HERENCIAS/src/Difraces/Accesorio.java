package Difraces;

public class Accesorio extends Productos {
    private boolean esNovedad;

    public Accesorio(String nombreProducto, Categoria categoria, boolean esNovedad) {
        super(nombreProducto, categoria);
        this.esNovedad = esNovedad;
    }

    @Override
    public double precioProducto() {
        double precioBaseConIva = super.precioProducto() * 0.5;
        double descuento = getCategoriaProducto().getDescuento();
        return precioBaseConIva * (1 - descuento);
    }

    public boolean isEsNovedad() {
        return esNovedad;
    }

    public void setEsNovedad(boolean esNovedad) {
        this.esNovedad = esNovedad;
    }

    @Override
    public String toString() {
        return String.format("A%04d - %s - %s - Novedad: %s - Precio/día: %s%s",
                getCodigoProducto(),
                getCategoriaProducto().getDescripcion(),
                getNombreProducto(),
                esNovedad ? "Sí" : "No",
                String.format("%.2f€", precioPorDiaConIva()/2),
                isEstaAlquilado() ? " - Alquilado - Cliente: " + getCliente() + " - Días: " + getDiasAlquilado() : " - Disponible");
    }
}