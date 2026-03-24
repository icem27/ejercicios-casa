package org.barajas.ies.services;

import static org.junit.Assert.*;

import org.barajas.ies.entities.Registro;
import org.barajas.ies.entities.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestGestion {

	// Propiedad estática de la clase
	private static Registro registro;

	// Propiedad de la clase
	private Usuario usuario;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Inicializamos la propiedad "Registro"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		// Antes de la ejecución de cualquier método
		registro = Registro.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Limpiamos el contenido de la propiedad "Registro"
		// tras la ejecución de todos los métodos a probar
		// en esta clase JUnit Test Case
		registro = null;
	}

	@Before
	public void setUp() throws Exception {
		// Inicializamos la propiedad "Usuario"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		usuario = new Usuario("Usuario", "usuario@mail.es", "Usu123");
	}

	@After
	public void tearDown() throws Exception {
		// Aseguramos que después de la ejecución de
		// cualquier método de prueba, el registro
		// no tenga usuarios
		for (int index = 0; index < registro.getUsuarios().length; index++) {
			registro.setUsuario(null, index);
		}
	}

	@Test
	public void testAddUser() {
		// Si se inserto el usuario...
		if (Gestion.addUser(registro, usuario)) {
			// Comprobamos que el usuario insertado sea el de la propiedad
			assertSame(usuario, registro.getUsuario(0));
		} else {
			// Sino se insertó dará fallo.
			fail("No se insertó el usuario");
		}
	}

	@Test
	public void testRemoveUser() {
		fail("Not yet implemented");
	}

}
