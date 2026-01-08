package Actividades;

import java.util.Arrays;

public class DAW_ExamenArrays {
    public static void main(String[] args) {
        final int NUM_AGENTES = 6;
        final String INICIALES="CCB";
        int[][] matriz = new int[NUM_AGENTES][NUM_AGENTES];

        // 1. Rellenar la matriz con valores aleatorios entre 0-9 excepto diagonal (-1)
        for (int i = 0; i < NUM_AGENTES; i++) {
            for (int j = 0; j < NUM_AGENTES; j++) {
                if (i == j) {
                    matriz[i][j] = -1; // diagonal prohibida
                } else {
                    matriz[i][j] = (int)(Math.random() * 10);
                }
            }
        }

        // 2. Calcular puntuación total por agente
        int[] puntuaciones = new int[NUM_AGENTES];

        for (int i = 0; i < NUM_AGENTES; i++) {
            int suma = 0;
            for (int j = 0; j < NUM_AGENTES; j++) {
                int cal = matriz[i][j];
                if (cal == -1) continue;

                if (cal >= 7) suma += 10;
                else if (cal >= 4) suma += 5;
                else if (cal >= 0) suma += 0;
            }
            puntuaciones[i] = suma;
        }

        // 3. Agentes con más de 20 puntos
        int contadorAptos = 0;
        for (int p : puntuaciones) {
            if (p > 20) contadorAptos++;
        }

        String[] agentesAptos = new String[contadorAptos];
        int index = 0;
        for (int i = 0; i < NUM_AGENTES; i++) {
            if (puntuaciones[i] > 20) {
                agentesAptos[index++] = INICIALES+(i + 1); // agente nº (1-6)
            }
        }

        // 4. Estadísticas
        double sumaCalificaciones = 0;
        int totalValores = 0;

        double[] promedioPorMision = new double[NUM_AGENTES];

        // Calcular promedio general y por misión
        for (int col = 0; col < NUM_AGENTES; col++) {
            double sumaColumna = 0;
            int contadorCol = 0;

            for (int fila = 0; fila < NUM_AGENTES; fila++) {
                int cal = matriz[fila][col];
                if (fila == col) continue;

                sumaCalificaciones += cal;
                totalValores++;

                sumaColumna += cal;
                contadorCol++;
            }

            promedioPorMision[col] = sumaColumna / contadorCol;
        }

        double promedioGeneral = sumaCalificaciones / totalValores;

        // Misión más difícil (menor promedio)
        int misionMasDificil = 0;
        double minPromedio = promedioPorMision[0];

        for (int i = 1; i < promedioPorMision.length; i++) {
            if (promedioPorMision[i] < minPromedio) {
                minPromedio = promedioPorMision[i];
                misionMasDificil = i;
            }
        }

        // Agente con mayor puntuación
        int mejorAgente = 0;
        int maxPuntuacion = puntuaciones[0];

        for (int i = 1; i < puntuaciones.length; i++) {
            if (puntuaciones[i] > maxPuntuacion) {
                maxPuntuacion = puntuaciones[i];
                mejorAgente = i;
            }
        }

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
        System.out.println("Misión más difícil: misión " + (misionMasDificil + 1) +
                           " (promedio = " + String.format("%.2f", minPromedio) + ")");
        System.out.println("Agente con mayor puntuación: Agente " + INICIALES+(mejorAgente + 1)
                           + " (" + maxPuntuacion + " puntos)");
    }
}
