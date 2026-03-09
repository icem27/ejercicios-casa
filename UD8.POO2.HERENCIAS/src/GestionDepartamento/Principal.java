package GestionDepartamento;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		Departamento dpt=new Departamento("Informática", 6);
		
		Profesor profe1=new Profesor("David", "Peláez", new Modulo[] {Modulo.BBDDM, Modulo.BBDDM, Modulo.ENTDM, Modulo.ENTDW, Modulo.LMW});
		Profesor profe2=new Profesor("Clara", "Catala", new Modulo[] {Modulo.PROGM, Modulo.PROGW});
		Profesor profe3=new Profesor("Tomás", "López", new Modulo[] {Modulo.ENTDM, Modulo.ENTDW});
		
//		dpt.anyadirProfesor(profe1);
//		dpt.anyadirProfesor(profe2);
//		dpt.anyadirProfesor(profe3);
		
		Profesor[] profesores = {profe1, profe2, profe3};
		Arrays.sort(profesores);
//		System.out.println(dpt.toString());
		for(Profesor p:profesores) {
			System.out.println(p);
		}
}
}
