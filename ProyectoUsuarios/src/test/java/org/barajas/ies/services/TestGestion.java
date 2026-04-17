package org.barajas.ies.services;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.barajas.ies.entities.Registro;
import org.barajas.ies.entities.Usuario;
import org.barajas.ies.util.Utilidad;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.MockedStatic;
import org.mockito.MockedStatic.Verification;
import org.mockito.Mockito;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class TestGestion {

	// Propiedad estática de la clase
	private static Registro registro;

	// Propiedad de la clase
	private Usuario usuario;
	
	// Declaramos las variables como indicas en la tarea: 
	private final String NOMBRE = "Ismael";
	private final String EMAIL = "icem27@educamadrid.org";
	private final String PASSWORD = "Isma123";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// Inicializamos la propiedad "Registro"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		// Antes de la ejecución de cualquier método
		registro = Registro.getInstance();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// Limpiamos el contenido de la propiedad "Registro"
		// tras la ejecución de todos los métodos a probar
		// en esta clase JUnit Test Case
		registro = null;
	}

	@BeforeEach
	@DisplayName("Ejecuta método anotado con \"@BeforeEach\"")
	void setUp() throws Exception {
		// Inicializamos la propiedad "Usuario"
		// para tenerla disponible en los diferentes
		// métodos de prueba
		usuario = new Usuario(NOMBRE, EMAIL, PASSWORD);
	}

	@AfterEach
	@DisplayName("Ejecuta método anotado con \"@AfterEach\"")
	void tearDown() throws Exception {
		// Aseguramos que después de la ejecución de
		// cualquier método de prueba, el registro
		// no tenga usuarios
		for (int index = 0; index < registro.getUsuarios().length; index++) {
			registro.setUsuario(null, index);
		}
	}

	@Test
	@DisplayName("Primer método en ejecutarse, para comprobar si se inserta el Usuario en el Registro")
	@Order(1)
	void testAddUser() {

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
	@Order(2)
	@DisplayName("Segundo método en ejecutarse, para comprobar si se elimina el Usuario en el Registro")
	void testRemoveUser() {
		Gestion.addUser(registro, usuario);
		assertTrue(Gestion.removeUser(registro, usuario));
	}
	
	
	
	@Test
	@DisplayName("Tercer método en ejecutarse, para comprobar si se inserta el Usuario en el Registro Simulado")
	@Order(3)
	void testMockAddUser() {
		// crearemos un "Registro" simulado manualmente, sin usar la anotación @Mock
		Registro mockRegistro = Mockito.mock(Registro.class);
		// También necesitamos una "Utilidad" simulada
		// Pero al utilizar métodos estáticos (no se necesita un objeto de dicha clase para llamarlos)
		// Precisamos simular métodos estáticos usando un objeto "MockedStatic" de "Mockito" a partir su versión 3.4.0.
		MockedStatic<Utilidad> mockUtilidad = Mockito.mockStatic(Utilidad.class);
		
		
		// *** Preparamos la devolución de los métodos utilizados por el método "Gestion.addUser(..)"
		
		// Marcamos que cuando se llame al método "Utilidad.registroLleno(registro)" del ""MockedStatic"" simulado
		// "mockUtilidad" de la clase "Utilidad" devuelva "false".
		// NOTA, el argumento del método "MockedStatic.when" debe ser un objeto de la clase "Verification"
		// que al ser una "clase abstracta" nos obliga a proporcionar el código de sus "métodos abstractos"
		mockUtilidad.when(new Verification() {
			
			// Implementación del "método abstracto" (método que sólo define su declaración, no el código que implementa lo que hace)
			// "Verification.apply()". Dentro del mismo hay que indicar cuál sería el método estático que se utilizaría si no se simulara
			// la llamada.
			@Override
			public void apply() throws Throwable {
				Utilidad.registroLleno(mockRegistro);
				
			}
		}).thenReturn(false);
		
		
		// Marcamos que cuando se llame al método "Utilidad.usuarioRepetido(registro, usuario)" del objeto simulado
		// "mockUtilidad" de la clase "Utilidad" devuelva "false".
		mockUtilidad.when(new Verification() {
			
			@Override
			public void apply() throws Throwable {
				Utilidad.usuarioRepetido(mockRegistro, usuario);
			}
		}).thenReturn(false);
			
		// Marcamos que cuando se llame al método "Utilidad.posicionDisponible(registro)" del objeto simulado
		// "mockUtilidad" de la clase "Utilidad" devuelva "0".
		mockUtilidad.when(new Verification() {
			
			@Override
			public void apply() throws Throwable {
				Utilidad.posicionDisponible(mockRegistro);
			}
		}).thenReturn(0);
		
		// Luego ejecutaremos un método con el "mock" (del objetos simulado)
		assertTrue(Gestion.addUser(mockRegistro, usuario));
		
		// *** Confirmamos que se ejecutaron los métodos utilizados por el método "Gestion.addUser(...)" en los objetos simulados
		// NOTA: Sólo se deben simular los métodos NO estáticos llamados a través de objetos simulados.
		Mockito.verify(mockRegistro).setUsuario(usuario, 0);
		
		// La variable "mockUtilidad" representa un simulacro con un alcance explícito local. 
		// Es importante tener en cuenta que los simulacros con alcance deben ser cerrados por la entidad que los activa. 
		// Por eso se cierra al finalizar el bloque con alcance.

		mockUtilidad.close();
		
	}

	@Test
	@Order(4)
	void testMockRemoveUser() {
	    Registro mockRegistro = Mockito.mock(Registro.class);
	    MockedStatic<Utilidad> mockUtilidad = Mockito.mockStatic(Utilidad.class);

	    // Cuando se llame a posicionUsuario, devolvemos posición 0
	    mockUtilidad.when(new Verification() {
	        @Override
	        public void apply() throws Throwable {
	            Utilidad.posicionUsuario(mockRegistro, usuario);
	        }
	    }).thenReturn(0);

	    // Ejecutamos removeUser con el mock
	    assertTrue(Gestion.removeUser(mockRegistro, usuario));

	    // Verificamos que se llamó a setUsuario(null, 0) en el mock
	    Mockito.verify(mockRegistro).setUsuario(null, 0);

	    mockUtilidad.close();
	}
}