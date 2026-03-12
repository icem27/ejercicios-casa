package Tema8_11;

public abstract class Mision implements Comparable<Mision> {
	 	private String codigo;
	    private String nombre;
	    private int duracionDias;
	    private int numeroViajeros;
	    EstadoMision estado;
	
       	public Mision(String codigo, String nombre, int duracionDias, int numeroViajeros, EstadoMision estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.duracionDias = duracionDias;
		this.numeroViajeros = numeroViajeros;
		this.estado = estado;
	}
       	
       	
	@Override
		public int compareTo(Mision o) {
			int compara=this.nombre.compareTo(o.nombre);
			if(compara!=0) {
				return Integer.compare(o.duracionDias, duracionDias);
			}
			return this.nombre.compareTo(o.nombre);
			
		}



	// Método para obtener crones consumidos
	public int calcularCronesConsumidos() { 
		return 0;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracionDias() {
		return duracionDias;
	}

	public void setDuracionDias(int duracionDias) {
		this.duracionDias = duracionDias;
	}

	public int getNumeroViajeros() {
		return numeroViajeros;
	}

	public void setNumeroViajeros(int numeroViajeros) {
		this.numeroViajeros = numeroViajeros;
	}

	public EstadoMision getEstado() {
		return estado;
	}

	public void setEstado(EstadoMision estado) {
		this.estado = estado;
	}
	
	public int getCRONES_POR_DIA() {
		return 0;
	}
	
}