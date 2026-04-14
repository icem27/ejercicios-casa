package org.barajas.ies.entities;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestRegistro {
	
	// Objeto registro simulado con "Mockito"
	private static Registro mockRegistro;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// crearemos un "Regitro" simulado manualmente sin usar la anotación @Mock
		mockRegistro = Mockito.mock(Registro.class);
		
	}
	
	@Test
	@DisplayName("Método que utilizará un objeto simulado para comprobar que la salida esperada es la preparada")
	void testGetUsusarios() {
		// Preparamos el array de "Usuario"s que devolverá nuestro objeto "Registro" simulado
		Usuario[] usuarios = new Usuario[3];
		for(int i = 0; i < usuarios.length; i++) {
			usuarios[i]=new Usuario("Usuario "+i, "usu"+i+"@nomail.es","1234"+0);
		}
		
		// Marcamos que cuando se llame al método "getUsuarios" del objeto simulado
		// "mockRegistro" de la clase "Registro" se devuelva el array antes preparado.
		Mockito.when(mockRegistro.getUsuarios()).thenReturn(usuarios);
		
		// Luego ejecutaremos un método en el "mock" (del objetos simulado)
		assertEquals(3,mockRegistro.getUsuarios().length);
		
		System.out.println("Se recuperó un registro simulado con sólo 3 usuarios");
		
		// confirmamos que invocamos el método "getUsuarios" en la simulación
		Mockito.verify(mockRegistro).getUsuarios();
	}
	

} 
  