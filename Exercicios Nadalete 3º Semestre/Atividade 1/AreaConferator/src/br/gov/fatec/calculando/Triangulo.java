package br.gov.fatec.calculando;

public class Triangulo extends FiguraGeometrica implements Calculable{
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return area = ((base * altura)/2);
	}
}