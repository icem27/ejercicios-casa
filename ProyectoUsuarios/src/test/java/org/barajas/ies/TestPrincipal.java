package org.barajas.ies;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class TestPrincipal {
	
	private static Scanner entrada;
	private static InputStream entradaStandar; //input stream flujo de entrada de datos a mi proceso
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// 0. Paso prevío guardar la entrada Standar original
		entradaStandar = System.in;
		
		// 1. Prepare mock input data - Preparar datos de entrada simulados
                //String testInput = "1\n\r 0\n\r 2\n\r email@email.es\n\r Usu\n\r Usu1234\n\r \n\r 0";
		String testInput = 	"1"+ // Selecciona la opción "1. Ver registro de usuarios "
				        System.lineSeparator()+
					System.lineSeparator()+ // Valor pedido "*** Pulse ENTER para volver al menú ... ***"
					"0"+ // Selecciona la opción "0. Terminar programa"
					System.lineSeparator()+
					"2"+ // Selecciona la opción "2. Dar de alta nuevo usuario"
					System.lineSeparator()+
					"email@email.es"+ // Valor pedido "\t*** Introduzca el EMAIL del nuevo Usuario y después pulse ENTER ***"
					System.lineSeparator()+
					"Usu"+ // Valor pedido "\t*** Introduzca el NOMBRE del nuevo Usuario y después pulse ENTER ***"
					System.lineSeparator()+
					"Usu1234"+ // Valor pedido "\t*** Introduzca la CONTRASEÑA del nuevo Usuario y después pulse ENTER ***"
					System.lineSeparator()+
					System.lineSeparator()+ // Valor pedido "*** Pulse ENTER para volver al menú ... ***"
					"0"; // Selecciona la opción "0. Terminar programa"
		
		// Necesitamos un array de los valores del "String" anterior pasados a un "Array" de "bytes"
		// El cuál se colocará en un flujo de entrada (la entrada se refiere a entrada de datos al proceso en ejecución)
		// , siendo el proceso en ejecución este Test.
                ByteArrayInputStream bais = new ByteArrayInputStream(testInput.getBytes(StandardCharsets.UTF_8));
                //Flujo de entrada de datos.....

                // 2. Redirect System.in (temporarily) - Redirigir System.in (temporalmente)
                // Y con este flujo de datos de entrada en formato de array de bytes
                // podemos "conectarlo con la entrada estándar de datos de dicho proceso.
                System.setIn(bais);

                // 3. Create the Scanner with the redirected input - Crea el escáner con la entrada redirigida
                // El "Scanner" necesita utilizar una entrada, que en este caso será sustituida,
                // no siendo la tradicional entrada estandar de datos por consola,
                // sino el flujo de datos de entrada que contendrá nuestro array de bytes
                // resultado de convertir nuestro "String" de la variable local "testInput"
                Scanner scanner = new Scanner(System.in);

                // 4. Asignar dicho escáner al utilizado por la clase "Principal"
                // Reemplazando el valor de la propiedad "entrada" que tiene que contener
                // un objeto "Scanner" por este "Scanner" adaptado.
                Principal.initEntrada(scanner);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.setIn(entradaStandar);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba para ver los usurios registrados")
	@Order(2)
	void testMainAltaUsuario() {
		Principal.main(null);
		assertTrue(true, "No terminó el método main de mostrar el registro de usuarios");
	}
	
	@Test
	@DisplayName("Prueba para ver los usurios registrados")
	@Order(1) //para usar lo del order hay que poner arriba esto: @TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
	void testMainVerUsuarios() {
		Principal.main(null);
		assertTrue(true, "No terminó el método main de mostrar el registro de usuarios");
	}

}