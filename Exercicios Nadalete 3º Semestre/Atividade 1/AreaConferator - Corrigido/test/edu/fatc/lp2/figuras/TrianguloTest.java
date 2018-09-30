package edu.fatc.lp2.figuras;

import org.junit.Test;


import edu.fatec.lp2.figuras.Triangulo;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TrianguloTest {
	Triangulo cut = new Triangulo(5, 6);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(15, resposta,0.1);
	}
}
