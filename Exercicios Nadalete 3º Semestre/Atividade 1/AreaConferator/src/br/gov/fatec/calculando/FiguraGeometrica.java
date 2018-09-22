package br.gov.fatec.calculando;

public abstract class FiguraGeometrica implements Calculable{
	
	private double lado;
	private double area;
	private double raio;
	private double base;
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenorr(double baseMenor) {
		this.baseMenor = baseMenor;
	}
}