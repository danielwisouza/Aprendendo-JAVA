package br.gov.fatec.calculando;

public class FactoryDemo {

	public static void main(String[] args) {
		FiguraFactory figuraFactory = new FiguraFactory();
		
		FiguraGeometrica quadrado = figuraFactory.criarQuadrado(2.9);
		//quadrado.calcularArea();
		System.out.println(quadrado.toString());
		
		FiguraGeometrica circulo = figuraFactory.criarCirculo(3);
		//circulo.calcularArea();
		System.out.println(circulo.toString());
		
		FiguraGeometrica hexagono = figuraFactory.criarHexagono(3);
		//hexagono.calcularArea();
		System.out.println(hexagono.toString());
		
		FiguraGeometrica losango = figuraFactory.criarLosango(2, 4);
		//losango.calcularArea();
		System.out.println(losango.toString());

		FiguraGeometrica paralelograma = figuraFactory.criarParalelograma(2, 4);
		//paralelograma.calcularArea();
		System.out.println(paralelograma.toString());
		
		FiguraGeometrica retangulo = figuraFactory.criarRetangulo(2, 4);
		//retangulo.calcularArea();
		System.out.println(retangulo.toString());
		
		FiguraGeometrica trapezio = figuraFactory.criarTrapezio(12, 7, 13);
		//trapezio.calcularArea();
		System.out.println(trapezio.toString());
		
		FiguraGeometrica triangulo = figuraFactory.criarTriangulo(3, 5);
		//triangulo.calcularArea();
		System.out.println(triangulo.toString());
		
	}
}