package Disfraces;

public class Disfraz extends Productos {
    private Talla talla;

    public Disfraz(String nombreProducto, Categoria categoria, Talla talla) {
        super(nombreProducto, categoria);
        this.talla = talla;
    }

    @Override
    public double precioProducto() {
        double precioBaseConIva = super.precioProducto();
        double descuento = getCategoriaProducto().getDescuento();
        return precioBaseConIva * (1 - descuento);
    }
    
    @Override
    public double precioProductoTotal(int dias) {
    	return precioPorDiaConIva()*dias;
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