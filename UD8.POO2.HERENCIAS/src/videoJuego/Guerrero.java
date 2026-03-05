package videoJuego;

public class Guerrero implements Personaje {

    private String nombre;
    private int vida = 120;
    private int energia = 50;
    private String estado = "normal";

    public Guerrero(String nombre) {
        this.nombre = nombre;
    }

    public void atacar(Personaje objetivo) {
        objetivo.recibirDanio(20);
    }

    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            estado = "derrotado";
        }
    }

    public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
        return nombre;
    }
}