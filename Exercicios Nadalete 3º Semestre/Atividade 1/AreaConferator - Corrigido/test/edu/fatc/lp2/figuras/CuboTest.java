package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Cubo;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CuboTest {
	Cubo cut = new Cubo(2.5);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(37.5, resposta,0.1);
	}
}