package projeto.automacao.correios.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.automacao.correios.config.InicializarTeste;
import projeto.automacao.correios.pages.HomePage;
import projeto.automacao.correios.pages.ResultadoPage;

public class BuscaCepTeste {

	HomePage home = new HomePage();
	ResultadoPage resultado = new ResultadoPage();
	
	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbinte();
	}

	@After
	public void finalizarTeste() {
		InicializarTeste.encerrarTeste();

	}

	@When("enviar os dados")
	public void enviarOsDados() {
	    home.buscarCepEndereco("06463-030");
	}
	
	@Then("validar o resultado da busca")
	public void validarOResultadoDaBusca() {
	    resultado.validarResultadoBusca("Rua Sertânia", "Jardim Mutinga", "Barueri/SP", "06463-030");
	}

	
	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
	   home.buscarCepEndereco("Rua Sertânia Jardim Mutinga Barueri/SP");
	}
	
	
	@Given("enviar os dados com caracteres especiais")
	public void enviarOsDadosComCaracteresEspeciais() {
	    home.buscarCepEndereco("$%");
	}
	
	@Then("validar mensagem de dados invalidos")
	public void validarMensagemDeDadosInvalidos() {
	    resultado.validarMsg("DADOS INVALIDOS/NAO INFORMADO");
	}

	
	@Given("enviar os dados com informacoes invalidas")
	public void enviarOsDadosComInformacoesInvalidas() {
	    home.buscarCepEndereco("876653-765");
	}
	@Then("valido mensagem de dados inexistentes")
	public void validoMensagemDeDadosInexistentes() {
	    resultado.validarMsg("Dados não encontrado");
	}













}
