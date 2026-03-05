package videoJuego;

public class Mago implements Personaje {

    private String nombre;
    private int vida = 80;
    private int energia = 100;
    private String estado = "normal";

    public Mago(String nombre) {
        this.nombre = nombre;
    }

    public void atacar(Personaje objetivo) {
        energia -= 20;
        objetivo.recibirDanio(25);
    }

    public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void curar(Personaje objetivo) {
        objetivo.recibirDanio(-20);
    }

    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            estado = "derrotado";
        }
    }

    public String getNombre() {
        return nombre;
    }
}