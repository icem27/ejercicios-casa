package Ejercicios;

public class Electrodomestico_principal {

	public static void main(String[] args) {
		Electrodomestico miLavadora=new Electrodomestico();
		Electrodomestico miNevera=new Electrodomestico("NEVERA", "LG", 0.15);
		miLavadora.setMarca("SAMSUNG");
		miLavadora.setTipo("LAVADORA");
		miLavadora.setPotencia(1.5);
		int tiempoUsoLavadora=48;
		int tiempoUsoNevera=24;
		
		System.out.println(miLavadora);
		System.out.printf("\tConsumo total de la %s durante %d horas ha sido de %.2f KW\n", miLavadora.getTipo(), tiempoUsoLavadora, miLavadora.getConsumo(tiempoUsoLavadora));
		System.out.printf("\tCoste de KW total es de: %.2f€\n", miNevera.getCosteConsumo(tiempoUsoLavadora, 0.17));
		System.out.println("\n"+miNevera);
		System.out.printf("\tConsumo total de la %s durante %d horas ha sido de %.2f KW\n", miNevera.getTipo(), tiempoUsoNevera, miNevera.getConsumo(tiempoUsoNevera));
		System.out.printf("\tCoste de KW total es de: %.2f€\n", miNevera.getCosteConsumo(tiempoUsoNevera, 0.23));

	}

}
