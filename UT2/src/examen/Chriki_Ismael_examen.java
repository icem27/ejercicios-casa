package examen;

import java.util.Scanner;

public class Chriki_Ismael_examen {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		// Todas las variables, booleanos y constantes que se usan en el codigo.
		int entrada;
		int valorEnergia;
		int diaViaje = 0;
		int mesViaje = 0;
		int anhoViaje = 0;
		int contador = 0;
		int crones = 0;
		boolean mes = true;
		boolean dia = true;
		boolean casoUno = false;
		boolean casoDos = false;
		int energia_final;
		String resultado = "";
		String palabra = "CRONOS";
		String palabraOculta = "";
		int intentos = 6;

		do {// Lo realizo con el do while por si el usuario introduce un 0 que no entre de
			// nuevo
			System.out.println("---- CENTRO DE CONTROL TEMPORAL ----" + "\n 1. Calibrar el portal"
					+ "\n 2. Establecer fecha del viaje" + "\n 3. Mostrar carga temporal acumulada"
					+ "\n 4. Iniciar viaje" + "\n 5. Describir la clave temporal" 
					+ "\n 6. Control de energia" + "\n 7. Verificador de identificadores" +"\n 0. Salir"
					+ "\n -----------------------------------" + "\n Elige una opción: ");
			entrada = leer.nextInt();

			switch (entrada) {// La mejor opciona fue realizar la actividad con el switch, ya que sabes los
								// casos que tienes
			case 1:
				System.out.println("=====================================" + "\n	Calibrar el portal"
						+ "\n=====================================");

				energia_final = (int) (Math.random() * 151);// Ponemos aqui la formula de random para que
				// una vez salga del while y se consulte de nuevo, se realice nuevo cálculo.

				while (contador < 5) {// Se realiza con un while para que se repita el bucle hasta que el usuario
					// introduzca la energia correcta
					System.out.println("Introduce la cantidad de energia: ");
					valorEnergia = leer.nextInt();
					if (valorEnergia > energia_final) {
						System.out.println("La cantidad introducida es demasiado alta");
						contador++;
					} else if (valorEnergia < energia_final) {
						System.out.println("La cantidad introducida es demasiado baja");
						contador++;
					} else {
						contador++;
						System.out.println("Has acertado en " + contador + " intento/s");
						crones += 10;
						casoUno = true;
						contador = 0;
						break;
					}
				}
				// Este if sirve para si el usuario introduce mas de 5 intrentos salg al menú
				// principal
				if (contador >= 5 && casoUno || !(casoUno)) {
					System.out.println("--------------------" + "\nHas introducido demasiados intentos. "
							+ "\nIntentalo de nuevo mas tarde" + "\n--------------------");
					contador = 0;
				}
				break;

			case 2:
				System.out.println("=====================================" + "\n	Establecer fecha del viaje"
						+ "\n=====================================");

				System.out.println("Introduce dia: ");
				diaViaje = leer.nextInt();
				System.out.println("Introduce mes: ");
				mesViaje = leer.nextInt();
				System.out.println("Introduce año: ");
				anhoViaje = leer.nextInt();

				if (mesViaje < 1 || mesViaje > 12) { // Este if es para verificar si los meses están entre 1 y 12 meses
					mes = false;
				}
				boolean bisiesto = (anhoViaje % 4 == 0 && anhoViaje % 100 != 0) || (anhoViaje % 400 == 0);
				if (diaViaje < 1 || diaViaje > 31) { // Este if es para verificar si los dias están entre 1 y 31 meses
					dia = false;
				} else if ((mesViaje == 4 || mesViaje == 6 || mesViaje == 9 || mesViaje == 11) && diaViaje > 30) {
					dia = false;
				} else if (mesViaje == 2 && diaViaje > 28 && !(bisiesto && diaViaje == 29)) {
					dia = false;
				}

				if (dia && mes) { // La logica para verificar si la fecha introducida es correcta
					resultado = "Las coordenadas son estables";
					crones += 5;
					casoDos = true;
				} else {
					resultado = "Las coordenadas son inestables";
					dia = true;
					mes = true;
				}

				System.out.println(resultado);
				break;
			case 3: // En este caso solo muestrar los crones acumulados.
				System.out.println("Tu carga temporal es de " + crones + " crones");
				break;

			case 4:
				if (casoUno && casoDos && crones >= 10) { // Para este caso solo verifica si los booleanos son
															// verdaderos y los cronos son mas de 10
					resultado = "\"Activando portal..." + "\nCoordenadas estables..."
							+ "\n¡Salto temporal realizado con éxito!\"";
					crones -= 10;
					casoDos = false;
				} else if (!casoUno) {// Si el caso uno es false entra aquí
					resultado = "Error: el portal no está calibrado. Realiza la calibración antes de iniciar el viaje.";
				} else if (!casoDos) {// Si el caso uno es true y caso dos es false entra aquí
					resultado = "Error: coordenadas temporales inestables. Introduce una fecha de destino correcta.";
				} else if (crones < 10) {// Si los dos anteriores casos son false entra aquí
					resultado = "Error: carga temporal insuficiente. Se necesitan al menos 10 crones para abrir el portal.";
				}

				System.out.println(resultado);
				break;
			case 5:
				for (int i = 0; i < palabra.length(); i++) {//Con este if mostramos la palabra pero con casteriscos
					palabraOculta += "*";
				}
				
				leer.nextLine();//Para refrescar el buffer, ya que el sistema se queda con el nextInt anterior.
				
				while (intentos > 0) {
					boolean letraEncontrada = false;
					System.out.println(palabraOculta);
					System.out.println("Intentos restantes: " + intentos);
					System.out.print("Introduce la palabra secreta:");
					String letra = leer.nextLine().toUpperCase();//convierte la letra en mayuscula
					String nuevaPalabraOculta = "";

					for (int i = 0; i < palabra.length(); i++) {//Debemos recorrer la letra para averiguar si la letra introducida por el usuario es correcta o no
						if (palabra.charAt(i) == letra.charAt(0)) {
							nuevaPalabraOculta += letra;//Si la letra es correcta, se introduce en una nueva variable
							letraEncontrada = true;
						} else {
							nuevaPalabraOculta += palabraOculta.charAt(i); //si la letra es incorrecta, se introduce el valor de la posición de la palabra oculta
						}
					}
					
					palabraOculta = nuevaPalabraOculta;//Asignamos el mismo valor de la nueva palabra a la oculta para mostrar al usuario

					if (letraEncontrada) {
						System.out.println("¡Letra correcta!\n");
					} else {
						System.out.println("Letra incorrecta\n");
						intentos -= 1;
					}

					if (palabra.equalsIgnoreCase(palabraOculta)) {
						System.out.println("Has ganado! La palabra era: " + palabra);
						crones += 15;
						break;
					}

					if (intentos == 0) {
						System.out.println("Colapso temporal... La palabra era: CRONOS");
						break;
					}

				}
				intentos=6;
				palabraOculta="";
				break;
			case 6: 
				int[] array = new int[10]; 
				int num_max = 0, num_min = 0; //Inicializamos el número min y max

				for (int i = 0; i < array.length; i++) { 
					array[i] = (int) (Math.random() * (150-50+1)+50); //Asignamos un número aleatorio a cada posición del array
					num_min=array[0];
					num_max=array[0];
				}
				for (int i=0;i<array.length;i++) {//Con esta formula calculamos el maximo y el minimo
					if (array[i]>num_max) {
						num_max=array[i];
					}
					if (array[i]<num_min) {
						num_min=array[i];
					}
				}
				int suma = 0;
				for (int i = 0; i < array.length; i++) {//Sumamos los valores del array
					suma += array[i];
				}
				int media = suma / array.length;
				
				for (int a : array) { //Visualizamos el array
					System.out.print(a + " | ");
				}
				
				System.out.println();//Salto de linea

				System.out.println("Valor máximo: " + num_max + " | Valor mínimo: " + num_min + " | La media es: " + media);
				

				if (media >= 90 && media <= 110) { //Este if para verificar si la media esta dentro del rango
					System.out.println("Flujo temporal estable");
					crones+=5;
				} else {
					System.out.println("Inestabilidad detectada, es necesaria la recalibración");
				}
				
				if(num_max>140) {
					System.out.println("¡Alerta! Pico de energía crítico detectado, riesgo de ruptura temporal");
				}
				
				if(num_min<95) {
					System.out.println("Advertencia: nivel de energía bajo detectado, posible debilitamiento del portal.");
				}
				
				break;
			case 7:
				String siglas = "IV";
				String consonantesAleatorias = "BCDFGHJKLMNPQRSTVWXYZ";
				String nivelAcceso = "AEIOU";
				String constantesAleatorioDos = "";
				String nivelAccesoDos = "";
				int cuatroNumerosAleatorio = 0;
				String guion = "-";
				boolean signasCorrectas = false;
				String mensaje = "";
				String mensaje2 = "";
				int mensaje1 = 0;
				int numAleatorioConstantes;
				int numAleatorioNivelAceso;
				int contadorLetras = 0, contadorNumeros = 0, contadorGuion = 0;
				int contadorFrase = 0;
				int contadorPro=0;
				int cantidadFrase = 0;
				
				do {
				contadorPro++;	
				cuatroNumerosAleatorio = 0;
				nivelAccesoDos = "";
				constantesAleatorioDos = "";
				mensaje = "";
				contadorLetras=0;
				contadorNumeros=0;
				contadorGuion=0;
				int numerosAleatorios = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
				/*
				numAleatorioConstantes = (int) (Math.random() * (consonantesAleatorias.length()));
				constantesAleatorioDos += consonantesAleatorias.charAt(numAleatorioConstantes);
		*/
				for(int i=0;i<2;i++) {
					numAleatorioConstantes = (int)(Math.random()*(20-1+1)+1);
					constantesAleatorioDos+= consonantesAleatorias.charAt(numAleatorioConstantes);
				}
				numAleatorioNivelAceso = (int) (Math.random() * (nivelAcceso.length()));
				nivelAccesoDos += nivelAcceso.charAt(numAleatorioNivelAceso);
				if (nivelAccesoDos.equals("A")) {
					mensaje = "Nivel de acceso prioritario";
				} else {
					mensaje = "Nivel de acceso basico";
				}
				
				if(numerosAleatorios % 7 == 0) {
					mensaje1++;
				}
				cuatroNumerosAleatorio += numerosAleatorios;

				String palabraFinalClave = new String(
						siglas + guion + constantesAleatorioDos + guion + cuatroNumerosAleatorio + guion + nivelAccesoDos);
				String palabraFinalClave1 = new String(palabraFinalClave + " - " + mensaje);
				int pos = 1;

				for (int i = 0; i < palabraFinalClave.length(); i++) {
					char c = palabraFinalClave.charAt(i);

					pos = palabraFinalClave.indexOf("IV");

					if (pos == 0) {
						signasCorrectas = true;
					}

					if (Character.isAlphabetic(c)) {
						contadorLetras++;
					}
					if (Character.isDigit(c)) {
						contadorNumeros++;
					}
					if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
						contadorGuion++;
					}
				}
				
				cantidadFrase=contadorLetras + contadorNumeros + contadorGuion;
				if (cantidadFrase==12) {
					mensaje2 ="La frase contiene 12 caracteres";
				}
				System.out.println(palabraFinalClave1);
				} while(contadorPro<5);
				System.out.println(mensaje2);
				System.out.println(mensaje1);
			break;
			case 0:
				System.out.println("Desconectando sistema temporal... Hasta el próximo salto");
				break;

			default:// Si no se seleciona del 0 al 4 le salta directamente aqui para que seleciona
					// el número correcto
				System.out.println("Opción no válida. Por favor, selecciona una opción del 0 al 4");
			}

		} while (entrada != 0);
		leer.close();
	}

}