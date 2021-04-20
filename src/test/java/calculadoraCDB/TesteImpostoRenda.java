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
public class TesteImpostoRenda {
	private double 	tempo,
                    valorInicial,
					juros,
                    ImpostoRenda;
	

	public TesteImpostoRenda (double tempo, double valorInicial, double juros, double ImpostoRenda) {
		this.tempo = tempo;
		this.valorInicial = valorInicial;
		this.juros = juros;
        this.ImpostoRenda = ImpostoRenda;
	}
	
	@Parameters
	public static Iterable<Object[]> getParameters() {
		Object[][] resposta = new Object[][] {
			{60F, 1000F, 8.5F, 3.14F},
			{120F, 500F, 8F, 2.96F},
			{240F, 3000F, 9F, 35.51F},
			{420F, 250F, 8F, 4.03F},
            {550F, 400F, 8F, 8.44F},
            {670F, 800F, 8F, 20.56F},
           {700F, 2500F, 9F, 75.51F}
		};
		
		return Arrays.asList(resposta);
	}
	
	@Test
	public void test() {
        Calculadora calculadora = new Calculadora(valorInicial, juros, tempo);
        assertEquals(ImpostoRenda, calculadora.getImpostoRenda(), 0.1F);
	}
}
