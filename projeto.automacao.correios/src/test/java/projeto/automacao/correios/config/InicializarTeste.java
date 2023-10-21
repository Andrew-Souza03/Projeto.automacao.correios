package projeto.automacao.correios.config;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import projeto.automacao.correios.drivers.DriversProjeto;

public class InicializarTeste extends DriversProjeto{

	static String ambiente = "https://www.correios.com.br/";
	
	public static void configurarAmbinte() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ambiente);
	}
	
	public static void encerrarTeste() {
		driver.quit();
	}
	
}
