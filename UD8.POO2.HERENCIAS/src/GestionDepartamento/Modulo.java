package GestionDepartamento;

public enum Modulo {
	BBDDW("Bases de datos", Ciclo.DAW, 1), BBDDM("Bases de datos", Ciclo.DAM, 1), ENTDM("Entidad de Desarrollo", Ciclo.DAM, 1), 
	ENTDW("Entidad de Desarrollo", Ciclo.DAW, 1), LMW("Lenguaje de Marcas", Ciclo.DAW, 1), 
	PROGW("Programación", Ciclo.DAW, 1), PROGM("Programación", Ciclo.DAM, 1);
	
	private String descripcion;
	private Ciclo ciclo;
	private int curso;
	private String id;
	
	private Modulo(String descripcion, Ciclo ciclo, int curso) {
		this.descripcion = descripcion;
		this.ciclo = ciclo;
		this.curso = curso;
		this.id = "("+curso +""+ ciclo + "_" + descripcion.substring(0,2)+")";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
