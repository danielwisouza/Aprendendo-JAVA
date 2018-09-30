package edu.fatc.lp2.figuras;

import junit.framework.Assert;
import org.junit.Test;

import edu.fatec.lp2.figuras.*;

@SuppressWarnings("deprecation")
public class CilindroTest {
	Cilindro cut = new Cilindro(2.0);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(25.13, resposta,0.1);
	}
}
