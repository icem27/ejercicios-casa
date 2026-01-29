package Arrays;

public class Atracion_principal {
	
static Atracion[] feria = new Atracion[5];
static String[] nombres = {"Noria", "Coches de Choque", "Barco Pirata", "Carrusel", "Sillas Voladoras"};

	public static void main(String[] args) {
		inicializacionArray();
		atracionMin();
	}
	
	public static void inicializacionArray() {
		for(int i=0;i<feria.length;i++) {
			double ale = (Math.random()*1+1);
			feria[i] = new Atracion(nombres[i], ale);
		}
	}
	public static void atracionMin() {
		boolean noHay=false;
		System.out.println("Atraciones con altura minima de 1.40m: ");
		for(Atracion muestra:feria) {
			if(muestra.getAlturaMinima()>1.40) {
				System.out.println(muestra);
				noHay=true;
			}
		}
		if(!noHay) {
			System.out.println("En esta feria no hay atraciones con mínimo de 1.40 metros");
		}
	}
}
