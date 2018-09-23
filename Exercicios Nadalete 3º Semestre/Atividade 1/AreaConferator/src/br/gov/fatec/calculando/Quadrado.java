package br.gov.fatec.calculando;

public class Quadrado extends FiguraGeometrica implements Calculable {

	public Quadrado(final double lado) {
		this.setLado(lado);
	}
	
	@Override
	public double calcularArea() {
		return getLado() * 2;
	}

	@Override
	public String toString() {
		return "Area do Quadrado: " + calcularArea();
	}
	
	

}