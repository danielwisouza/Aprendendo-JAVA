package br.gov.fatec.calculando;

public class Circulo extends FiguraGeometrica implements Calculable {

	public Circulo(final double raio) {
		this.setRaio(raio);
	}
	
	@Override
	public double calcularArea() {
		return (3.14 * Math.pow(getRaio(), 2)); 
	}
}
