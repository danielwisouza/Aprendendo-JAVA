package br.gov.fatec.calculando;

public class Circulo extends FiguraGeometrica implements Calculable{
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return area = 3.14 * Math.pow(raio, 2);
		//Deve estar dentro da fun��o para executar o MAth
	}

}
