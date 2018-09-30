package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Pirâmide;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PirâmideTest {
	Pirâmide cut = new Pirâmide(4, 5);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(9, resposta,0.1);
	}
}