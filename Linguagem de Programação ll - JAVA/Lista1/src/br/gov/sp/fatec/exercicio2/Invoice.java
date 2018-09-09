package br.gov.sp.fatec.exercicio2;

public class Invoice {

	private Long id;
	private String descricao;
	private Integer quantidade;
	private Double precoUnitario;
	
	public Invoice(Long id, String descricao, Integer quantidade, Double precoUnitario) {
		this.id = id;
		this.descricao = descricao;
		this.quantidade = quantidade < 0 ? 0 : quantidade;
		this.precoUnitario = precoUnitario < 0 ? 0.0 : precoUnitario;
	}
	
	public Double getInvoiceAmount(Integer quantidade, Double precoUnitario) {
		return quantidade * precoUnitario;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + "\nDescrição: " + descricao + "\nQuantitade: " + quantidade + "\nPreço Unitário: " + precoUnitario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
}
