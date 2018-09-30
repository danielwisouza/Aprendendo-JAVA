package edu.fatc.lp2.figuras;

import org.junit.Test;
import edu.fatec.lp2.figuras.Esfera;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class EsferaTest {
	Esfera cut = new Esfera(2.0);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(50.26, resposta,0.1);
	}
}