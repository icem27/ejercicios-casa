package Mision_con_funciones;

import java.util.Scanner;
 
public class Chriki_Ismael_misionExtra {
	public static int totalCrones;
	public static boolean casoUno=false;
	public static boolean casoDos=false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcionElegida;
		String palabra = "CRONOS";
		String palabraOculta = "";
		do {
			opcionElegida = mostrarMenu(sc);
			switch (opcionElegida) {
			case 0:
				salirSistema();
				break;
			case 1:
				calibrarSistema(sc);
				break;
			case 2:
				establecerFecha(sc);
				break;
			case 3:
				cargaTotal();
				break;
			case 4: 
				iniciarViaje();
				break;
			case 5:
				descubrePalabraOculta(sc, palabra, palabraOculta);
				break;
			case 6:
				controlEnergia();
				break;
			default:
				malNumero();
			}

		} while (opcionElegida != 0);
	}
	
	/*Es esta función solo mostramos el menú*/
	public static int mostrarMenu(Scanner sc) {
		System.out.println("---- CENTRO DE CONTROL TEMPORAL ----" + "\n 1. Calibrar el portal"
				+ "\n 2. Establecer fecha del viaje" + "\n 3. Mostrar carga temporal acumulada" + "\n 4. Iniciar viaje"
				+ "\n 5. Describir la clave temporal" + "\n 6. Control de energia" + "\n 0. Salir"
				+ "\n -----------------------------------" + "\n Elige una opción: ");
		return sc.nextInt();
	}
	/*Esta función solo retorna la salida del sistema*/
	public static void salirSistema() {
		System.out.println("Desconectando sistema temporal... Hasta el próximo salto");
	}
	/*En esta función veririfcamos la calibración del portal, no retorna ningun valor*/
	public static void calibrarSistema(Scanner sc) {
		int contador = 0;
		int valorEnergia;
		System.out.println("=====================================" + "\n	Calibrar el portal"
				+ "\n=====================================");

		int energia_final = (int) (Math.random() * 151);
		
		while (contador < 5) {
			System.out.println("Introduce la cantidad de energia: ");
			valorEnergia = sc.nextInt();
			if (valorEnergia > energia_final) {
				System.out.println("La cantidad introducida es demasiado alta");
				contador++;
			} else if (valorEnergia < energia_final) {
				System.out.println("La cantidad introducida es demasiado baja");
				contador++;
			} else {
				contador++;
				System.out.println("Has acertado en " + contador + " intento/s");
				sumarCrones(10);
				casoUno = true;
				contador = 0;
				break;
			}
		}
		if (contador >= 5) {
			System.out.println("--------------------" + "\nHas introducido demasiados intentos. "
					+ "\nIntentalo de nuevo mas tarde" + "\n--------------------");
			contador = 0;
		}
	}
	/*En esta función sumamos los crones a crones totales*/
	public static void sumarCrones(int cantidad) {
		totalCrones += cantidad;
	}
	/*En esta función tampoco retornamos nada, solo verificamos la fecha llamando a la otra función de verificación*/
	public static void establecerFecha(Scanner sc) {
		System.out.println("=====================================" + "\n	Establecer fecha del viaje"
				+ "\n=====================================");

		System.out.println("Introduce dia: ");
		int dia = sc.nextInt();
		System.out.println("Introduce mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduce año: ");
		int anyo = sc.nextInt();
		if (verificarFecha(dia, mes, anyo)) {
			System.out.println("Las coordenadas son estables");
		} else {
			System.out.println("Las coordenadas son inestables");
		}
	}
	/*En esta función solo verificamos si el año introducido es bisiesto o no*/
	public static boolean esAnyoBisiestro(int anyo) {
		boolean bisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
		return bisiesto;
	}
	/*En esta función según la fecha establecida retorna un valor booleano*/
	public static boolean verificarFecha(int diaViaje, int mesViaje, int anyo) {
		boolean mes = true;
		boolean dia = true;
		boolean correcto = false;
		if (mesViaje < 1 || mesViaje > 12) {
			mes = false;
		}
		if (diaViaje < 1 || diaViaje > 31) {
			dia = false;
		} else if ((mesViaje == 4 || mesViaje == 6 || mesViaje == 9 || mesViaje == 11) && diaViaje > 30) {
			dia = false;
		} else if (mesViaje == 2 && diaViaje > 28 && !(esAnyoBisiestro(anyo) && diaViaje == 29)) {
			dia = false;
		}

		if (dia && mes) {
			correcto = true;
			sumarCrones(5);
			casoDos = true;
		} else {
			correcto = false;
		}

		return correcto;
	}
	/*Solo muestra la carga total de los crones*/
	public static void cargaTotal() {
		System.out.println("Tu carga temporal es de " + totalCrones + " crones");
	}
	/*Solo muestra si los casos uno y dos estan correctos y los crones totales*/
	public static void iniciarViaje() {
		if (casoUno && casoDos && totalCrones >= 10) { 
			System.out.println("\"Activando portal..." 
					+ "\nCoordenadas estables..."
					+ "\n¡Salto temporal realizado con éxito!\"");
			sumarCrones(-10);
			casoDos = false;
		} else if (!casoUno) {
			System.out.println("Error: el portal no está calibrado. Realiza la calibración antes de iniciar el viaje.");
		} else if (!casoDos) {
			System.out.println("Error: coordenadas temporales inestables. Introduce una fecha de destino correcta.");
		} else if (totalCrones < 10) {
			System.out.println( "Error: carga temporal insuficiente. Se necesitan al menos 10 crones para abrir el portal.");
		}
	}
	/*Solo sirve para descubrir la palabra oculta*/
	public static void descubrePalabraOculta(Scanner sc, String palabra, String palabraOculta) {
		int intentos=6;
		for (int i = 0; i < palabra.length(); i++) {
			palabraOculta += "*";
		}
		
		sc.nextLine();
		
		while (intentos > 0) {
			boolean letraEncontrada = false;
			System.out.println(palabraOculta);
			System.out.println("Intentos restantes: " + intentos);
			System.out.print("Introduce la palabra secreta:");
			String letra = sc.nextLine().toUpperCase();
			String nuevaPalabraOculta = "";

			for (int i = 0; i < palabra.length(); i++) {
				if (palabra.charAt(i) == letra.charAt(0)) {
					nuevaPalabraOculta += letra;
					letraEncontrada = true;
				} else {
					nuevaPalabraOculta += palabraOculta.charAt(i);
				}
			}
			
			palabraOculta = nuevaPalabraOculta;

			if (letraEncontrada) {
				System.out.println("¡Letra correcta!\n");
			} else {
				System.out.println("Letra incorrecta\n");
				intentos -= 1;
			}

			if (palabra.equalsIgnoreCase(palabraOculta)) {
				System.out.println("Has ganado! La palabra era: " + palabra);
				sumarCrones(15);
				break;
			}

			if (intentos == 0) {
				System.out.println("Colapso temporal... La palabra era: CRONOS");
				break;
			}

		}
		intentos=6;
		palabraOculta="";
	}
	/*En esta función solo muestramos los valores del array*/
	public static void controlEnergia() {
		int[] array = new int[10]; 
		int num_max = 0, num_min = 0;

		for (int i = 0; i < array.length; i++) { 
			array[i] = (int) (Math.random() * (150-50+1)+50); 
			num_min=array[0];
			num_max=array[0];
		}
		for (int i=0;i<array.length;i++) {
			if (array[i]>num_max) {
				num_max=array[i];
			}
			if (array[i]<num_min) {
				num_min=array[i];
			}
		}
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		int media = suma / array.length;
		
		for (int a : array) { 
			System.out.print(a + " | ");
		}
		
		System.out.println();

		System.out.println("Valor máximo: " + num_max + " | Valor mínimo: " + num_min + " | La media es: " + media);
		

		if (media >= 90 && media <= 110) { 
			System.out.println("Flujo temporal estable");
			sumarCrones(5);
		} else {
			System.out.println("Inestabilidad detectada, es necesaria la recalibración");
		}
		
		if(num_max>140) {
			System.out.println("¡Alerta! Pico de energía crítico detectado, riesgo de ruptura temporal");
		}
		
		if(num_min<95) {
			System.out.println("Advertencia: nivel de energía bajo detectado, posible debilitamiento del portal.");
		}
	}
	
	public static void malNumero() {
		System.out.println("Opción no válida. Por favor, selecciona una opción del 0 al 4");
	}

}
