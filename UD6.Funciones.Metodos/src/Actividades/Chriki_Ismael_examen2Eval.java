package Actividades;

public class Chriki_Ismael_examen2Eval {

	public static void main(String[] args) {
		final int AGENTES=6;
		final int VIAJES=6;
		int[][] calificaciones= new int[AGENTES][VIAJES];
		int[] puntuacion=new int[AGENTES];
		final String IDENTIFICADOR="ICEM";
		int fila;
		int columna;
		double sumaCalificacionesTotal=0;
		double sumaCalificaciones1=0;
		double[] sumaCalificacionesMision= new double[VIAJES];
		
		//Este for sirve para rellenar la primera matriz y tambien para asignar los puntos a cada agente. 
		for(fila=0;fila<calificaciones.length;fila++) {
			sumaCalificaciones1=0;
			for(columna=0;columna<calificaciones[fila].length;columna++) {
				calificaciones[fila][columna]=(int)(Math.random()*9);
				sumaCalificacionesTotal+=calificaciones[fila][columna];
				sumaCalificaciones1+=calificaciones[fila][columna];;
				if(columna==columna) {
					calificaciones[columna][columna]=-1;
				}
				
				int puntos=calificaciones[fila][columna];
				if(puntos>=-1 && puntos<=9) {
					if(puntos>=7) {
						puntuacion[fila]+=10;
					} else if(puntos>=4 && puntos<=6) {
						puntuacion[fila]+=5;
					} else if(puntos>=0 && puntos<=3) {
						puntuacion[fila]+=0;
					} else {
						puntuacion[fila]+=0;
					}
				}
			}
			sumaCalificacionesMision[fila]=sumaCalificaciones1;
		}
		
		double calificacionMasBaja=sumaCalificacionesMision[0];
		int numMisionMasBaja=0;
		//En este bucle lo que hacemos es identificar la misión con la menos media
		for(fila=0;fila<sumaCalificacionesMision.length;fila++) {
			sumaCalificacionesMision[fila]=sumaCalificacionesMision[fila]/VIAJES;
			
			if(calificacionMasBaja>=sumaCalificacionesMision[fila]) {
				numMisionMasBaja=fila;
			}
			calificacionMasBaja=Math.min(sumaCalificacionesMision[fila], calificacionMasBaja);
		}
		
		//Empezamos a visualizar las matrices segun el orden. En este caso no me salio como en el ejemplo, ya que
		//en el ultimo número se puede observar que imprimer una coma, y no deberia hacerlo. No super como hacerlo 
		System.out.println("===== MATRIZ DE CALIFICACIONES =====");
		for(fila=0;fila<calificaciones.length;fila++) {
			System.out.printf("%s", "[");
			for(columna=0;columna<calificaciones[fila].length;columna++) {
				System.out.printf("%d, ", calificaciones[fila][columna]);
			}
			System.out.printf("%s", "]");
			System.out.println();
		}
		
		System.out.println("\n===== PUNTUACIÓN TOTAL POR AGENTE =====");
		int agenteConMasPuntuacion=puntuacion[0];
		int agenteTop=0;
		int puntos=0;
		for(fila=0;fila<puntuacion.length;fila++) {
			System.out.printf("Agente %s: %s puntos", (fila+1),puntuacion[fila]);
			System.out.println();
			if(puntuacion[fila]>=agenteConMasPuntuacion) {
				agenteTop=fila;
				puntos=puntuacion[fila];
			}
			agenteConMasPuntuacion=Math.max(agenteConMasPuntuacion, puntuacion[fila]);
		}
		
		System.out.println("\n===== AGENTES APTOS PARA SALTO CRÍTICO (>20 puntos) =====");
		for(fila=0;fila<puntuacion.length;fila++) {
			if(puntuacion[fila]>20) {
				System.out.println("["+IDENTIFICADOR+(fila+1)+"]");
			} 
		}
		
		double precioCalificaciones=(double) (sumaCalificacionesTotal/(AGENTES*VIAJES));
		System.out.println("\n===== ESTADÍSTICAS =====");
		System.out.printf("Promedio general de calificaciones: %.2f", precioCalificaciones);
		System.out.printf("\nMisión más dificil: mision %d (promedio = %.2f)", (numMisionMasBaja+1), calificacionMasBaja);
		System.out.printf("\nAgente con mayor puntuación: Agente %s%d (%d puntos)", IDENTIFICADOR,(agenteTop+1), puntos);
		
		
	}

}
