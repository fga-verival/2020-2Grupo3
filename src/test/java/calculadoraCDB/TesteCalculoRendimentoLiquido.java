package calculadoraCDB;

import org.junit.Test;
import static org.junit.Assert.*;

import calculadoraCDB.Calculadora;

public class TesteCalculoRendimentoLiquido {
    @Test public void TesteCalculoRendimentoLiquido() {
        Calculadora calculadora = new Calculadora(1000, 8.5, 60);
        assertEquals(1.0829, calculadora.getRendimentoLiquido(), 0.1F);
    }

    @Test public void TesteCalculoRendimentoLiquido2() {
        Calculadora calculadora = new Calculadora(500, 8, 120);
        assertEquals(2.0384, calculadora.getRendimentoLiquido(), 0.1F);
    }
}
