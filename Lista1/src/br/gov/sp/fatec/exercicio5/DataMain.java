package br.gov.sp.fatec.exercicio5;

public class DataMain {

	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("Data do Sistema: " + data);
		System.out.println("###########");
		Data data2 = new Data(1, 1, 1992);
		System.out.println("Data passando parâmetros " + data2);
		System.out.println("Data + 1: " + data2.avancar());
	}

}
