package ArraysRepaso;

public class Temperatura_principal {

	public static void main(String[] args) {
		Temperatura[] tiempo = new Temperatura[7];
		tiempo[0] = new Temperatura(1, 1, 25);
		tiempo[1] = new Temperatura(2, 1, 15);
		tiempo[2] = new Temperatura(3, 1, 14);
		tiempo[3] = new Temperatura(4, 1, 2);
		tiempo[4] = new Temperatura(5, 1, 1);
		tiempo[5] = new Temperatura(6, 1, 18);
		tiempo[6] = new Temperatura(7, 1, 22);
		
		Temperatura min = tiempo[0];
		for(Temperatura max:tiempo) {
			if(max.getTemperatura()<min.getTemperatura()) {
				min=max;
			}
		}
		
		System.out.println("La minima ha sido de " + min);

	}

}
