package examen2Eval;

import java.util.Arrays;

public class Chriki_Ismael_examen2Eval {

	public static void main(String[] args) {
		final int AGENTES=6;
		final int VIAJES=6;
		int[][] calificaciones= new int[AGENTES][VIAJES];
		int[] puntuacion=new int[AGENTES];
		double[] sumaCalificacionesMision= new double[VIAJES];
		final String IDENTIFICADOR="ICEM";
		int agente;
		int mision;
		double sumaCalificacionesTotal=0;
		double sumaCalificaciones1=0;
		
		//Este for sirve para rellenar la primera matriz y tambien para asignar los puntos a cada agente. 
		for(agente=0;agente<calificaciones.length;agente++) {
			sumaCalificaciones1=0;
			for(mision=0;mision<calificaciones[agente].length;mision++) {
				calificaciones[agente][mision]=(int)(Math.random()*10);
				calificaciones[agente][agente]=-1;
				sumaCalificacionesTotal+=calificaciones[agente][mision];
				
				int puntos=calificaciones[agente][mision];
				if(puntos>=-1 && puntos<=9) {
					if(puntos>=7) {
						puntuacion[agente]+=10;
					} else if(puntos>=4 && puntos<=6) {
						puntuacion[agente]+=5;
					} else if(puntos>=0 && puntos<=3) {
						puntuacion[agente]+=0;
					} else {
						puntuacion[agente]+=0;
					}
				}
			}
			
		}
		
		for(agente=0;agente<calificaciones.length;agente++) {
			sumaCalificaciones1=0;
			for(mision=0;mision<calificaciones[agente].length;mision++) {
				sumaCalificaciones1+=calificaciones[mision][agente];
			}
			sumaCalificacionesMision[agente]=sumaCalificaciones1;
		}
		
		double calificacionMasBaja=sumaCalificacionesMision[0];
		int numMisionMasBaja=0;
		//En este bucle lo que hacemos es identificar la misión con la menos media
		for(agente=0;agente<sumaCalificacionesMision.length;agente++) {
			sumaCalificacionesMision[agente]=sumaCalificacionesMision[agente]/VIAJES;
			
			if(calificacionMasBaja>=sumaCalificacionesMision[agente]) {
				numMisionMasBaja=agente;
			}
			calificacionMasBaja=Math.min(sumaCalificacionesMision[agente], calificacionMasBaja);
		}
		
		//Empezamos a visualizar las matrices segun el orden. En este caso no me salio como en el ejemplo, ya que
		//en el ultimo número se puede observar que imprimer una coma, y no deberia hacerlo. No super como hacerlo 
		System.out.println("===== MATRIZ DE CALIFICACIONES =====");
		for(agente=0;agente<calificaciones.length;agente++) {
			System.out.println(Arrays.toString(calificaciones[agente]));
		}
		
		System.out.println("\n===== PUNTUACIÓN TOTAL POR AGENTE =====");
		int agenteConMasPuntuacion=puntuacion[0];
		int agenteTop=0;
		int puntos=0;
		for(agente=0;agente<puntuacion.length;agente++) {
			System.out.printf("Agente %s: %s puntos", (agente+1),puntuacion[agente]);
			System.out.println();
			if(puntuacion[agente]>=agenteConMasPuntuacion) {
				agenteTop=agente;
				puntos=puntuacion[agente];
			}
			agenteConMasPuntuacion=Math.max(agenteConMasPuntuacion, puntuacion[agente]);
		}
		boolean agenteApto=false;
		System.out.println("\n===== AGENTES APTOS PARA SALTO CRÍTICO (>20 puntos) =====");
		for(agente=0;agente<puntuacion.length;agente++) {
			if(puntuacion[agente]>20) {
				System.out.println("["+IDENTIFICADOR+(agente+1)+"]");
				agenteApto=true;
			} 
		}
		if(!agenteApto) {
			System.out.println("No hay ningun agente que tenga más de 20 puntos.");
		}
		
		double precioCalificaciones=(double) (sumaCalificacionesTotal/(AGENTES*VIAJES));
		System.out.println("\n===== ESTADÍSTICAS =====");
		System.out.printf("Promedio general de calificaciones: %.2f", precioCalificaciones);
		System.out.printf("\nMisión más dificil: mision %d (promedio = %.2f)", (numMisionMasBaja+1), calificacionMasBaja);
		System.out.printf("\nAgente con mayor puntuación: Agente %s%d (%d puntos)", IDENTIFICADOR,(agenteTop+1), puntos);
		
	}

}
