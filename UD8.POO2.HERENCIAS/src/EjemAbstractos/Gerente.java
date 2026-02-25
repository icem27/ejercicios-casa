package EjemAbstractos;

class Gerente extends Empleado {
    private double bono;

    public Gerente(double bono, String nombre, double salarioBase) { 
    	super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}