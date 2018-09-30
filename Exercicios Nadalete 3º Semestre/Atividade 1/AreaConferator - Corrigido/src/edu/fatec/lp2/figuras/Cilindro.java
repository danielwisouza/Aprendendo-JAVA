package edu.fatec.lp2.figuras;

public class Cilindro implements Calculable {
	private double raio;
	
	public Cilindro(final double pRaio) {
		raio = pRaio;
	}

	@Override
	public double calcularArea() {
		Calculable c = new Circulo(raio);
		return (2*(c.calcularArea()));
	}
	
}