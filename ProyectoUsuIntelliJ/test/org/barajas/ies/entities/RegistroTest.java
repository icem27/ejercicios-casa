package org.barajas.ies.entities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegistroTest {

    // Objeto registro simulado con "Mockito"
    private static Registro mockRegistro;

    // Declaramos las variables como indicas en la tarea:
    private final String NOMBRE = "Ismael";
    private final String EMAIL = "icem27@educamadrid.org";
    private final String PASSWORD = "Isma123";

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
            usuarios[i]=new Usuario(NOMBRE+i, "ismael"+i+"@educamadrid.es","Isma12"+0);
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