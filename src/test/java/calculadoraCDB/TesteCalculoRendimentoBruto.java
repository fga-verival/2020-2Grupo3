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
public class TesteCalculoRendimentoBruto {

	private double 	tempo,
                    valorInicial,
					juros,
                    rendimentoBruto;
	

	public TesteCalculoRendimentoBruto (double tempo, double valorInicial, double juros, double rendimentoBruto) {
		this.tempo = tempo;
		this.valorInicial = valorInicial;
		this.juros = juros;
        this.rendimentoBruto = rendimentoBruto;
	}
	
	@Parameters
	public static Iterable<Object[]> getParameters() {
		Object[][] resposta = new Object[][] {
			{60F, 1000F, 8.5F, 13.97F},
			{120F, 500F, 8F, 13.15F},
			{240F, 3000F, 9F, 177.53F},
			{420F, 250F, 8F, 23.01F},
            {550F, 400F, 8F, 48.22F},
            {670F, 800F, 8F, 117.48F},
           {700F, 2500F, 9F, 431.51F}
		};
		
		return Arrays.asList(resposta);
	}
	
	@Test
	public void test() {
        Calculadora calculadora = new Calculadora(valorInicial, juros, tempo);
        assertEquals(rendimentoBruto, calculadora.getRendimentoBruto(), 0.1F);
	}

}