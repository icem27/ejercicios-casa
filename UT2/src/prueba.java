import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		boolean mes=false;
		boolean dia=false;
		int diaTrabajo=0;
		int mesTrabajo=0;
		

		diaTrabajo=leer.nextInt();
		if (mes!=true) {
			if (diaTrabajo==1 || diaTrabajo==3 || diaTrabajo==5 || diaTrabajo==7) {
				mes=true;
			}
		}
		System.out.println(mes);
	}

}
