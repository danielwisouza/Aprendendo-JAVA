package edu.fatec.precipitacao;

import java.time.LocalDate;

public class Diaria implements Comparable<Diaria>{
	private LocalDate dia;
	private double totalChuva;
	
	public LocalDate getDia() {
		return dia;
	}

	public double getTotalChuva() {
		return totalChuva;
	}

	public void Dia(LocalDate dia, double totalChuva){
		this.dia = dia;
		this.totalChuva = totalChuva;
	}
	
	@Override
	public int compareTo(Diaria o) {
		
		return 0;
	}
}