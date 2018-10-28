package edu.fatec.precipitacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chuva {
	List<Diaria> listDias = new ArrayList<>();
	
	public void addDia(Diaria dia) {
		this.listDias.add(dia);
	}
	
	public double Total() {
		double total = 0;
		for(Diaria dia:listDias) {
			total = total + dia.getTotalChuva();
		}
		return total;
	}
	
	public double getMediaPrecipitacao() {
		return Total() / 365;
	}
	
	public Diaria MaiorDiaChuva() {
		Diaria maior = listDias.get(0);
		for(Diaria dia:listDias.subList(1, listDias.size())) {
			if(maior.getTotalChuva() < dia.getTotalChuva()) {
				maior = dia;
			}
		}
		return maior;
	}
	
	public Diaria MenorDiaChuva() {
		Diaria menor = listDias.get(0);
		for(Diaria dia:listDias.subList(1, listDias.size())) {
			if(menor.getTotalChuva() > dia.getTotalChuva()) {
				menor = dia;
			}
		}
		return menor;
	}
	
	public List<Diaria> DiasMaisChuvosos10(){
		List<Diaria> aux = new ArrayList<>(this.listDias);
		Collections.sort(aux);
		return aux.subList(0, 10);
	}
}
