package ArraysRepaso;

public class Empleado_principal {

	public static void main(String[] args) {
		Empleado[] empresa = new Empleado[5];
		empresa[0] = new Empleado("Ismael", 2958.4, "Ventas"); 
		empresa[1] = new Empleado("Chaniel", 958.9, "Informatica"); 
		empresa[2] = new Empleado("Yukai", 1205.9, "Compras"); 
		empresa[3] = new Empleado("Ruth", 1564, "Ventas"); 
		empresa[4] = new Empleado("Xavi", 1325, "Informatica"); 
		String buscador="Ventas";
		int contador=0;
		for(Empleado masEmpleados:empresa) {
			if(masEmpleados.getDepartamento().equalsIgnoreCase(buscador)) {
				contador++;
			}
		}
		
		System.out.println("En el departamento " + buscador + " hay " + contador + " empleados");

	}

}
