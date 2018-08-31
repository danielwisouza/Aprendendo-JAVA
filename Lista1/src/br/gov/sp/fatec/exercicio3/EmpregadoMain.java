package br.gov.sp.fatec.exercicio3;

public class EmpregadoMain {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Ariana", "Ribeiro", 100.00);
		Empregado empregado2 = new Empregado("Thais", "Ribeiro", -333.33);
		
		Double salarioComAumento = empregado.darAumento();
		Double salarioComAumento2 = empregado2.darAumento();
		
		System.out.println("EMPREGADO MAIN");
		System.out.println(empregado.toString());
		System.out.println("Salario Anual com aumento: " + salarioComAumento);
		System.out.println("################");
		System.out.println(empregado2.toString());
		System.out.println("Salario Anual com aumento: " + salarioComAumento2);
	}

}
