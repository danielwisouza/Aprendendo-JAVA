package edu.fatec.lp2.figuras;

public class Pirâmide implements Calculable {
	private double base;
	private double lado;
	
	public Pirâmide(final double pBase,final double pLado) {
		base = pBase;
		lado = pLado;
		
	}

	@Override
	public double calcularArea() {
		return base+lado;
		
	}
	 
}