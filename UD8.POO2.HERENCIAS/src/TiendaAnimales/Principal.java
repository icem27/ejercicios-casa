package TiendaAnimales;

public class Principal {
	
	static final int  MAX_ANIMALES=11;
	static Animales[] animales = new Animales[MAX_ANIMALES];
	static int mes = 1;
		
	public static void viajarTiempo() {
		mes++;
		for(Animales a:animales) {
			if(a!=null) {
				a.avanzarMeses();
			}
		}
	}

	public static void main(String[] args) {
		animales[0] = new Perros("Pastor Alemán", 1000, 'M');
		animales[1] = new Perros("Caniche", 125, 'P');
		animales[2] = new Perros("Braco", 2500, 'M');
		animales[3] = new Perros("Golden", 450, 'G');
		animales[4] = new Perros("Cocker", 850, 'M');
		animales[5] = new Tortugas(TipoOrejas.ROJA);
		animales[6] = new Tortugas(TipoOrejas.AMARILLAS);
		animales[7] = new Tortugas(TipoOrejas.ROJA);
		animales[8] = new Tortugas(TipoOrejas.AMARILLAS);
		animales[9] = new Tortugas(TipoOrejas.AMARILLAS);
		animales[10] = new Tortugas(TipoOrejas.ROJA);
		
		viajarTiempo();
		for(int i=0;i<animales.length;i++) {
			String nombre = "";
			if(animales[i]!=null) {
				if(animales[i] instanceof Perros) {
					nombre = "Perro";
					System.out.println(nombre + " " + (i+1) + " " +  animales[i].mostrar());
				} else {
					nombre = "Tortuga";
					System.out.println(nombre + " " + (i+1) + " " + animales[i].mostrar());
				}
			}
		}

	}

}
