package org.barajas.ies;

import org.barajas.ies.entities.Registro;
import org.barajas.ies.services.GestionTest;
import org.barajas.ies.util.UtilidadTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({PrincipalTest.class,UtilidadTest.class, GestionTest.class, Registro.class})
public class AllTests {
}