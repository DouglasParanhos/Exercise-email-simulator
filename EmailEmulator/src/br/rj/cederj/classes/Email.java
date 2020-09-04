package br.rj.cederj.classes;

import java.util.Arrays;

public class Email {

	private String remetente;
	private String[] destinatarios;
	private String assunto;
	private String corpo;
	
	public Email(String remetente, String[] destinatarios, String assunto, String corpo) {
		this.remetente = remetente;
		this.destinatarios = destinatarios;
		this.assunto = assunto;
		this.corpo = corpo;
	}
	
	@Override
	public String toString() {

		String retorno = "De: " + this.remetente + "\n";
		retorno += "Para: " + Arrays.toString(this.destinatarios) + "\n";
		retorno += "Para: " + this.assunto + "\n";
		retorno += "Para: " + this.corpo + "\n";
		
		return retorno;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String[] getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(String[] destinatarios) {
		this.destinatarios = destinatarios;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
}
