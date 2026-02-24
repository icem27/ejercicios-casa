package Disfraces;

public class Productos {
	private String nombreProducto;
	private static int codigoGlobal = 0;
	private int codigoProducto;
	private boolean estaAlquilado;
	private Categoria categoriaProducto;
	private static final double IVA=0.21;
	private String cliente;
	private int diasAlquilado;
	private final double PRODUCTO_BASE=15;
	
	public Productos(String nombreProducto, Categoria categoriaProducto) {
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        codigoGlobal++;
        this.codigoProducto = codigoGlobal;
        this.estaAlquilado = false; 
    }
	
	public double precioProducto() {
        return PRODUCTO_BASE * diasAlquilado * (1 + IVA);
    }
	
	public double precioProductoTotal(int dias) {
		return precioPorDiaConIva()*dias;
	}
	
	public double precioPorDiaConIva() {
		double descuento = getCategoriaProducto().getDescuento();
	    double precioBaseConIva = PRODUCTO_BASE * (1 + IVA);
	    return precioBaseConIva * (1 - descuento);
	}
	
	public boolean alquilarProducto(String cliente, int dias) {
        if (estaAlquilado || dias <= 0) {
            return false;
        }
        this.estaAlquilado = true;
        this.cliente = cliente;
        this.diasAlquilado = dias;
        return true;
    }
	
	public boolean devolverProducto() {
        if (!estaAlquilado) {
            return false;
        }
        this.estaAlquilado = false;
        this.cliente = null;
        this.diasAlquilado = 0;
        return true;
    }

	public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto; 
    }

    public boolean isEstaAlquilado() {
        return estaAlquilado;
    }

    public String getCliente() {
        return cliente;
    }

    public int getDiasAlquilado() {
        return diasAlquilado;
    }

    public double getPrecioBase() {
        return PRODUCTO_BASE;
    }

    public Categoria getCategoriaProducto() {
        return categoriaProducto;
    }

    public static double getIva() {
        return IVA;
    }
    
    @Override
    public String toString() {
        String estado = estaAlquilado ? "Alquilado" : "Disponible";
        String infoAlquiler = estaAlquilado ? " - Cliente: " + cliente + " - Días: " + diasAlquilado : "";
        return String.format("%s - %s - %s - %s - Precio/día: %.2f€",
                "",
                getCategoriaProducto().getDescripcion(),
                nombreProducto,
                estado + infoAlquiler,
                precioProducto());
    }
	
}
