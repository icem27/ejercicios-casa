package Ejercicios_1;

import java.util.Arrays;

public class Ejercicio_13 {
	/*
	 * Crea un programa que contenga al menos las siguientes funciones:
	 * 
	 * generaArrayInt: Genera y devuelve un array de tamaño n con números aleatorios
	 * cuyo intervalo (mínimo y máximo) se indica como parámetro. minimoArrayInt:
	 * Devuelve el mínimo del array que se pasa como parámetro. maximoArrayInt:
	 * Devuelve el máximo del array que se pasa como parámetro. estaEnArrayInt: Dice
	 * si un número está o no dentro de un array posicionEnArrayInt: Busca un número
	 * en un array y devuelve la posición (el índice) en la que se encuentra o -1 si
	 * no lo encuentra.
	 * 
	 * Comprueba tus funciones invocándolas desde el programa principal (dentro del
	 * main)
	 */
	public static void main(String[] args) {
		int[] array = generaArrayInt(10, 1, 9);
		System.out.println(Arrays.toString(array));
		int numPosicion=4;
		System.out.println("El número minimo del Array es: " + minimoArrayInt(array));
		System.out.println("El número minimo del Array es: " + maximoArrayInt(array));
		estaEnArrayInt(numPosicion, array);
		if(posicionEnArrayInt(numPosicion, array)>0) {
			System.out.println("El número " + numPosicion + " está en " + posicionEnArrayInt(numPosicion, array));
		} else {
			System.out.println("El número " + numPosicion + " no está en " + posicionEnArrayInt(numPosicion, array));
		}
		estaEnArrayInt1(numPosicion, array);
	}
	
	static int[] generaArrayInt(int n, int numMin, int numMax) {
		int array[]=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*(numMax-numMin+1)+numMin);
		}
		return array;
	}
	static int minimoArrayInt(int[] x) {
		int numMin = x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]<=numMin) {
				numMin=x[i];
			}
			numMin=Math.min(numMin, x[i]);
		}
		return numMin;
	}
	static int maximoArrayInt(int[] x) {
		int num = x[0];
		int numMax = 0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>=num) {
				num=x[i];
			}
			numMax=Math.max(num, x[i]);
		}
		return numMax;
	}
	static void estaEnArrayInt(int x, int[] array) {
		boolean siEsta=false;
		for(int i=0;i<array.length;i++) {
			if(x==array[i]) {
				siEsta=true;
			} 
		}
		if(siEsta) {
			System.out.println("El número " + x + " esta en el array");
		} else {
			System.out.println("El número " + x + " no está en el array");
		}
	}
	static void estaEnArrayInt1(int num, int[] array) {
		int indice = posicionEnArrayInt1(num, array);
		if(indice > -1) {
			System.out.println("Es número sí está en el Array");
		} else {
			System.out.println("El número no está en el Array");
		}
	}
	
	static int posicionEnArrayInt(int num, int[] array) {
		boolean siEsta=false;
		int posicion=0;
		for(int i=0;i<array.length;i++) {
			if(num==array[i]) {
				siEsta=true;
				posicion=(i+1);
			} 
		}
		if(siEsta) {
			return posicion;
		} else {
			return -1;
		}
	}
	
	static int posicionEnArrayInt1(int num, int[] array) {
		Arrays.sort(array);
		int indice = Arrays.binarySearch(array, num);
		return indice;
	}

}
