package calculadoraCDB;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;


import calculadoraCDB.Calculadora;

@RunWith(Parameterized.class)
public class TesteCalculoRendimentoLiquido {
    private double 	tempo,
    valorInicial,
    juros,
    rendimentoLiquido;


    public TesteCalculoRendimentoLiquido(double tempo, double valorInicial, double juros, double rendimentoLiquido) {
        this.tempo = tempo;
        this.valorInicial = valorInicial;
        this.juros = juros;
        this.rendimentoLiquido = rendimentoLiquido;
    }

    @Parameters
    public static Iterable<Object[]> getParameters() {
    Object[][] resposta = new Object[][] {
    {60F, 1000F, 8.5F, 1.0829F},
    {120F, 500F, 8F, 2.0384F},
    {240F, 3000F, 9F, 4.7342F},
    {420F, 250F, 8F, 7.5945F},
    {550F, 400F, 8F, 9.9452F},
    {670F, 800F, 8F, 12.1151F},
    {700F, 2500F, 9F, 14.2397F}
    };

    return Arrays.asList(resposta);
    }

    @Test
    public void test() {
    Calculadora calculadora = new Calculadora(valorInicial, juros, tempo);
    assertEquals(rendimentoLiquido, calculadora.getRendimentoLiquido(), 0.1F);
    }
}
