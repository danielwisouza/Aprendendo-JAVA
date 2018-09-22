package br.gov.fatec.calculando;

public class FactoryDemo {

	public static void main(String[] args) {
		FiguraFactory figuraFactory = new FiguraFactory();
		
		FiguraGeometrica quadrado = figuraFactory.criarQuadrado(2);
		quadrado.calcularArea();
		System.out.println("Data passando parâmetros " + quadrado);
		
		FiguraGeometrica circulo = figuraFactory.criarCirculo(3);
		circulo.calcularArea();
		
		FiguraGeometrica hexagono = figuraFactory.criarHexagono(3);
		hexagono.calcularArea();
		
		FiguraGeometrica losango = figuraFactory.criarLosango(2, 4);
		losango.calcularArea();
		
		FiguraGeometrica paralelograma = figuraFactory.criarParalelograma(2, 4);
		paralelograma.calcularArea();
		
		FiguraGeometrica retangulo = figuraFactory.criarRetangulo(2, 4);
		retangulo.calcularArea();
		
		FiguraGeometrica trapezio = figuraFactory.criarTrapezio(12, 7, 13);
		trapezio.calcularArea();
		
		FiguraGeometrica triangulo = figuraFactory.criarTriangulo(3, 5);
		triangulo.calcularArea();
		
	}
}