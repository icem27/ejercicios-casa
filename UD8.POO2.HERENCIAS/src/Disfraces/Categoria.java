package Disfraces;

public enum Categoria {
    HISTORICO(0.10, "Personaje histórico."),
    TERROR(0.15, "Personajes de terror."),
    SUPERHEROE(0.08, "Personajes con superpoderes."),
    OTROS(0.02, "Payasos, policias, etc.");

    private double descuento;
    private String descripcion;

    Categoria(double descuento, String descripcion){
        this.descuento = descuento;
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
