package br.gov.fatec.calculando;

public class Hexagono extends FiguraGeometrica implements Calculable {

	public Hexagono(final double lado) {
		this.setLado(lado);
	}
	
	@Override
	public double calcularArea() {
		return ((3*(Math.sqrt(3))/2)/2)*(getLado()*getLado());
	}
}