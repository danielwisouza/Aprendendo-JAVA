package br.gov.fatec.calculando;

public class Retangulo extends FiguraGeometrica implements Calculable{
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return area = (base * altura);
	}
}