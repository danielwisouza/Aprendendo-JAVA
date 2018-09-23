package br.gov.fatec.calculando;

public class Cubo extends FiguraGeometrica implements Calculable {

	public Cubo(final double lado) {
		this.setLado(lado);
	}
	
	@Override
	public double calcularArea() {
		return (6*(getLado()*getLado())); 
	}
	
	@Override
	public String toString() {
		return "Area do Cubo: " + calcularArea();
	}
}