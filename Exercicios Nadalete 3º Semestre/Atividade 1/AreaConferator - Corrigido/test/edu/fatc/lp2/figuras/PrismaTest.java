package edu.fatc.lp2.figuras;

import org.junit.Test;

import edu.fatec.lp2.figuras.Prisma;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PrismaTest {
	Prisma cut = new Prisma(4);
	
	@Test
	public void calculaAreaTest() {
		Double resposta = cut.calcularArea();
		Assert.assertEquals(16, resposta,0.1);
	}
}