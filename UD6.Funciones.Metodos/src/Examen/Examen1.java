package Examen;

public class Examen1 {

	public static void main(String[] args) {
		
		int[][] matriz = {{-1,0,5},{3,-1,1},{2,2,-1}};
		double promedio = motrarPromedio(matriz);
		System.out.println("Promedio general de calificación es: " + String.format("%.2f", promedio));
	}
	
	public static double motrarPromedio(int[][] matriz) {
		int NUM_AGENTES=matriz.length;
		double sumaCalificaciones = 0;
        int totalValores = 0;

        for (int col = 0; col < NUM_AGENTES; col++) {

            for (int fila = 0; fila < NUM_AGENTES; fila++) {
                int cal = matriz[fila][col];
                if (fila == col) continue;

                sumaCalificaciones += cal;
                totalValores++;
            }
        }
        double promedioGeneral = sumaCalificaciones / totalValores;
        return promedioGeneral;
	}
}
