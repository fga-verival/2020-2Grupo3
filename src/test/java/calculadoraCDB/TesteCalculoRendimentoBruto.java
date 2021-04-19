package calculadoraCDB;

import org.junit.Test;
import static org.junit.Assert.*;

import calculadoraCDB.Calculadora;

public class TesteCalculoRendimentoBruto {


    @Test public void TesteCalculoRendimentoBruto1() {
        Calculadora calculadora = new Calculadora(1000, 8.5, 60);
        assertEquals(13.97F, calculadora.getRendimentoBruto(), 0.01f);
    }
}
