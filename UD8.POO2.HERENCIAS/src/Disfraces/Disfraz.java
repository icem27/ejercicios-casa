package Disfraces;

public class Disfraz extends Productos {
    private Talla talla;

    public Disfraz(String nombreProducto, Categoria categoria, Talla talla) {
        super(nombreProducto, categoria);
        this.talla = talla;
    }
    
    @Override
    public double precioPorDiaConIva() {
        double precioDia = super.getPrecioBase();
        double iva = precioDia * getIva();
        double descuento = getCategoriaProducto().getDescuento();
        return precioDia * (1 - descuento) + iva;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return String.format("D%04d - %s - %s - Talla: %s - Precio/día: %s%s",
                getCodigoProducto(),
                getCategoriaProducto().getDescripcion(),
                getNombreProducto(),
                talla,
                String.format("%.2f€", precioPorDiaConIva()),
                isEstaAlquilado() ? " - Alquilado - Cliente: " + getCliente() + " - Días: " + getDiasAlquilado() : " - Disponible");
    }
}