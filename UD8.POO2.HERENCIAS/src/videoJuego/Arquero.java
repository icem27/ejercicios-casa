package videoJuego;

public class Arquero implements Personaje {

    private String nombre;
    private int vida = 90;
    private int energia = 70;
    private String estado = "normal";

    public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Arquero(String nombre) {
        this.nombre = nombre;
    }

    public void atacar(Personaje objetivo) {
        objetivo.recibirDanio(18);
    }

    public void disparar(Personaje objetivo) {
        objetivo.recibirDanio(30);
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