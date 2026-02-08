package GestionDepartamento;


public class Departamento {
	private String nombre;
	private Profesor[] profesor;
	
	public Departamento(String nombre, int numProfesores) {
		profesor=new Profesor[numProfesores];
		this.nombre = nombre;
	}
	
	public int anyadirProfesor(Profesor profe) {
		for(int i=0;i<profesor.length;i++) {
			if(profesor[i]==null) {
				profesor[i]=profe;
				return i;
			}
		}
		return -1;
	}
	
	public int cuantosProfes() {
		int profes=0;
		for(int i=0;i<profesor.length;i++) {
			if(profesor[i]!=null) {
				profes++;
			}
		}
		return profes;
	}
	
	public String profe() {
	    String pres = "";
	    for (int i = 0; i < profesor.length; i++) {
	        if (profesor[i] != null) {
	            pres += imprimirGuiones() + profesor[i].toString() + imprimirGuiones(); 
	        }
	    }
	    return pres;
	}
	
	@Override
	public String toString() {
		return imprimirEstrellas() + "Profesores del departamento de " + nombre + " del IES Barajas: " + "(" + cuantosProfes() + " de " + profesor.length + ")\n"
				+ imprimirEstrellas() + profe(); 
	}
	
	public String imprimirEstrellas() {
		String estrella="";
		for(int i=0;i<90;i++) {
			estrella+="*";
		}
		return estrella + "\n";
	}
	
	public String imprimirGuiones() {
		String guion="";
		for(int i=0;i<90;i++) {
			guion+="-";
		}
		return  guion + "\n";
	}

}
