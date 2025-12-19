package Actividades;

public class grinch_villa {
	

	public static void main(String[] args) {
		String[][] mapaDeEscondites = {{"Vela", "Taza", "Libro", "Manta"}, {"Música", "Aroma", "Diario", "Mapa"}, {"Planta", "Juego", "Funda", "Marco"}, 
				{"Reloj", "Lámpara", "Café", "Té", "Vino", "Chocolate"}, {"Joya", "Perfume", "Arte", "Foto", "Cesta", "Gafas"}, 
				{"Bolsa", "Kit","Pulsera", "Collar"}, {"Gorro", "Bufanda", "Guantes", "Calcetines", "Bata", "Pijama"}, 
				{"Toalla", "Jabón", "Crema", "Masaje","Viaje", "Entrada", "Experiencia"}, {"Cena", "Postre", "Gel", "Spa", "Bebida", "Dulce"}};
		boolean[][] regaloRobado = new boolean[mapaDeEscondites.length][];
		System.out.println("Regalos antes del secuestro\n");
		imprimirMapa(mapaDeEscondites);
		for(int i=0;i<5;i++) {
			regaloSecuestrado(mapaDeEscondites, regaloRobado);
		}
		System.out.println("\nRegalos despues del secuestro");
		imprimirMapa(mapaDeEscondites);
		
		
		
	}
	public static void imprimirMapa(String[][] regalos) {
		for(int i=0;i<regalos.length;i++) {
			System.out.printf("Casa %s: ",+ (i+1));
			for(int j=0;j<regalos[i].length;j++) {
				System.out.printf("[%s] ",regalos[i][j]);
			}
			System.out.println();
		}
	}
	
//	public static String[] queRegaloSaquear(int robos, String[][] regalos, String[] robo) {
//		int regaloRobado=0;
//			int roboCasa=(int)(Math.random()*regalos.length);
//			int roboRegalo=(int)(Math.random()*regalos[roboCasa].length);
//			robo[regaloRobado]=regalos[roboCasa][roboRegalo];
//		return robo;
//	}
	
	public static String[][] saquearRegalo(String[][] regalos, int casa, int regalo) {
		regalos[casa][regalo]="Regalo secuestrado. Exijo menos alegría";
		return regalos;
	}
	
	public static void regaloSecuestrado(String[][] regalos, boolean[][] robo) {
		boolean regaloNoRobado=false;
		int roboCasa=(int)(Math.random()*regalos.length);
		int roboRegalo=(int)(Math.random()*regalos[roboCasa].length);
		while(regaloNoRobado) {
			robo[roboCasa][roboRegalo]=true;
			roboCasa=(int)(Math.random()*regalos.length);
			roboRegalo=(int)(Math.random()*regalos[roboCasa].length);
		}
		saquearRegalo(regalos, roboCasa, roboRegalo);
	}
	

}
