package edu.fatec.lp2.factory;

import edu.fatec.lp2.FiguraType;
import edu.fatec.lp2.figuras.Calculable;
import edu.fatec.lp2.figuras.Circulo;
import edu.fatec.lp2.figuras.Cubo;
import edu.fatec.lp2.figuras.Esfera;
import edu.fatec.lp2.figuras.Hexagono;
import edu.fatec.lp2.figuras.Losango;
import edu.fatec.lp2.figuras.Paralelograma;
import edu.fatec.lp2.figuras.Quadrado;
import edu.fatec.lp2.figuras.Retangulo;
import edu.fatec.lp2.figuras.Trapezio;
import edu.fatec.lp2.figuras.Triangulo;


public class FiguraFactory implements Factory<Calculable, FiguraType> {
	@Override
	public Calculable create(final FiguraType ft, double... params) {
		Calculable obj = null;
		switch(ft) {
			case QUADRADO: 
				obj =  new Quadrado(params[0]); 
				break;
			case RETANGULO: 
				obj =  new Retangulo(params[0], params[1]); 
				break;
			case CIRCULO:
				obj = new Circulo(params[0]);
				break;
			case TRIANGULO:
				obj = new Triangulo(params[0], params[1]);
				break;
			case PARALELOGRAMA:
				obj = new Paralelograma(params[0], params[1]);
				break;
			case TRAPEZIO:
				obj = new Trapezio(params[0], params[1], params[2]);
				break;
			case HEXAGONO:
				obj = new Hexagono(params[0]);
				break;
			case LOSANGO:
				obj = new Losango(params[0], params[1]);
				break;
			case CUBO:
				obj = new Cubo(params[0]);
				break;
			case ESFERA:
				obj = new Esfera(params[0]);
				break;
			case CILINDRO:
				obj = new Esfera(params[0]);
				break;
			case PRISMA:
				obj = new Esfera(params[0]);
				break;
			case PIRAMIDE:
				obj = new Esfera(params[0]);
				break;
		}
		return obj;
	}
}
