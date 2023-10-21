package projeto.automacao.correios.elementos;

import org.openqa.selenium.By;

public class Elementos {

	public static By buscarCepEndereco = By.id("relaxation");
	public static By logradouroNome = By.xpath("//td[@data-th='Logradouro/Nome']");
	public static By bairroDistrito = By.xpath("//td[@data-th='Bairro/Distrito']");
	public static By localidadeUF = By.xpath("//td[@data-th='Localidade/UF']");
	public static By cep = By.xpath("//td[@data-th='CEP']");
	public static By msgAlerta = By.xpath("//*[@id='mensagem-resultado-alerta']/h6");
	public static By tituloTelaBuscaCep = By.xpath("//div[@id='titulo_tela']");

	
	
	
}
