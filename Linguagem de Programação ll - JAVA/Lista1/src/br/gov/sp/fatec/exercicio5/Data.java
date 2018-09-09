package br.gov.sp.fatec.exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;


public class Data {
	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public Data(Integer dia, Integer mes, Integer ano) {
		super();
		this.dia = dia > 0 && dia < 32 ? dia : 0;
		this.mes = mes > 0 && mes < 13 ? mes : 0;
		this.ano = ano;
	}
	
	public Data() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		this.dia = calendar.get(Calendar.DATE);
		this.mes = calendar.get(Calendar.MONTH) + 1;
		this.ano = calendar.get(Calendar.YEAR);
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	public String avancar() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(formato.parse(dia + "/" + mes + "/" + ano));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		calendar.add(Calendar.DATE, 1);
		calendar.add(Calendar.MONTH, 1) ;
		return formato.format(calendar.getTime());
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
}
