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

	public Diaria(LocalDate dia, double totalChuva){
		this.dia = dia;
		this.totalChuva = totalChuva;
	}
	
	public int compareTo(Diaria d) {          
	    return (this.getTotalChuva() < d.getTotalChuva() ? -1 : 
	            (this.getTotalChuva() == d.getTotalChuva() ? 0 : 1));     
	  }

}
