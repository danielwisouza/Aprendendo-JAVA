package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Circulo;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CirculoTest {
	Circulo cut = new Circulo(2.0);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(12.5, resposta,0.1);
	}
	}