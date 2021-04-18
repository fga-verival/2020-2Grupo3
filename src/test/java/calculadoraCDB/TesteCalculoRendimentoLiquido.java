package calculadoraCDB;

import org.junit.Test;
import static org.junit.Assert.*;

import calculadoraCDB.Calculadora;

public class TesteCalculoRendimentoLiquido {
    @Test public void testAppHasAGreeting() {
        Calculadora classUnderTest = new Calculadora();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
