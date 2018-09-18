package br.gov.sp.fatec.exercicio3;

public class Empregado {
	private String primeiroNome;
	private String sobrenome;
	private Double salarioMensal;
	
	public Empregado(String primeiroNome, String sobrenome, Double salarioMensal) {
		super();
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal < 0 ? 0.0 : salarioMensal;
	}
	
	@Override
	public String toString() {
		return "Primeiro Nome: " + primeiroNome + "\nSobrenome: " + sobrenome + "\nSalario Mensal: " + salarioMensal 
				+ "\nSalario Anual: "+ salarioMensal * 12;
	}
	
	public Double darAumento() {
		return (salarioMensal * 1.1) * 12;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
}
