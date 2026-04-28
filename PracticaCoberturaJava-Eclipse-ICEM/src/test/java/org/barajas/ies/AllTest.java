package org.barajas.ies;

import org.barajas.ies.entities.TestRegistro;
import org.barajas.ies.services.TestGestion;
import org.barajas.ies.util.TestUtilidad;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses( { TestUtilidad.class, TestGestion.class, TestRegistro.class, TestPrincipal.class })
public class AllTest {
}