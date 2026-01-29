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
		return nombre + " tiene " + edad + " años";
	}

	public static void main(String[] args) {
		ClaseConMain[] clase= new ClaseConMain[8];
		String[] nombre = {"Ismael", "Antonio", "Carlos", "Patricia", "Sofia", "Sara", "Carla", "Francisco"};
		
		for(int i=0;i<clase.length;i++) {
			int edad=(int)(Math.random()*99);
			clase[i]=new ClaseConMain(nombre[i], edad);
		}
		
		ClaseConMain masViejo=clase[0];
		ClaseConMain masJoven=clase[0];
		for(ClaseConMain x:clase) {
			System.out.println(x);
			if(masViejo.getEdad()<x.getEdad()) {
				masViejo=x;
			}
			if(masJoven.getEdad()>x.getEdad()) {
				masJoven=x;
			}
		}

		System.out.println("El mas viejo es: " + masViejo);
		System.out.println("El mas joven es: " + masJoven);
		
	}

}
