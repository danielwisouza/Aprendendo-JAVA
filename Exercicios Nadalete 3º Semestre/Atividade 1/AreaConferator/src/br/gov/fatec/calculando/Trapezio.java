package br.gov.fatec.calculando;

public class Trapezio extends FiguraGeometrica implements Calculable {

	public Trapezio(final double baseMaior,final double baseMenor,final double altura) {
		this.setBaseMaior(baseMaior);
		this.setBaseMenorr(baseMenor);
		this.setAltura(altura);
	}
	
	@Override
	public double calcularArea() {
		return (((getBaseMaior()-getBaseMenor())*getAltura())/2);
	}
	
	@Override
	public String toString() {
		return "Area do Trapezio: " + calcularArea();
	}
}