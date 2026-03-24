package org.barajas.ies.services;

import org.barajas.ies.entities.Registro;
import org.barajas.ies.entities.Usuario;

import junit.framework.TestCase;

public class TestGestion extends TestCase {

	// Propiedades de la clase
	private Registro registro;
	private Usuario usuario;

	protected void setUp() throws Exception {
		super.setUp();
		// Inicializamos la propiedad "Registro"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		// Antes de la ejecución de cualquier método
		registro = Registro.getInstance();
		// Inicializamos la propiedad "Usuario"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		usuario = new Usuario("Usuario", "usuario@mail.es", "Usu123");
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

	public void testAddUser() {
		// fail("Not yet implemented");

		// Si se inserto el usuario...
		if (Gestion.addUser(registro, usuario)) {
			// Comprobamos que el usuario insertado sea el de la propiedad
			assertSame(usuario, registro.getUsuario(0));
		} else {
			// Sino se insertó dará fallo.
			fail("No se insertó el usuario");
		}
	}

	public void testRemoveUser() {
		fail("Not yet implemented");
	}

}