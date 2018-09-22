package br.gov.fatec.calculando;

public class Cubo extends FiguraGeometrica implements Calculable{
	public Cubo(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return area = 6*(lado*lado);
	}
}
