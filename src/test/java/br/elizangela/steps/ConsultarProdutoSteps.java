package br.elizangela.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		driver = new FirefoxDriver();
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
		
		driver.get("https://advantageonlineshopping.com/#");
		
			}
	
		@Dado("clico na lupa de pesquisas")
	public void clicoNaLupaDePesquisas() {
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("menuSearch")));
			
			dsl.clicarBotao("menuSearch");
			//driver.findElement(By.id("menuSearch")).click();
			
	}
	@Dado("digito a categoria do produto {string}")
	public void digitoACategoriaDoProduto(String string) {
		
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("autoComplete")));
		
		driver.findElement(By.id("autoComplete")).sendKeys("headphones");
		driver.findElement(By.id("autoComplete")).sendKeys(Keys.ENTER);
	}
	
	@Entao("clico no produto desejado")
	public void clicoNoProdutoDesejado() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[normalize-space()='BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES']")));
		
		//dsl.clicarItemPorXpath("//p[normalize-space()='BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES']");
		driver.findElement(By.xpath("//p[normalize-space()='BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES']")).click();
		
		//p[normalize-space()='BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES']
	}

}
