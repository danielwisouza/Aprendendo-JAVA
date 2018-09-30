package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Losango;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LosangoTest {
	Losango cut = new Losango(4.5, 3.5);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(7.8, resposta,0.1);
	}
}
