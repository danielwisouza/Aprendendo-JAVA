package br.gov.fatec.calculando;

public class Quadrado extends FiguraGeometrica implements Calculable{
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return area = (lado * lado);
	}
}