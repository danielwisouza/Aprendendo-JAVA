package edu.fatec.lp2.figuras;

public class Esfera implements Calculable {
	private double raio;
	
	public Esfera(final double pRaio) {
		raio = pRaio;
	}

	@Override
	public double calcularArea() {
		Calculable c = new Circulo(raio);
		return c.calcularArea()*4;
	}
	
}
