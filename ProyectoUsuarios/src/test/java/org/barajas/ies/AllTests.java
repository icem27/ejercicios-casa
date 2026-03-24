package org.barajas.ies;

import org.barajas.ies.services.TestGestion;
import org.barajas.ies.util.TestUtilidad;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {

		// Creamos una nueva instacia de una clase TestSuite (en este caso de JUnit3)
		TestSuite suite = new TestSuite("Tests de las clases del Proyecto");

		// Añadimos las clases JUnit Test Case que dicho TestSuite debe ejecutar
		suite.addTestSuite(TestUtilidad.class);
		suite.addTestSuite(TestGestion.class);

		// Devolvemos la instancia del "TestSuite"
		return suite;
	}
}
  