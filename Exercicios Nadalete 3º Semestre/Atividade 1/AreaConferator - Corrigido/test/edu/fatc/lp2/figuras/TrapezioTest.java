package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Trapezio;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TrapezioTest {
	Trapezio cut = new Trapezio(4.0, 2.0, 3.0);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(9, resposta,0.1);
	}
}