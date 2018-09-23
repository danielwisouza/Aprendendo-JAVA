package br.gov.fatec.calculando;

public class Paralelograma extends FiguraGeometrica implements Calculable {

	public Paralelograma(final double base,final double altura) {
		this.setBase(base);
		this.setAltura(altura);
		
	}
	
	@Override
	public double calcularArea() {
		return (getBase()*getAltura());
	}
	
	@Override
	public String toString() {
		return "Area do Paralelograma: " + calcularArea();
	}
}