package projeto.automacao.correios.pages;

import projeto.automacao.correios.elementos.Elementos;
import projeto.automacao.correios.metodos.Metodos;

public class BuscaCepPage {

	Metodos metodo = new Metodos();
	
	public void validarTituloTela(String tituloTela) {
		metodo.trocarAba();
		metodo.validarTitulo(Elementos.tituloTelaBuscaCep, tituloTela);
		
	}
	
}
