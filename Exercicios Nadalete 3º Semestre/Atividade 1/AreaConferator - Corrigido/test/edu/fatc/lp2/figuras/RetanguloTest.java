package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Retangulo;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class RetanguloTest {
	Retangulo cut = new Retangulo(4, 4);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(16, resposta,0.1);
	}
}
