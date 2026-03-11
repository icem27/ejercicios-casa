package EscuelaMagia;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	static int posicion = 0;
	static MagoElemental[] magos = new MagoElemental[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		magos[posicion++] = new MagoAire("Morgana", 100);
		magos[posicion++] = new MagoFuego("Albus", 500);
		magos[posicion++] = new MagoEstudiante("Elminster");
		menu();
	}
	
	public static void menu() {
		int opcion = 0;
		while (opcion!=5) {
			System.out.println("=========== Escuela de Magia =============\n");
			System.out.println("1. Añadir mago");
			System.out.println("2. Lanzar hechizos");
			System.out.println("3. Pasar lista");
			System.out.println("4. Mostrar todos los magos");
			System.out.println("5. Salir");
			System.out.print("Introduce tu opción:");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			nuevoUsuario();
			break;
		case 2:
			lanzarHechizo();
			break;
		case 3:
			ordena();
			break;
		case 4:
			mostrarMagos();
			break;
		case 5:
			System.out.println("bye");
			break;
		default:
			System.out.println("Debes selecionar la opción correcta");
		}
		}
	}
	
	public static void lanzarHechizo() {
		String nombre;
		for(int i=0;i<magos.length;i++) {
			if(magos[i]!=null) {
				nombre = magos[i].getNombre();
			if (magos[i] instanceof Aprendiz) {
				System.out.println(nombre + ": " + magos[i].lanzarHechizo());
				System.out.println(nombre + ": " + ((Aprendiz) magos[i]).mensaje());
				; 
			} else {
				System.out.println(nombre + ": "  + magos[i].lanzarHechizo());
			}
			}
		}
	}
	
	public static void ordena() {
		Arrays.sort(magos, 0, posicion);
		for(MagoElemental m:magos) {
			if (m!=null) System.out.println(m);
		}
		
	}
	
	public static void nuevoUsuario() {
		System.out.println("Tipo de mago (1-Aire, 2-Fuego, 3-Estudiante)");
		int tipo=sc.nextInt();
		sc.nextLine();
		String nombre;
		double cantidad;
		if(tipo==1) {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Velocidad del viento: ");
			cantidad = sc.nextInt();
			magos[posicion++] = new MagoAire(nombre, cantidad);
		} else if(tipo==2) {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Superficie que incendia: ");
			cantidad = sc.nextInt();
			magos[posicion++] = new MagoFuego(nombre, cantidad);
		} else if (tipo==3) {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			magos[posicion++] = new MagoEstudiante(nombre);
		}
		sc.nextLine();
//		magos[posicion++] = new MagoAire("Ismael", 123);
	}
	
	public static void mostrarMagos() {
		
		for(int i=0;i<magos.length;i++) {
			String nombre;
			if(magos[i]!=null) {
				if(magos[i] instanceof MagoAire) {
					nombre="MagoAire";
				} else if (magos[i] instanceof MagoFuego) {
					nombre="MagoFuego";
				} else {
					nombre="MagoEstudiante";
				}
				System.out.println(nombre + ": " + magos[i].capacidades());
			}
		}
	}

}
