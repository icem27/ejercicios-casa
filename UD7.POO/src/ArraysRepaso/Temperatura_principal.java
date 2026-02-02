package ArraysRepaso;

public class Temperatura_principal {

	public static void main(String[] args) {
		Temperatura[] tiempo = new Temperatura[7];
		tiempo[0] = new Temperatura(1, 1, 25);
		tiempo[1] = new Temperatura(1, 2, 15);
		tiempo[2] = new Temperatura(1, 3, 54);
		tiempo[3] = new Temperatura(1, 4, 2);
		tiempo[4] = new Temperatura(1, 5, 4);
		tiempo[5] = new Temperatura(1, 6, 18);
		tiempo[6] = new Temperatura(1, 7, 22);
		
		Temperatura min = tiempo[0];
		for(Temperatura max:tiempo) {
			if(max.getTemperatura()<min.getTemperatura()) {
				min=max;
			}
		}
		System.out.println("La minima ha sido de " + min);

	}

}
