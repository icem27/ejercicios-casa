package Ejer3_herencias;

public class CuentaAhorros extends Cuenta {
	private boolean estadoCuenta;
	
	CuentaAhorros(float cuenta, float tasa){
		super(cuenta, tasa);
	}
	
	@Override
	void ingresoDinero(float ingreso) {
		cuentaEstado();
		if(estadoCuenta) {
			super.ingresoDinero(ingreso);
		} else {
			System.out.println("La cuenta se encuentra desctivada");
		}
	}
	
	@Override
	void retirarDinero(float retiro) {
		cuentaEstado();
		if(estadoCuenta) {
			super.retirarDinero(retiro);
			extractoMensual();
		} else {
			System.out.println("La cuenta se encuentra desctivada");
		}
	}
	
	void cuentaEstado() {
		if(saldo>=1000) {
			estadoCuenta = true;
		} else {
			estadoCuenta = false;
		}
	}
	
	void extractoMensual() {
		cuentaEstado();
		int comisionPorOperacion=100;
		if(num_retiradas>4) {
			comision+=comisionPorOperacion;
			saldo-=comisionPorOperacion;
		}
		cuentaEstado();
	}
	
	@Override
	void imprimir() {
//		if(estadoCuenta) super.imprimir();
//		else System.out.println("No hay fondos");
		if(estadoCuenta) {
		super.imprimir(); System.out.println("Has realizado " + (num_ingresos+num_retiradas) + " operaciones");
		}else {
			System.out.println("No hay fondos");
		}
		
	}
	
	public static void main(String[] args) {
		CuentaAhorros c1= new CuentaAhorros(1500, 2);
		c1.ingresoDinero(100);
		c1.retirarDinero(150);
		c1.retirarDinero(150);
		c1.retirarDinero(50);
		c1.calcInteres();
		c1.imprimir();
	}

}
