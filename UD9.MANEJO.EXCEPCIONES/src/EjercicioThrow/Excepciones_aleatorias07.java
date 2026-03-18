package EjercicioThrow;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Excepciones_aleatorias07 {
	public static void main(String[] args) {
		try {
		int aleatorio = (int) (Math.random()*5);
		excepcion(aleatorio);
		} catch (NumberFormatException x) {
			System.out.println(x.getMessage());
		} catch (FileNotFoundException x) {
			System.out.println(x.getMessage());
		} catch (IOException x) {
			System.out.println(x.getMessage());
		}  catch (IndexOutOfBoundsException x) {
			System.out.println(x.getMessage());
		} catch (ArithmeticException x) {
			System.out.println(x.getMessage());
		}
		
	}
	
	public static void excepcion(int pos) throws NumberFormatException, IOException, FileNotFoundException, IndexOutOfBoundsException, ArithmeticException {
		switch(pos) {
		case 0: 
			throw new NumberFormatException("Number");
		case 1:
			throw new IOException("IO");
		case 2:
			throw new FileNotFoundException("File");
		case 3:
			throw new IndexOutOfBoundsException("Index");
		case 4:
			throw new ArithmeticException("Arit");
		default:
			System.out.println("error");
		}
	}
}
