package br.gov.fatec.calculando;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class FiguraGeometrica {
	public double lado;
	public double area;
	public double raio;
	public double base;
	public double altura;
	public double baseMaior;
	public double baseMenor;

}