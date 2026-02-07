package GestionDepartamento;

public class Principal {
	public static void main(String[] args) {
		Departamento dpt=new Departamento("Informática", 6);
		
		Profesor profe1=new Profesor("David", "Peláez", new Modulo[] {Modulo.BBDDM, Modulo.BBDDM, Modulo.ENTDM, Modulo.ENTDW, Modulo.LMW});
		Profesor profe2=new Profesor("Clara", "Catala", new Modulo[] {Modulo.PROGM, Modulo.PROGW});
		
		dpt.anyadirProfesor(profe1);
		dpt.anyadirProfesor(profe2);
		
		System.out.println(dpt.toString());
}
}
