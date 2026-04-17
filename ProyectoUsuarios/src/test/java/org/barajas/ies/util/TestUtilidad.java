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
	
	// Declaramos las variables como indicas en la tarea: 
	private final String NOMBRE = "Ismael";
	private final String EMAIL = "icem27@educa.madrid.org";
	private final String PASSWORD = "Isma123";

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
		usuario = new Usuario(NOMBRE, EMAIL, PASSWORD);
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
		for(int i=0;i<registro.getUsuarios().length;i++) {
			registro.setUsuario(new Usuario(NOMBRE+i, EMAIL+i, PASSWORD),i);
		}
		assertTrue(Utilidad.registroLleno(registro));
	}

	@Test
	@Order(3)
	void testPosicionDisponible() {
		assertEquals(Utilidad.posicionDisponible(registro),0);
	}

	@Test
	@Order(4)
	void testEmailUnico() {
		assertTrue(Utilidad.emailUnico(registro, usuario.getEmail()));
	}

	@Test
	@Order(5)
	void testUsuarioRepetido() {
	    // Caso: usuario NO repetido (registro vacío → emailUnico devuelve true → repetido = false)
	    assertFalse(Utilidad.usuarioRepetido(registro, usuario));

	    // Añadimos el usuario y comprobamos que SÍ está repetido (mismo email)
	    registro.setUsuario(usuario, 0);
	    assertTrue(Utilidad.usuarioRepetido(registro, usuario));
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
	    // Caso válido: longitud 5, mayúscula, minúscula y número
	    assertTrue(Utilidad.passwordValido("Isma1"));

	    // Caso válido: longitud máxima (8)
	    assertTrue(Utilidad.passwordValido("Isma1234"));

	    // Caso inválido: demasiado corta (menos de 5)
	    assertFalse(Utilidad.passwordValido("Is1"));

	    // Caso inválido: demasiado larga (más de 8)
	    assertFalse(Utilidad.passwordValido("Ismael123"));

	    // Caso inválido: sin mayúsculas
	    assertFalse(Utilidad.passwordValido("isma1"));

	    // Caso inválido: sin minúsculas
	    assertFalse(Utilidad.passwordValido("ISMA1"));

	    // Caso inválido: sin números
	    assertFalse(Utilidad.passwordValido("Ismaeel"));
	}

	@Test
	@Order(8)
	void testEmailValido() {
	    // Caso inválido: sin @
	    assertFalse(Utilidad.emailValido("ismaeleduca.madrid.org"));

	    // Caso inválido: extensión demasiado larga (>4 chars)
	    assertFalse(Utilidad.emailValido("ismael@gmail.espana"));

	    // Caso inválido: cadena vacía / sin dominio
	    assertFalse(Utilidad.emailValido("ismael@"));
	    
	    // Caso válido: email simple con un punto (lo que acepta el regex)
	    assertTrue(Utilidad.emailValido("ismael@gmail.com"));

	    // Caso válido: otro email con un punto
	    assertTrue(Utilidad.emailValido("icem27@educamadrid.org"));

	}

}