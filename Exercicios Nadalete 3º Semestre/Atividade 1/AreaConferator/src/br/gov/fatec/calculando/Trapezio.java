package br.gov.fatec.calculando;

public class Trapezio extends FiguraGeometrica implements Calculable {

	public Trapezio(final double baseMaior,final double baseMenor,final double altura) {
		this.setBaseMaior(baseMaior);
		this.setBaseMenorr(baseMenor);
		this.setAltura(altura);
	}
	
	@Override
	public double calcularArea() {
		return (((getBaseMenor()-getBaseMenor())*getAltura())/2);
	}
}