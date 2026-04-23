package Examen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ExamenSports {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
       //definición de la estructura a completar
    	ArrayList<Deportista> datos = new ArrayList<Deportista>();
       HashSet<Deportista> datosLimpio = new  HashSet<Deportista>();
        int opcion;
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    registrar(datos);
                    break;
                case 2:
                    datosLimpio = limpiarDuplicados(datos);
                    System.out.println("Duplicados eliminados.");
                    break;
                case 3:
                    borrar(datosLimpio);
                    break;
                case 4:
                    mostrarListado(datosLimpio);
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    } 

	public static void mostrarMenu() {
        System.out.println("\n--- SPORTSJAVA ---");
        System.out.println("1. Registrar");
        System.out.println("2. Eliminar duplicados");
        System.out.println("3. Borrar");
        System.out.println("4. Mostrar listado");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }
//---------------------  MÉTODOS A IMPLEMENTAR
	public static void registrar(ArrayList<Deportista> lista) {
		try {
			System.out.println("Introduce el nombre del desportista: ");
			String nombre = leer.nextLine();
			System.out.println("Introduce su especialidad: ");
			String deporte = leer.nextLine();
			System.out.println("Introduce su edad: ");
			int edad = leer.nextInt();
			System.out.println("Introduce su puntuación: ");
			int puntuacion = leer.nextInt();
			lista.add(new Deportista(nombre, deporte, edad, puntuacion));
		} catch (InputMismatchException x) {
			System.out.println("Formato introducido no es correcto");
			leer.nextLine();
		} catch (NumberFormatException e) {
			System.out.println("Solo debes introducir números reales");
			leer.nextLine();
		}

	}

    public static HashSet limpiarDuplicados(ArrayList<Deportista> lista) {
        HashSet<Deportista> sinDuplicado = new HashSet<Deportista>(lista);
    	return sinDuplicado;
    }
    public static void borrar(HashSet<Deportista> lista) {
    	Iterator<Deportista> it = lista.iterator();
		while (it.hasNext()) {
			Deportista pro = it.next();
			if (pro.getEdad()<18) {
				it.remove();
				System.out.println("Se ha eliminado al menor de edad.");
				break;
			} 
		}
    }
    private static void mostrarListado(HashSet<Deportista> lista) {
    	ArrayList<Deportista> ordenados = new ArrayList<Deportista>(lista);
		for(Deportista a: ordenados) {
			System.out.println(a);
		}
	}
}