package br.gov.fatec.calculando;

public class Trapezio extends FiguraGeometrica implements Calculable{
	public Trapezio(double baseMaior, double baseMenor, double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return area = (((baseMaior-baseMenor)*altura)/2);
	}
}