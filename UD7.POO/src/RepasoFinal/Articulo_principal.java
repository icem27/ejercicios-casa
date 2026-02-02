package RepasoFinal;

public class Articulo_principal {
	public static void main(String[] args) {
		String[] palabras = {"Física", "Espacio", "Tiempo"};
		Articulo miArticulo = new Articulo("La teoría especial de la relatividad", "Alberto Einstein", palabras, "Anales de Física", 1913, "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales");
		System.out.println(miArticulo);
	}
}
