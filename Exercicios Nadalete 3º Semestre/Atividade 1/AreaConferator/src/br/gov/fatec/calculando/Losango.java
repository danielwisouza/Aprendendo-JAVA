package br.gov.fatec.calculando;

public class Losango extends FiguraGeometrica implements Calculable{
	public Losango(double base, double altura) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return area = base*altura;
	}
}