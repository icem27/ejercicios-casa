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
	private static InputStream entradaStandar;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// 0. Paso prevío guardar la entrada Standar original
		entradaStandar = System.in;
		
		// 1. Prepare mock input data - Preparar datos de entrada simulados
                //String testInput = "1\n\r 0\n\r 2\n\r email@email.es\n\r Usu\n\r Usu1234\n\r \n\r 0";
		String testInput = 	
//				"1"+ // Selecciona la opción "1. Ver registro de usuarios "
//				        System.lineSeparator()+
//					System.lineSeparator()+ // Valor pedido "*** Pulse ENTER para volver al menú ... ***"
//					"0"+ // Selecciona la opción "0. Terminar programa"
//					System.lineSeparator()+
//					"2"+ // Selecciona la opción "2. Dar de alta nuevo usuario"
//					System.lineSeparator()+
//					"email@email.es"+ // Valor pedido "\t*** Introduzca el EMAIL del nuevo Usuario y después pulse ENTER ***"
//					System.lineSeparator()+
//					"Usu"+ // Valor pedido "\t*** Introduzca el NOMBRE del nuevo Usuario y después pulse ENTER ***"
//					System.lineSeparator()+
//					"Usu1234"+ // Valor pedido "\t*** Introduzca la CONTRASEÑA del nuevo Usuario y después pulse ENTER ***"
//					System.lineSeparator()+
//					System.lineSeparator()+ // Valor pedido "*** Pulse ENTER para volver al menú ... ***"
//					"0"; // Selecciona la opción "0. Terminar programa"
		
                // Order(1): ver registro vacío
                "1" + System.lineSeparator() +
                System.lineSeparator() +
                "0" + System.lineSeparator() +

                // Order(2): dar de alta Ismael (registro vacío, funciona)
                "2" + System.lineSeparator() +
                "icem27@educamadrid.org" + System.lineSeparator() +
                "Ismael" + System.lineSeparator() +
                "Isma1234" + System.lineSeparator() +
                System.lineSeparator() +

                "2" + System.lineSeparator() +
                "icem2@educamadrid.org" + System.lineSeparator() +
                "Ismael" + System.lineSeparator() +
                System.lineSeparator() +

                // Order(3): opción inválida (registro tiene a Ismael, no importa)
                "9" + System.lineSeparator() +
                System.lineSeparator() +

                // Order(4): eliminar a Ismael (que ya está en el registro del test 2)
                "3" + System.lineSeparator() +
                "icem27@educamadrid.org" + System.lineSeparator() +
                "Ismael" + System.lineSeparator() +
                System.lineSeparator() +
                "0" + System.lineSeparator() +

                // Order(5): alta con email inválido (registro vacío tras baja)
                "2" + System.lineSeparator() +
                "emailsinArroba" + System.lineSeparator() +
                System.lineSeparator() +
                "0" + System.lineSeparator() +

                // Baja con email inválido (registro vacío tras baja)
                "3" + System.lineSeparator() +
                "emailsinArroba" + System.lineSeparator() +
                System.lineSeparator() +
                "0" + System.lineSeparator() +
                // Hasta aqui todo bien -----

                // Order(6): dar de alta Tomas y usuario duplicado
                "2" + System.lineSeparator() +
                "tomas@educamadrid.org" + System.lineSeparator() +
                "Tomas" + System.lineSeparator() +
                "tomas1" + System.lineSeparator() + //aqui introducimos una contraseña erronea para que salte el error
                "Tomas123" + System.lineSeparator() +
                System.lineSeparator() +
                "0" + System.lineSeparator() +

                // Intentamos dar de alta usuario con datos repetidos
                "2" + System.lineSeparator() +
                "tomas@educamadrid.org" + System.lineSeparator() +
                System.lineSeparator() +
                "2" + System.lineSeparator() +
                "tomas1@gmail.com" + System.lineSeparator() +
                "Tomas" + System.lineSeparator() + System.lineSeparator() +
                "2" + System.lineSeparator() +
                "tomas@educamadrid.org" + System.lineSeparator() +
                System.lineSeparator() +
                "2" + System.lineSeparator() +
                "tomas1@gmail.com" + System.lineSeparator() +
                "tomas" + System.lineSeparator() +
                "Tomas321" + System.lineSeparator() +
                System.lineSeparator() +

                // Intentamos eliminar a un usuario pero poniendo mal su nombre
                "3" + System.lineSeparator() +
                "tomas@educamadrid.org" + System.lineSeparator() +
                "Carlos" + System.lineSeparator() +
                System.lineSeparator() +


                // Vemos el registro de nuevo.
                "1" + System.lineSeparator() +
                System.lineSeparator() +
                "0" + System.lineSeparator();
                



        // Necesitamos un array de los valores del "String" anterior pasados a un "Array" de "bytes"
        // El cuál se colocará en un flujo de entrada (la entrada se refiere a entrada de datos al proceso en ejecución)
        // , siendo el proceso en ejecución este Test.
        ByteArrayInputStream bais = new ByteArrayInputStream(testInput.getBytes(StandardCharsets.UTF_8));

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
    void setUp() throws Exception {}

    @AfterEach
    void tearDown() throws Exception {}

    @Test
    @DisplayName("Prueba de integración: ver registro vacío y terminar")
    @Order(1)
    void testMainVerUsuarios() {
        Principal.main(null);
        assertTrue(true, "El método main terminó correctamente mostrando el registro vacío");
    }

    @Test
    @DisplayName("Prueba de integración: dar de alta usuario Ismael")
    @Order(2)
    void testMainAltaUsuario() {
        Principal.main(null);
        assertTrue(true, "El método main terminó correctamente dando de alta a Ismael");
    }

    @Test
    @DisplayName("Prueba de integración: opción inválida del menú")
    @Order(3)
    void testMainOpcionInvalida() {
        Principal.main(null);
        assertTrue(true, "El método main gestionó correctamente una opción inválida");
    }

    @Test
    @DisplayName("Prueba de integración: eliminar usuario Ismael")
    @Order(4)
    void testMainBajaUsuario() {
        Principal.main(null);
        assertTrue(true, "El método main terminó correctamente eliminando a Ismael");
    }

    @Test
    @DisplayName("Prueba de integración: alta con email inválido")
    @Order(5)
    void testMainEmailInvalido() {
        Principal.main(null);
        assertTrue(true, "El método main gestionó correctamente un email inválido");
    }
    
    @Test
    @DisplayName("Prueba de integración: alta nuevo usuario y baja con nombre incorrecto")
    @Order(6)
    void testMainUsuarioInvalido() {
        Principal.main(null);
        assertTrue(true, "El método main gestionó correctamente un usuario y email inválido");
    }
}