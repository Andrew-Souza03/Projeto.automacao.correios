package projeto.automacao.correios.pages;

import projeto.automacao.correios.elementos.Elementos;
import projeto.automacao.correios.metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();
	
	public void buscarCepEndereco(String dado) {
		metodo.escrever(Elementos.buscarCepEndereco, dado);
		metodo.submit(Elementos.buscarCepEndereco);
		
	}
	
	
	
}
