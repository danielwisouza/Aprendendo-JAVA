package br.gov.fatec.calculando;

public class FiguraFactory {
	
	public FiguraGeometrica criarQuadrado(final double lado) {
		return new Quadrado(lado);
	}
	
	public FiguraGeometrica criarCirculo(final double raio) {
		return new Circulo(raio);
	}
	
	public FiguraGeometrica criarCubo(final double lado) {
		return new Cubo(lado);
	}
	
	public FiguraGeometrica criarHexagono(final double lado) {
		return new Hexagono(lado);
	}
	
	public FiguraGeometrica criarLosango(final double base,final double altura) {
		return new Losango(base,altura);
	}
	
	public FiguraGeometrica criarParalelograma(final double base,final double altura) {
		return new Paralelograma(base, altura);
	}
	
	public FiguraGeometrica criarRetangulo(final double base,final double altura) {
		return new Retangulo(base, altura);
	}
	
	public FiguraGeometrica criarTrapezio(final double baseMaior,final double baseMenor,final double altura) {
		return new Trapezio(baseMaior, baseMenor, altura);
	}
	
	public FiguraGeometrica criarTriangulo(final double base,final double altura) {
		return new Triangulo(base, altura);
	}
}