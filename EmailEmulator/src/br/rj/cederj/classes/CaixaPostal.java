package br.rj.cederj.classes;

import java.util.ArrayList;
import java.util.List;

public class CaixaPostal {

	private String user;
	
	private List<Email> emails;
	
	public CaixaPostal(String name) {
		this.user = name;
		this.emails = new ArrayList<Email>();
	}
	
	@Override
	public String toString() {
		String retorno = ">>> Caixa Postal de " + this.user + " <<< \n";
		
		for(Email e: emails) {
			retorno += e.toString();
		}
		
		return retorno;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
}
