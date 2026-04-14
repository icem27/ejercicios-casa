package org.barajas.ies.util;

import static org.junit.jupiter.api.Assertions.*;

import org.barajas.ies.entities.Registro;
import org.barajas.ies.entities.Usuario;
import org.barajas.ies.services.Gestion;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class TestUtilidad {

	// Propiedad estática de la clase
	private static Registro registro;

	// Propiedad de la clase
	private Usuario usuario;

	@BeforeAll
	@DisplayName("Ejecuta método anotado con \"@BeforeAll\"")
	static void setUpBeforeClass() throws Exception {
		// Inicializamos la propiedad "Registro"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		// Antes de la ejecución de cualquier método
		registro = Registro.getInstance();
	}

	@AfterAll
	@DisplayName("Ejecuta método anotado con \"@AfterAll\"")
	static void tearDownAfterClass() throws Exception {
		// Limpiamos el contenido de la propiedad "Registro"
		// tras la ejecución de todos los métodos a probar
		// en esta clase JUnit Test Case
		registro = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		// Inicializamos la propiedad "Usuario"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		usuario = new Usuario("Usuario", "usuario@mail.es", "Usu123");
	}

	@AfterEach
	void tearDown() throws Exception {
		// Aseguramos que después de la ejecución de
		// cualquier método de prueba, el registro
		// no tenga usuarios
		for (int index = 0; index < registro.getUsuarios().length; index++) {
			registro.setUsuario(null, index);
		}
	}

	@Test
	@Order(1)
	@DisplayName("Primer método en ejecutarse, para comprobar si el registro está vacío")
	void testRegistroVacio() {
		// fail("Not yet implemented");

		// Comprobamos que inicialmente el registro no tiene usuarios
		assertTrue(Utilidad.registroVacio(registro));

		// Añadimos un usuario al registro, para comprobar cuando no está vacío
		registro.setUsuario(usuario, 0);

		// Comprobamos que ahora el registro tiene algún usuario
		assertFalse(Utilidad.registroVacio(registro));
	}

	@Test
	@Order(2)
	void testRegistroLleno() {
		fail("Not yet implemented");
	}

	@Test
	@Order(3)
	void testPosicionDisponible() {
		fail("Not yet implemented");
	}

	@Test
	@Order(4)
	void testEmailUnico() {
		fail("Not yet implemented");
	}

	@Test
	@Order(5)
	void testUsuarioRepetido() {
		fail("Not yet implemented");
	}

	@Test
	@Order(6)
	@DisplayName("Sexto método en ejecutarse, para comprobar la posición del primer Usuario")
	void testPosicionUsuario() {
		// fail("Not yet implemented");

		// Si se inserto el usuario...
		if (Gestion.addUser(registro, usuario)) {
			// comprobaremos que la posición de nuestro "Usuario"
			// es la primera
			assertEquals(Utilidad.posicionUsuario(registro, usuario), 0);
		} else {
			// Sino se insertó dará fallo.
			fail("No se insertó el usuario");
		}
	}

	@Test
	@Order(7)
	void testPasswordValido() {
		fail("Not yet implemented");
	}

	@Test
	@Order(8)
	void testEmailValido() {
		fail("Not yet implemented");
	}

}