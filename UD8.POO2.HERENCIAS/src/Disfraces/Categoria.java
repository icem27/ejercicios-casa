package Disfraces;

public enum Categoria {
    HISTORICO(0.10, "Categoria de Historico"),
    TERROR(0.15, "Categoria de Terror"),
    SUPERHEROE(0.08, "Categoria de Superheroe"),
    OTROS(0.02, "Categoria de Otros");

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
