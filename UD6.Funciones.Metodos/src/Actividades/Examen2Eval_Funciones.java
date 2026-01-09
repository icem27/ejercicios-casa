package Actividades;

import java.util.Arrays;

public class Examen2Eval_Funciones {

	public static final String INICIALES = "ICEM";
	public static void main(String[] args) {
		final int NUM_AGENTES = 6;
		int[][] matriz = obtenerMatriz(NUM_AGENTES, NUM_AGENTES);
		int[] puntuaciones = obtenerPuntuaciones(matriz);
		String[] agentesAptos = obtenerAgentesAptos(puntuaciones, 20);
		double promedioGeneral = obtenerPromedioGeneral(matriz);
		double[] promedioMision = obtenerPromedioMision(matriz);
		int misionCompleja = ObtenerMisionCompleja(puntuaciones);
		int mejorAgente = ObtenerMejorAgente(puntuaciones);
		

		// ============================
        //      INFORME FINAL
        // ============================

        System.out.println("===== MATRIZ DE CALIFICACIONES =====");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("\n===== PUNTUACIÓN TOTAL POR AGENTE =====");
        for (int i = 0; i < NUM_AGENTES; i++) {
            System.out.println("Agente " + (i+1) + ": " + puntuaciones[i] + " puntos");
        }

        System.out.println("\n===== AGENTES APTOS PARA SALTO CRÍTICO (>20 puntos) =====");
        if (agentesAptos.length == 0) {
            System.out.println("Ningún agente supera los 20 puntos");
        } else {
            System.out.println(Arrays.toString(agentesAptos));
        }

        System.out.println("\n===== ESTADÍSTICAS =====");
        System.out.printf("Promedio general de calificaciones: %.2f\n", promedioGeneral);
        System.out.println("Misión más difícil: misión " + (misionCompleja) +
                           " (promedio = " + String.format("%.2f", promedioMision[misionCompleja]) + ")");
        System.out.println("Agente con mayor puntuación: Agente " + INICIALES+(mejorAgente+1)
                           + " (" + puntuaciones[mejorAgente] + " puntos)");
		

	}
	public static int[][] obtenerMatriz(int filas, int cols) {
		int[][] matriz = new int[filas][cols];
		for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    matriz[i][j] = -1; // diagonal prohibida
                } else {
                    matriz[i][j] = (int)(Math.random() * 10);
                }
            }
        }
		return matriz;
	}
	public static int[] obtenerPuntuaciones(int[][] matriz) {
		int agentes = matriz.length;
		int[] puntuaciones = new int[agentes];

        for (int i = 0; i < agentes; i++) {
            int suma = 0;
            for (int j = 0; j < agentes; j++) {
                int cal = matriz[i][j];
                if (cal == -1) continue;

                if (cal >= 7) suma += 10;
                else if (cal >= 4) suma += 5;
                else if (cal >= 0) suma += 0;
            }
            puntuaciones[i] = suma;
        }
        return puntuaciones;
	}
	public static String[] obtenerAgentesAptos(int[] puntos, int notaApto) {
		int contadorAptos = 0;
		int tam=puntos.length;
        for (int p : puntos) {
            if (p > 20) contadorAptos++;
        }

        String[] agentesAptos = new String[contadorAptos];
        int index = 0;
        for (int i = 0; i < tam; i++) {
            if (puntos[i] > notaApto) {
                agentesAptos[index++] = INICIALES+(i + 1); // agente nº (1-6)
            }
        }
        return agentesAptos;
	}
	public static double obtenerPromedioGeneral(int[][] matriz) {
		int NUM_AGENTES=matriz.length;
		double sumaCalificaciones = 0;
        int totalValores = 0;

        // Calcular promedio general
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
	public static double[] obtenerPromedioMision(int[][] matriz) {
		int NUM_AGENTES=matriz.length;
        double[] promedioPorMision = new double[NUM_AGENTES];

        // Calcular promedio por misión
        for (int col = 0; col < NUM_AGENTES; col++) {
            double sumaColumna = 0;
            int contadorCol = 0;

            for (int fila = 0; fila < NUM_AGENTES; fila++) {
                int cal = matriz[fila][col];
                if (fila == col) continue;

                sumaColumna += cal;
                contadorCol++;
            }

            promedioPorMision[col] = sumaColumna / contadorCol;
        }
        return promedioPorMision;
	}
	public static int ObtenerMisionCompleja(int[] promedioMision) {
		int misionMasDificil = 0;
        double minPromedio = promedioMision[0];
        for (int i = 1; i < promedioMision.length; i++) {
            if (promedioMision[i] < minPromedio) {
                minPromedio = promedioMision[i];
                misionMasDificil = i;
            }
        }
        return misionMasDificil+1;
	}
	public static int ObtenerMejorAgente(int[] puntos) {
		int mejorAgente = 0;
        int maxPuntuacion = puntos[0];

        for (int i = 1; i < puntos.length; i++) {
            if (puntos[i] > maxPuntuacion) {
                maxPuntuacion = puntos[i];
                mejorAgente = i;
            }
        }
        return mejorAgente;
	}
}
