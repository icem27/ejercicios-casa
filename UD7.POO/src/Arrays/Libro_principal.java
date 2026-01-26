package Arrays;

public class Libro_principal {

	public static void main(String[] args) {
		Libro[] biblioteca = new Libro[5];
		biblioteca[0] = new  Libro("El principito","Antoine de Saint-Exupéry",true);
		biblioteca[1] = new  Libro("Cien años de soledad","Gabriel García Márquez",false);
		biblioteca[2] = new  Libro("Drácula","Bram Stoker",true);
		biblioteca[3] = new  Libro("El hobbit","J.R.R. Tolkien",false);
		biblioteca[4] = new  Libro("1984","George Orwell",true);
		
//		for(int i=0;i<biblioteca.length;i++) {
//			biblioteca[i].prestar();
//		}
//		
//		for(int i=0;i<biblioteca.length;i++) {
//			biblioteca[i].devolver();
//		}
		
		for(Libro libro:biblioteca) {
			if(!libro.isPrestado()) {
			System.out.println(libro);
			}
		}

	}

}
