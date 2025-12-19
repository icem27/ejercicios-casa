package RepasoNavidades;


public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arbolLetra("e");
	}
	public static void arbolLetra(String letra) {
		letra = letra.toUpperCase();
		char c = letra.charAt(0);
		char a = 'A';
		int filas = c - a;
		for(int i=0;i<filas+1;i++) {
			for(int j=0;j<filas-i;j++) {
				System.out.print("-");
			}
			for(int j=0;j<(2*i+1);j++) {
				System.out.print(a);
			}
			for(int j=0;j<filas-i;j++) {
				System.out.print("-");
			}
			System.out.println();
			a++;
		}
		
	}
}
