package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Paralelograma;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class ParalelogramaTest {
	Paralelograma cut = new Paralelograma(15.0,  7.5);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(112.5, resposta,0.1);
	}
}