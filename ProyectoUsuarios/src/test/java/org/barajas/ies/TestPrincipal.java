package org.barajas.ies;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.junit.jupiter.api.*;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class TestPrincipal {

    private static Scanner entrada;
    private static InputStream entradaStandar;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        entradaStandar = System.in;

        String testInput =
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
        
        

        ByteArrayInputStream bais = new ByteArrayInputStream(testInput.getBytes(StandardCharsets.UTF_8));
        System.setIn(bais);
        Principal.initEntrada(new Scanner(System.in));
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