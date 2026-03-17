package EjercicioThrow;

public class Ejercicio4 {
	public static void main(String[] args) {
		try {
			int[] array= {1,2,3,4,5,6};
			int pos=0;
			obtenerElemental(array, pos);
		} catch (IndexOutOfBoundsException x) {
			System.out.println(x.getMessage());
		}
	}
	
	public static void obtenerElemental(int[] b, int posicion) {
		if(posicion<0 || b.length<=posicion) {
			throw new IndexOutOfBoundsException("Fuera de rango");
		} else {
			System.out.println(b[posicion]);
		}
	}
}
