package TiendaAnimales;

public class Tortugas extends Animales {
	public TipoOrejas tipo;

	public Tortugas(TipoOrejas tipo) {
		super();
		this.tipo = tipo;
	}
	
	@Override
	public String mostrar() {
		return tipo.name() + " edad en meses: " + meses + " precio venta: " + tipo.getPrecio() + " - " + estadoVenta();
	}
	
	

}
