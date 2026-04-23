package HashMap;

/*CLASE PARA LLEVAR EL PEDIDO*/
public class DetalleCafeteria {
	private String producto;
	private int unidades;
	private Double precio;
	

	public DetalleCafeteria(String producto, int unidades, Double precio) {
		
		this.producto = producto;
		this.unidades = unidades;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return String.format("%10s %10.2f %10d %10.2f\n",producto,precio, unidades,precio*unidades);
	}
	

}