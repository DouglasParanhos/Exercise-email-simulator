package br.rj.cederj.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServidorEmails {

	private  List<CaixaPostal> caixasPostais;

	public ServidorEmails() {
		this.caixasPostais = new ArrayList<>();
	}
	
	public void adicionaCaixa(CaixaPostal cp) {
		caixasPostais.add(cp);
	}
	
	public void enviaEmail(Email email) {
		List<String> destinatarios = Arrays.asList(email.getDestinatarios());
		
		for(String destinatario: destinatarios) {
			buscaCaixaPostalPorNome(destinatario).getEmails().add(email);
		}
	}
	
	public void encaminhaEmail(Email email, String destinatario) {
		buscaCaixaPostalPorNome(destinatario).getEmails().add(email);
	}
	
	private CaixaPostal buscaCaixaPostalPorNome(String nome) {
		//assumindo que terá sempre 1 e somente 1 caixa postal com aquele nome
		return caixasPostais.stream().filter(cp -> cp.getUser().equals(nome)).collect(Collectors.toList()).get(0);
	}
}
