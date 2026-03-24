package org.barajas.ies.util;

import org.barajas.ies.entities.Registro;
import org.barajas.ies.entities.Usuario;

import junit.framework.TestCase;

public class TestUtilidad extends TestCase {
	
	// Propiedad de la clase
	private Registro registro;

	protected void setUp() throws Exception {
		super.setUp();
		// Inicializamos la propiedad "Registro"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		registro = Registro.getInstance(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		// Aseguramos que después de la ejecución de 
		// cualquier método de prueba, el registro
		// no tenga usuarios
		for (int index = 0; index < registro.getUsuarios().length; index++) {
			registro.setUsuario(null, index);
		}
	}

	public void testRegistroVacio() {
		//fail("Not yet implemented");
		
		// Comprobamos que inicialmente el registro no tiene usuarios
		assertTrue(Utilidad.registroVacio(registro));
		
		// Añadimos un usuario al registro, para comprobar cuando no está vacío
		registro.setUsuario(new Usuario(), 0);
		
		// Comprobamos que ahora el registro tiene algún usuario
		assertFalse(Utilidad.registroVacio(registro));
	}

	public void testRegistroLleno() {
		fail("Not yet implemented");
	}

	public void testPosicionDisponible() {
		fail("Not yet implemented");
	}

	public void testEmailUnico() {
		fail("Not yet implemented");
	}

	public void testUsuarioRepetido() {
		fail("Not yet implemented");
	}

	public void testPosicionUsuario() {
		fail("Not yet implemented");
	}

	public void testPasswordValido() {
		fail("Not yet implemented");
	}

	public void testEmailValido() {
		fail("Not yet implemented");
	}

}
  