package br.elizangela.steps;

import static br.elizangela.core.DriverFactory.getDriver;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.elizangela.core.DSL;
import br.elizangela.core.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ConsultarProdutoSteps {
	
	private DSL dsl;
	
	@Before
	public void inicializaBrowser() {
		System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		dsl = new DSL();
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
	public void finaliza() {
		DriverFactory.killDriver();
	}
	
	@Dado("que estou na página principal do sistema")
	public void queEstouNaPáginaPrincipalDoSistema() {
		//System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		getDriver().get("https://advantageonlineshopping.com/#");
		}
	
		@Dado("clico na lupa de pesquisas")
	public void clicoNaLupaDePesquisas() {
			WebDriverWait wait = new WebDriverWait(getDriver(), 10000);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("menuSearch")));
			
			//dsl.clicarBotao("menuSearch");
			getDriver().findElement(By.id("menuSearch")).click();
			
	}
	@Dado("digito a categoria do produto {string}")
	public void digitoACategoriaDoProduto(String string) throws InterruptedException {
		
		Thread.sleep(100);
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 1000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("autoComplete")));
		
		getDriver().findElement(By.id("autoComplete")).sendKeys("BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES");
		getDriver().findElement(By.id("autoComplete")).sendKeys(Keys.ENTER);
	}
	
	@Entao("clico no produto desejado")
	public void clicoNoProdutoDesejado() {
		
		
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='productName ng-binding']")));
		
		WebDriverWait wait1 = new WebDriverWait(getDriver(), 10000);
		wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='follow' class='center']")));
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[normalize-space()='BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES']")));
		//dsl.clicarItemPorXpath("//p[normalize-space()='BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES']");
		getDriver().findElement(By.xpath("//a[@class='productName ng-binding']")).click();
		
	}

}
