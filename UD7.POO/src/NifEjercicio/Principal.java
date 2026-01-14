package NifEjercicio;

public class Principal {

	public static void main(String[] args) {
		Nif miDNI = new Nif();
		miDNI.dni = 14017386L;
		Nif miDNI2 = new Nif(14017386);
		miDNI.mostrar();
		miDNI2.mostrar();

	}

}
