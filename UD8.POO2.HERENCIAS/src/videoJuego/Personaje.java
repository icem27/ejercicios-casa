package videoJuego;

public interface Personaje {
    void atacar(Personaje objetivo);
    void recibirDanio(int cantidad);
    String getNombre();
}