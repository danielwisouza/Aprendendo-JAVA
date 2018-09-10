package br.gov.sp.fatec.exercicio2;

public class InvoiceMain {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1L, "CELULAR", 2, 99.99);
		Invoice invoiceNegativa = new Invoice(2L, "CELULAR", 1, -99.99);
		
		Double valorRecalculado = invoice.getInvoiceAmount(invoice.getQuantidade(), invoice.getPrecoUnitario());

		System.out.println("INVOICE MAIN");
		System.out.println(invoice.toString());
		System.out.println("Valor Recalculado: " + valorRecalculado);
		System.out.println("#######");
		System.out.println(invoiceNegativa.toString());
	}

}
