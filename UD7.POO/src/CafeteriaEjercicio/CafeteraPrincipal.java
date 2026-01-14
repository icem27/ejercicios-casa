package CafeteriaEjercicio;

public class CafeteraPrincipal {

	public static void main(String[] args) {
		Cafetera cafetera1000 = new Cafetera();
		System.out.println("Llegano la cafetera 1000");
		cafetera1000.llenarCafeteria();
		System.out.println("Sirvo un café");
		cafetera1000.servirTaza(80);
		
		System.out.println("En la cafetera queda " + cafetera1000.cantidadActual+" c.c. de café");
		
		
		Cafetera cafeteraPeque=new Cafetera(100);
		cafeteraPeque.servirTaza(110);
		cafeteraPeque.llenarCafeteria();
		System.out.println("En la cafetera pequeña me quedan " + cafeteraPeque.cantidadActual+" c.c. de café");
		
		Cafetera cafeteraLlena=new Cafetera(250, 125);
		System.out.println("Servir Café");
		cafeteraLlena.servirTaza(80);
		System.out.println("En la cafetera llena tengo " + cafeteraLlena.cantidadActual + " c.c de café");
	}

}
