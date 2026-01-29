package ejemplos;

public class ClaseConMain {
	private String nombre;
	private int edad;
	
	ClaseConMain(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	@Override
	public String toString() {
		return "Nombre " + nombre + " y tiene edad " + edad;
	}

	public static void main(String[] args) {
		ClaseConMain[] clase= new ClaseConMain[5];
		
		for(int i=0;i<clase.length;i++) {
			clase[i]=new ClaseConMain("Ismael", 12+(i*2));
		}
		
		for(ClaseConMain x:clase) {
			System.out.println(x);
		}
		
	}

}
