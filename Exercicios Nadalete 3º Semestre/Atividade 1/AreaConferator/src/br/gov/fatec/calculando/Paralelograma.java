package br.gov.fatec.calculando;

public class Paralelograma extends FiguraGeometrica implements Calculable{
	public Paralelograma(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return area = (base * altura);
	}
}