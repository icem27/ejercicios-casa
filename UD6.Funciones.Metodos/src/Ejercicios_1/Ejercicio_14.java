package Ejercicios_1;

import java.util.Scanner;

public class Ejercicio_14 {
	/*
	 * Debemos programar una versión del juego piedra, papel o tijeras, para ello
	 * definimos tres constantes globales dentro de la clase
	 */

	static final int PIEDRA = 1;
	static final int PAPEL = 2;
	static final int TIJERAS = 3;

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		int jugador1=generarJugadaAleatorio();
		int jugador2=generarJugadaAleatorio();
		int ganaUsuario=0;
		int ganaOrdenador=0;
		int empate=0;
		boolean usuarioGanaPartida=false;
		
		do {
		System.out.println("Introduce tu jugada[1:PIEDRA, 2:PAPEL, 3:TIJERAS]");
		jugador1=leer.nextInt();
		while(jugador1<1 || jugador1>3) {
			System.out.println("Debes elegir una opción válida. [1:PIEDRA, 2:PAPEL, 3:TIJERAS]");
			jugador1=leer.nextInt();
		}
		//jugador2=generarJugadaAleatorio();
		if(usuarioGanaPartida) {
			jugador2=generarValor(jugador1);
			usuarioGanaPartida=false;
		} else {
			jugador2=generarJugadaAleatorio();
		}
		
		int resultadoDesafio=calcularGanador(jugador1,jugador2);
		System.out.println("El jugador uno elige: " + jugador1 + " y el jugador dos elige: " + jugador2);
		if(resultadoDesafio==1) {
			System.out.println("El jugador 1 gana porque "+opcionSeleccionada(jugador1)+" gana a "+opcionSeleccionada(jugador2));
			ganaUsuario+=1;
			usuarioGanaPartida=true;
		} else if(resultadoDesafio==2) {
			System.out.println("La maquina 2 gana porque "+opcionSeleccionada(jugador2)+" gana a "+opcionSeleccionada(jugador1));
			ganaOrdenador+=1;
		} else {
			System.out.println("Ninguno gana "+opcionSeleccionada(jugador1)+" y "+opcionSeleccionada(jugador2));
			empate+=1;
		}
		} while(quiereContinuar(leer));
		System.out.println("Partidas ganadas por el ordenador:" + ganaOrdenador);
		System.out.println("Partidas ganadas por el usuario:" + ganaUsuario);
		System.out.println("Partidas empatadas: " + empate);

		leer.close();
		
	}
	
	//Funcion que dependiendo de que introduce el jugador1 y jugador 2 retorna la victoria u empate para el ganador. 
	static int calcularGanador(int jugador1, int jugador2) {
		if((jugador1==PIEDRA && jugador2==TIJERAS) || (jugador1==PAPEL && jugador2==PIEDRA) || (jugador1==TIJERAS && jugador2==PAPEL)) {
			return 1;
		} else if ((jugador1==TIJERAS && jugador2==PIEDRA) || (jugador1==PIEDRA && jugador2==PAPEL) || (jugador1==PAPEL && jugador2==TIJERAS)) {
			return 2;
		} else {
			return 0;
		}
	}
	
	//Funciona que genera aleatorioamente entre el 1 y el 3.
	static int generarJugadaAleatorio() {
		return (int)(Math.random()*3+1);
	}
	
	//Funciona que hace trampas, dependiento de que introduce el usuario, siempre retorna la que gana. 
	static int generarValor (int valorUsuario) {
		int resultado=0;
		if(valorUsuario==PIEDRA) {
			return resultado=PAPEL;
		} else if(valorUsuario==PAPEL) {
			return resultado=TIJERAS;
		} else if(valorUsuario==TIJERAS) {
			return resultado=PIEDRA;
		}
		return resultado;
		
	}
	
	//Funcion para asignar el númeo de la jugada el nombre para que salga para el jugador. 
	static String opcionSeleccionada(int valor) {
		String respuesta = "";
		switch(valor) {
		case PIEDRA: 
			respuesta = "PIEDRA";
			break;
		case PAPEL:
			respuesta = "PAPEL";
			break;
		case TIJERAS: 
			respuesta = "TIJERAS";
			break;
		}
		return respuesta;
	}
	
	//Funcion para validar si quiere continuar o detener el juego. 
	static boolean quiereContinuar(Scanner lector) {
		int continua=0;
		System.out.println("¿Quieres continuar? [1-Si | 2-No]");
		continua = lector.nextInt();
		if(continua==1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	

}
