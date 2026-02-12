package Ejer3_herencias;

public class CuentaAhorros extends Cuenta {
	private boolean estadoCuenta=true;
	
	CuentaAhorros(float saldo, float tasa){
		super(saldo, tasa);
	}
	
	void ingreso(float ingreso) {
		if(estadoCuenta) {
			super.ingresoDinero(ingreso);
		} else {
			System.out.println("La cuenta se encuentra desctivada");
		}
	}
	
	void retirar(float retiro) {
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
			System.out.println("La cuenta no esta activa ya que no hay fondos");
		}
		
	}
	
	public static void main(String[] args) {
		CuentaAhorros c1= new CuentaAhorros(1500, 2);
		c1.ingreso(100);
		c1.retirar(100);
		c1.retirar(10);
		c1.retirar(100);
		c1.retirar(10);
		c1.retirar(100);
		c1.retirar(10);
		c1.calcInteres();
		c1.imprimir();
	}

}
