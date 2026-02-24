package Disfraces;

public class Accesorio extends Productos {
    private boolean esNovedad;

    public Accesorio(String nombreProducto, Categoria categoria, boolean esNovedad) {
        super(nombreProducto, categoria);
        this.esNovedad = esNovedad;
    }
    
    @Override
    public double precioPorDiaConIva() {
        double precioDia = super.getPrecioBase() * 0.5 * (1 + getIva());
        double descuento = getCategoriaProducto().getDescuento();
        return precioDia * (1 - descuento);
    }

    public boolean isEsNovedad() {
        return esNovedad;
    }

    public void setEsNovedad(boolean esNovedad) {
        this.esNovedad = esNovedad;
    }

    @Override
    public String toString() {
        return String.format("A%04d - %s - %s - Novedad: %s - Precio/día: %.2f€%s",
                getCodigoProducto(),
                getCategoriaProducto().getDescripcion(),
                getNombreProducto(),
                esNovedad ? "Sí" : "No",
                precioPorDiaConIva(),
                isEstaAlquilado() ? " - Alquilado - Cliente: " + getCliente() + " - Días: " + getDiasAlquilado() : " - Disponible");
    }
}