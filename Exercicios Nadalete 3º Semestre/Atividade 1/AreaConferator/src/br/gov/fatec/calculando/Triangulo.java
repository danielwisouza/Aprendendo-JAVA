package br.gov.fatec.calculando;

public class Triangulo extends FiguraGeometrica implements Calculable {

	public Triangulo(final double base,final double altura) {
		this.setBase(base);
		this.setAltura(altura);
		
	}
	
	@Override
	public double calcularArea() {
		return ((getBase()*getAltura())/2);
	}
	
	@Override
	public String toString() {
		return "Area do Triangulo: " + calcularArea();
	}
}