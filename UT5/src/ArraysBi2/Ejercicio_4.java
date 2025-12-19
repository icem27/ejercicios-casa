package ArraysBi2;


public class Ejercicio_4 {
	/*
	 * En un edificio de oficinas se quiere hacer un estudio del consumo eléctrico,
	 * para ello se recoge la información del contador de consumo de cada oficina
	 * del edificio. El edificio tiene 10 plantas y en cada planta hay un número
	 * variable de oficinas, una como mínimo.
	 * 
	 * Se quiere conocer y mostrar por pantalla:
	 * 
	 * a) Número total de oficinas en el edificio.
	 * 
	 * b) Cuál es el consumo total del edificio y de cada una de las plantas.
	 * 
	 * c) Donde se sitúa la oficina que más consume y la que menos.
	 * 
	 * 
	 * Utiliza los siguientes datos de prueba como representación de los contadores
	 * mediante una matriz de enteros como datos de prueba (cada fila del array
	 * representa un planta del edificio, y cada columna el consumo de una oficina
	 * de esa planta)
	 */
	
	public static void main(String[] args) {
		int edificio[][] = { 
				{10,4,3,8,5}, // 1ª Planta
				{15, 23}, 
				{90}, 
				{9,34,15,1}, 
				{6,45,12,3},  
				{1,34,1,4}, 
				{4,4,124},
				{9,14,10,4}, 
				{9,4,10,6},
				{9,34,10,4,7,4,2} // 10ª Planta 
				};
		int consumos[] = new int[edificio.length];
		int oficinasTot=0;
		int consumoTot=0;
		int consumoMin=edificio[0][0];
		int consumo=0;
		int consumoMax=edificio[0][0];
		int plantaMin=0;
		int oficinaMin=0;
		int plantaMax=0;
		int oficinaMax=0;
		for(int fila=0;fila<edificio.length;fila++) {
			oficinasTot+=edificio[fila].length;
			for(int col=0;col<edificio[fila].length;col++) {
				consumos[fila]+=edificio[fila][col];
				consumo=Math.min(edificio[fila][col], edificio[fila][col]);
				consumo=Math.max(edificio[fila][col], edificio[fila][col]);
				if(consumoMin>consumo) {
					consumoMin=consumo;
					plantaMin=fila;
					oficinaMin=col;
				}
				if(consumoMax<consumo) {
					consumoMax=consumo;
					plantaMax=fila;
					oficinaMax=col;
				}
			}
			consumoTot+=consumos[fila];
			
			
		}
		
		System.out.println("El número total de oficinas es de: "+ oficinasTot);
		System.out.println("El consumo total del edificio es de: "+ consumoTot);
		System.out.println("Consumo minimo: " + consumoMin + " " + plantaMin + " " + oficinaMin);
		System.out.println("Consumo minimo: " + consumoMax + " " + plantaMax + " " + oficinaMax);
		for(int i=0;i<consumos.length;i++) {
			System.out.print("El consumo de la planta "+(i+1)+ ": "+ consumos[i] + "\n");
		}
	}

}
