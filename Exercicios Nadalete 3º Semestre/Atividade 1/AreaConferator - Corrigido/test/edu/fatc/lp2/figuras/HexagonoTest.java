package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Hexagono;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HexagonoTest {
	Hexagono cut = new Hexagono(3.5);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(31.8, resposta,0.1);
	}
}