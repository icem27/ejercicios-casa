package EscuelaMagia;

public class Principal {
	public static MagoElemental[] magos = new MagoElemental[10];

	public static void main(String[] args) {
		magos[0] = new MagoAire("Morgana", 100);
		magos[1] = new MagoFuego("Albus", 500);
		magos[2] = new MagoEstudiante("Elminster");
		lanzarHechizo();
	}
	
	public static void lanzarHechizo() {
		String nombre;
		for(int i=0;i<magos.length;i++) {
			if(magos[i]!=null) {
				nombre = magos[i].getNombre();
			if (magos[i] instanceof Aprendiz) {
				System.out.println(nombre + ": " + magos[i].lanzarHechizo());
				System.out.println(nombre + ": " + ((Aprendiz) magos[i]).mensaje());
				; 
			} else {
				System.out.println(nombre + ": "  + magos[i].lanzarHechizo());
			}
			}
		}
	}

}
