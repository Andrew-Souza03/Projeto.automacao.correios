package projeto.automacao.correios.pages;

import projeto.automacao.correios.elementos.Elementos;
import projeto.automacao.correios.metodos.Metodos;

public class ResultadoPage {

	Metodos metodo = new Metodos();
	
	public void validarResultadoBusca(String logradouro, String bairro, String localidade, String cep) {
		metodo.trocarAba();
		metodo.validarTexto(Elementos.logradouroNome, logradouro);
		metodo.validarTexto(Elementos.bairroDistrito, bairro);
		metodo.validarTexto(Elementos.localidadeUF, localidade);
		metodo.validarTexto(Elementos.cep, cep);
	}
	
	public void validarMsg(String msgInvalida) {
		metodo.trocarAba();
		metodo.validarMsg(Elementos.msgAlerta, msgInvalida);
		
	}
	
}
