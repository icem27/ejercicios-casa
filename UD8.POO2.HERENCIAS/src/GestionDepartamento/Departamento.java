package GestionDepartamento;


public class Departamento {
	private String nombre;
	private Profesor[] profesor;
	
	public Departamento(String nombre, int numProfesores) {
		profesor=new Profesor[numProfesores];
		this.nombre = nombre;
	}
	
	public void anyadirProfesor(Profesor profe) {
		for(int i=0;i<profesor.length;i++) {
			if(profesor[i]==null) {
				profesor[i]=profe;
				break;
			}
		}
	}
	
	public int profes() {
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
	            pres += profesor[i].toString() + "\n"; 
	        }
	    }
	    return pres;
	}
	

	@Override
	public String toString() {
		return imprimirEstrellas() + "Profesores del departamento de " + nombre + " del IES Barajas: " + "(" + profes() + " de " + profesor.length + ")\n"
				+ imprimirEstrellas() + imprimirGuiones() + profe(); 
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
