package projeto.automacao.correios.metodos;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import projeto.automacao.correios.drivers.DriversProjeto;

public class Metodos extends DriversProjeto{
	
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("**** Causa do erro ****" + e.getCause());
			System.out.println("**** Mensagem do erro ****" + e.getMessage());
		}
		
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("**** Causa do erro ****" + e.getCause());
			System.out.println("**** Mensagem do erro ****" + e.getMessage());
		}
	}
	
	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("**** Causa do erro ****" + e.getCause());
			System.out.println("**** Mensagem do erro ****" + e.getMessage());
		}
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.out.println("**** Causa do erro ****" + e.getCause());
			System.out.println("**** Mensagem do erro ****" + e.getMessage());
		}
	}
	
	public void trocarAba() {
		try {
			String janelaPrincipal = driver.getWindowHandle();
			Set<String> janelas = driver.getWindowHandles();
			for(String janelaAtual : janelas) {
				if(!janelaAtual.equals(janelaPrincipal)) {
					driver.switchTo().window(janelaAtual);
				}
			}
		} catch (Exception e) {
			System.out.println("**** Causa do erro ****" + e.getCause());
			System.out.println("**** Mensagem do erro ****" + e.getMessage());
		}
	}
	
	public void validarMsg(By elemento, String textoEsperado) {

		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
		
	}
}
