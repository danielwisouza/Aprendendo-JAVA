package edu.fatec.lp2.figuras;

public class Prisma implements Calculable {
	private double lado;
	
	public Prisma(final double pLado) {
		lado = pLado;
	}

	@Override
	public double calcularArea() {
		Calculable c = new Triangulo(4, 2);
		return c.calcularArea()*lado;
		
	}
	 
}