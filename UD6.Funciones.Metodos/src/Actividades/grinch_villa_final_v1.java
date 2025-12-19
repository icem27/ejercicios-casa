package Actividades;

public class grinch_villa_final_v1 {
	// Reset /"CHANIE ERES UN CABRONAZO"/
	public static final String RESET = "\u001B[0m";

	// Colores básicos
	public static final String NEGRO   = "\u001B[30m";
	public static final String ROJO    = "\u001B[31m";
	public static final String VERDE   = "\u001B[32m";
	public static final String AMARILLO= "\u001B[33m";
	public static final String AZUL    = "\u001B[34m";
	public static final String MORADO  = "\u001B[35m";
	public static final String CIAN    = "\u001B[36m";
	public static final String BLANCO  = "\u001B[37m";
	static int num_anterior=-1;
	static int casa_robada=0;
	static boolean barajado=false;
	static int[] orden;

	public static void main(String[] args) {
		//Inicializamos el array con los regalos
		String[][] mapaDeEscondites = {{"Vela", "Taza", "Libro", "Manta"}, {"Música", "Aroma", "Diario", "Mapa"}, {"Planta", "Juego", "Funda", "Marco"}, 
				{"Reloj", "Lámpara", "Café", "Té", "Vino", "Chocolate"}, {"Joya", "Perfume", "Arte", "Foto", "Cesta", "Gafas"}, 
				{"Bolsa", "Kit","Pulsera", "Collar"}, {"Gorro", "Bufanda", "Guantes", "Calcetines", "Bata", "Pijama"}, 
				{"Toalla", "Jabón", "Crema", "Masaje","Viaje", "Entrada", "Experiencia"}};
		
		int casasTotales=mapaDeEscondites.length;
		
		//Creamos el array de de booleanos para verificar si el regalo ha sido robado o no
		boolean[][] regaloRobado = new boolean[casasTotales][];
		for(int i=0;i<casasTotales;i++) {
				regaloRobado[i] = new boolean[mapaDeEscondites[i].length];
		}
		//Visualizamos los regalos sin el robo
		System.out.println(NEGRO+"==== "+RESET + BLANCO+"REGALOS ANTES DEL SAQUEO" + NEGRO + " ====\n"+RESET);
		imprimirMapa(mapaDeEscondites);
		//Indicamos la cantidad de regalos que queremos robar lo mostramos
		int robarRegalos=8;
		
		for(int i=0;i<robarRegalos;i++) {
			regaloSecuestrado(mapaDeEscondites, regaloRobado);
		}
		
		System.out.println(NEGRO+"\n==== "+RESET + BLANCO+"REGALOS DESPUES DEL SAQUEO" + NEGRO + " ====\n"+RESET);
		
		imprimirMapa(mapaDeEscondites);
		
		// MOSTRAR LOS REGALOS QUE QUEDAN DESPUES DEL SAQUEO
		System.out.println(NEGRO+"\n==== "+RESET + BLANCO+"REGALOS RESTANTES DESPUES DEL SAQUEO" + NEGRO + " ====\n"+RESET);
		System.out.println("Los regalos que quedan después del saqueon son: "+contarRegalosRestantes(regaloRobado));
		
//		//Indicamos los robos de dos casas diferentes
//		contarRegalosCasa(regaloRobado, casaRobada(casasTotales));
//		contarRegalosCasa(regaloRobado, casaRobada(casasTotales));
		//Por si se pide robar en mas de dos casas, con esta función hará de manera aleatorio y mostrar hasta la ultima casa
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
		contarRegalosCasa(regaloRobado, robarCasa(casasTotales));
	}
	//Para contar los robos de una casa en particular, siempre que intente salir la misma casa, se asigna la siguiente
	public static int casaRobada(int casas) {
		int casa=(int)(Math.random()*casas);
		if(casa==num_anterior) {
			casa=(casa+1)%casas;
		}
		num_anterior=casa;
		return casa;
	}
	//Visualiza el menú
	public static void imprimirMapa(String[][] regalos) {
		for(int i=0;i<regalos.length;i++) {
			System.out.printf(AMARILLO + "Casa %s: ", (i+1) + RESET);
			for(int j=0;j<regalos[i].length;j++) {
				System.out.printf("["+VERDE+"%s] ",regalos[i][j] + RESET);
			}
			System.out.println();
		}
	}
	//Cambia el regalo por la frase y retorna el array modificado
	public static String[][] saquearRegalo(String[][] regalos, boolean[][] robo, int casa, int regalo) {
		regalos[casa][regalo]=ROJO + "*Regalo secuestrado. Exijo menos alegría*" + RESET;
		robo[casa][regalo]=true;
		return regalos;
	}
	//Se realiza el robo de manera aleatorio, si el reglo ya ha sido robado, debe generar otro número
	public static void regaloSecuestrado(String[][] regalos, boolean[][] robo) {
		int roboCasa=(int)(Math.random()*regalos.length);
		int roboRegalo=(int)(Math.random()*regalos[roboCasa].length);
		while(robo[roboCasa][roboRegalo]){
			roboCasa=(int)(Math.random()*regalos.length);
			roboRegalo=(int)(Math.random()*regalos[roboCasa].length);
		}
		saquearRegalo(regalos, robo, roboCasa, roboRegalo);
	}
	//Recorre el array para contar los regalos robado en total
	public static int contarRegalosRestantes(boolean[][] robo) {
		int regalosRobados=0;
		for(int i=0;i<robo.length;i++) {
			for(int j=0;j<robo[i].length;j++) {
				if(!robo[i][j]) {
					regalosRobados++;
				}
			}
		}
		return regalosRobados;
	}
	//Visualiza los robos realizados por x casas
	public static void contarRegalosCasa(boolean[][] robo, int casa) {
		int regalos=0;
		for(int i=0;i<robo[casa].length;i++) {
			if(!robo[casa][i]) {
				regalos++;
			}
		}
		System.out.println("En la casa "+ (casa+1) + " todavia quedan " + regalos + " regalos");
	}
	//Con esta función barajamos las posiciones de las casas de manera aleatorio y las vamos mostrando segun el orden
	public static int robarCasa(int casas) {
		while(!barajado) {
		orden=new int[casas];
		for(int i=0;i<casas;i++) {
			orden[i]=i;
		}
		
		for(int i=0;i<casas;i++) {
			int j=(int)(Math.random()*casas);
			int aux=orden[i];
			orden[i]=orden[j];
			orden[j]=aux;
		}
		barajado=true;
		}
		for(int i=0;i<casas;i++) {
			if(casa_robada==i && casa_robada<casas) {
				casa_robada++;
				return orden[i];
			}
		}
		//Si el usuario solicita mas casas de las que hay, solo se mostrara la ultima y este mensaje
		if(casa_robada==casas) {
			System.out.println(ROJO+"\n[ERROR] " +RESET+ "Ya has robado en todas las casas de este barrio, intentalo en otro barrio");
		}
		return casas-1;
		
	}

}
