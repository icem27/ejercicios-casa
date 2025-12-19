package RepasoArrays;

public class Ejercicio_1 {
	/*
	 * Crear un programa para una estación meteorológica que almacene las
	 * temperaturas diarias durante 4 semanas e indique:
	 * 
	 * Cuál es la temperatura media cada semana Cuál es la temperatura media de las
	 * 4 semanas Qué días se ha detectado la temperatura mínima y la máxima Mostrar
	 * un mensaje que indique si algún día se ha detectado una temperatura superior
	 * a 30º Mostrar un mensaje que indique cuántos días se ha superado la
	 * temperatura media Las temperaturas se generarán de manera aleatoria entre 0º
	 * y 35º.
	 */

	public static void main(String[] args) {
		int dia=0;
		int semana=0;
		boolean supera30=false;
		double[][] temperaturas = new double[4][7];
		for(semana=0;semana<temperaturas.length;semana++) {
			for(dia=0;dia<temperaturas[semana].length;dia++) {
				temperaturas[semana][dia]=(double)(Math.random()*36);
		}
		}
		
		System.out.printf("%6s ", " ");
		for(dia=0;dia<7;dia++) {
			System.out.printf("%9s", "Día "+ (dia+1));
		}
		System.out.printf("%14s ", "Temp. media");
		System.out.println();

		System.out.printf("%8s ", " ");
		for(dia=1;dia<8;dia++) {
			System.out.printf("%9s", " ====== ");
		}
		System.out.printf("%12s", " ============ ");
		System.out.println();
		double temMediaMes=0;
		for(semana=0;semana<temperaturas.length;semana++) {
			double mediaSem=0;
			System.out.printf("%s", "Semana " + (semana+1));
			for(dia=0;dia<temperaturas[semana].length;dia++) {
				mediaSem+=temperaturas[semana][dia];
				System.out.printf("%8.2f ", temperaturas[semana][dia]);
				if(temperaturas[semana][dia]>=30) {
					supera30=true;
				}
			}
			temMediaMes+=mediaSem;
			
			System.out.printf("%8.2f", (mediaSem/7));
			System.out.println();
		}
		
		temMediaMes=temMediaMes/28;
		int contador=0;
		double temMax=temperaturas[0][0];
		double temMin=temperaturas[0][0];
		int diaMax=0;
		int semanaMax=0;
		int diaMin=0;
		int semanaMin=0;
		for(semana=0;semana<temperaturas.length;semana++) {
			for(dia=0;dia<temperaturas[semana].length;dia++) {
				if(temMediaMes>=temperaturas[semana][dia]) {
					contador++;
				}
				temMax=Math.max(temMax, temperaturas[semana][dia]);
				temMin=Math.min(temMin, temperaturas[semana][dia]);
				
				if(temMax==temperaturas[semana][dia]) {
					diaMax=dia;
					semanaMax=semana;
				}
				
				if(temMin==temperaturas[semana][dia]) {
					diaMin=dia;
					semanaMin=semana;
				}
				
			}
		}
		

		if(supera30) {
			System.out.println("\n--> Algún dia se han superado los 30º");
		} else {
			System.out.println("--> Níngun dia ha sido superado");
		}
		System.out.printf("--> La temperatura media de las 4 semanas fue de %.2fº y se superó %d veces", temMediaMes, contador);
		System.out.printf("\n--> La máxima temperatura fue de  %.2fº y se alcanzó el dia %d de la semana %d", temMax, (diaMax+1), (semanaMax+1));
		System.out.printf("\n--> La mínima temperatura fue de  %.2fº y se alcanzó el dia %d de la semana %d", temMin, (diaMin+1), (semanaMin+1));
		
		

	}

}
