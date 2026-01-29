package ArraysRepaso;

public class Corredor_principal {
	static Corredor[] participantes = new Corredor[5];
	static String[] nombres = {"Ismael", "Antonio", "Carlos", "Patricia", "Sofia"};

	public static void main(String[] args) {
		inicializadorArray();
		Corredor mejorCorredor = formula();
		todosParticipantes();
		System.out.println("El que menos tiempo tiene es: " + mejorCorredor);

	}
	public static void inicializadorArray() {
		for(int i=0;i<participantes.length;i++) {
			int ale = (int) (Math.random()*120);
			participantes[i] = new Corredor(nombres[i], ale);
		}
	}
	
	public static void todosParticipantes() {
		for(Corredor todos:participantes) {
			System.out.println(todos);
		}
	}
	
	public static Corredor formula() {
		Corredor min = participantes[0];
		for(Corredor minimo:participantes) {
			if(minimo.getTiempo()<min.getTiempo()) {
				min=minimo;
			}
		}
		return min;
	}

}
