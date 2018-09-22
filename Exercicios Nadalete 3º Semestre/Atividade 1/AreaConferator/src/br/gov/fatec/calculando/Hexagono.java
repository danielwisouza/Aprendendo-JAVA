package br.gov.fatec.calculando;

public class Hexagono extends FiguraGeometrica implements Calculable{
	public Hexagono(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return area = ((3*(Math.sqrt(3))/2)/2)*(lado*lado);
	}
}