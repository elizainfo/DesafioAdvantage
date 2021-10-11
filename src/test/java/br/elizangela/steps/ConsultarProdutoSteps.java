package br.elizangela.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.elizangela.pages.DSL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ConsultarProdutoSteps{
	
	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializaBrowser() {
		System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");

		dsl = new DSL(driver);
	}
	
//	@After(order = 1)
//	public void screenshot(Scenario cenario) {
//		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(file,new File("target/screenshots/name.jpg"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	@After
	public void fecharBrowser() {
		driver.quit();
	}

	@Dado("que estou na página principal do sistema")
	public void queEstouNaPáginaPrincipalDoSistema() {
//		System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://advantageonlineshopping.com/#");
		
			}
	
		@Dado("clico na lupa de pesquisas")
	public void clicoNaLupaDePesquisas() {
			driver.findElement(By.id("menuSearch")).click();
			
	}
	@Dado("digito a categoria do produto {string}")
	public void digitoACategoriaDoProduto(String string) {
		driver.findElement(By.id("autoComplete")).sendKeys("headphones");
		driver.findElement(By.id("autoComplete")).sendKeys(Keys.ENTER);
	}
	
	@Entao("clico no produto desejado")
	public void clicoNoProdutoDesejado() {
		driver.findElement(By.xpath("//p[normalize-space()='BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES']")).click();
	}

}
