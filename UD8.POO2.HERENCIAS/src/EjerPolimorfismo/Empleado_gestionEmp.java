package EjerPolimorfismo;

public class Empleado_gestionEmp {
	private int empleadoMaxCompleta=3, empleadoMaxMedia=2;
	private Empleado_completa[] jornadaCompleta = new Empleado_completa[empleadoMaxCompleta];
	private Empleado_media[] jornadaMedia = new Empleado_media[empleadoMaxMedia];
	
	private int numJordanaCompleta = 0;
	private int numMediaJordana = 0;
	
	public void altaEmpleadoCompleta(Empleado_completa emple) {
		if(numJordanaCompleta < jornadaCompleta.length) {
			jornadaCompleta[numJordanaCompleta] = emple;
			numJordanaCompleta++;
		} else {
			System.out.println("No puede dar de alta a mas empleados de jornada completa");
		}
	}
	
	public void altaEmpleadoMedia(Empleado_media emple) {
		if(numMediaJordana < jornadaMedia.length) {
			jornadaMedia[numMediaJordana] = emple;
			numMediaJordana++;
		} else {
			System.out.println("No puede dar de alta a mas empleados de media jornada");
		}
	}
	
	public void MostrarEmpleados() {
		boolean banderaCompleta=false;
		boolean banderaMedia=false;
		for(Empleado_completa completa:jornadaCompleta) {
			if(completa!=null) {
			System.out.println("Empleado a jornada completa: ");
			System.out.println("=============================");
			System.out.println(completa +"\n");
			} else {
				banderaCompleta=true;
			}
		}
		for(Empleado_media media:jornadaMedia) {
			if(media!=null) {
			System.out.println("Empleado a media jornada: ");
			System.out.println("=============================");
			System.out.println(media + "\n");
			} else {
				banderaMedia=true;
			}
		}

		if(banderaCompleta) {
			System.out.println("Todavia puedes dar de alta a " + (empleadoMaxCompleta-numJordanaCompleta) + " empleados en jornada Completa\n");
		}
		if(banderaMedia) {
			System.out.println("Todavia puedes dar de alta a " + (empleadoMaxMedia-numMediaJordana) + " empleados en media jornada\n");
		}
	}
	
}
