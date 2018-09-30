package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Quadrado;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class QuadradoTest {
	Quadrado cut = new Quadrado(2);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(4, resposta,0.1);
	}
}
