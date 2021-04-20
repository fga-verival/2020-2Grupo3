package calculadoraCDB;

import org.junit.Test;
import static org.junit.Assert.*;

import calculadoraCDB.Calculadora;

public class TesteImpostoRenda {
    @Test public void TesteCalculoImpostoRenda1() {
        Calculadora calculadora = new Calculadora(1000, 8.5, 60);
        assertEquals(3.14, calculadora.getImpostoRenda(), 0.1F);
    }

    @Test public void TesteCalculoImpostoRenda2() {
        Calculadora calculadora = new Calculadora(500, 8, 120);
        assertEquals(2.96, calculadora.getImpostoRenda(), 0.1F);
    }
}
