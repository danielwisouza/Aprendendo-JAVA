package edu.fatc.lp2.figuras;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.fatec.lp2.FiguraType;
import edu.fatec.lp2.factory.Factory;
import edu.fatec.lp2.factory.FiguraFactory;
import edu.fatec.lp2.figuras.Calculable;
import edu.fatec.lp2.figuras.Cilindro;
import edu.fatec.lp2.figuras.Circulo;
import edu.fatec.lp2.figuras.Cubo;
import edu.fatec.lp2.figuras.Esfera;
import edu.fatec.lp2.figuras.Hexagono;
import edu.fatec.lp2.figuras.Losango;
import edu.fatec.lp2.figuras.Paralelograma;
import edu.fatec.lp2.figuras.Quadrado;
import edu.fatec.lp2.figuras.Retangulo;
import edu.fatec.lp2.figuras.Trapezio;
import edu.fatec.lp2.figuras.Triangulo;

@RunWith(Parameterized.class)
public class FiguraFactoryTest {
		private Factory<Calculable, FiguraType> cut;
		private Class<Calculable> expectedClass;
		private FiguraType type;
		private double[] parameters;
	
		public FiguraFactoryTest(final FiguraType pType, final Class<Calculable> pExpectedClass, final double...pParameters) {
			this.cut = new FiguraFactory();
			this.expectedClass = pExpectedClass;
			this.type = pType;
			this.parameters = pParameters;
		}
		
		@Test
		public void testCalculoFigurasGeometricas() {
			Assert.assertTrue(cut.create(type, parameters).getClass().equals(expectedClass));
		}
		
		 @Parameters(name= "{index}: {0} = expected: {1}")
	     public static Iterable<Object[]> data() {
	         return Arrays.asList(
	        		 new Object[][] { 
	        			 { FiguraType.CIRCULO, Circulo.class, new double[]{2.0}}, 
	        			 { FiguraType.CUBO, Cubo.class, new double[]{2.5} }, 
	        			 { FiguraType.HEXAGONO, Hexagono.class, new double[]{3.5} },
	        			 { FiguraType.LOSANGO, Losango.class, new double[]{4.5, 3.5} }, 
	        			 { FiguraType.PARALELOGRAMA, Paralelograma.class, new double[]{15.0, 7.5} },
	        			 { FiguraType.QUADRADO, Quadrado.class, new double[]{4.0}},
	        			 { FiguraType.RETANGULO, Retangulo.class, new double[]{4.0, 2.0}},
	        			 { FiguraType.TRAPEZIO, Trapezio.class, new double[]{4.0, 2.0, 3.0}},
	        			 { FiguraType.TRIANGULO, Triangulo.class, new double[]{4.0, 2.0}},

	        		 });
	     }
}
