package TiendaAnimales;

public class Principal {
	
	public static final int  MAX_ANIMALES=11;
	public static Animales[] animales = new Animales[MAX_ANIMALES];
	
	

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

	}

}
