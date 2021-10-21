package br.elizangela.steps;

import static br.elizangela.core.DriverFactory.getDriver;
import br.elizangela.core.DriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.elizangela.core.DSL;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
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
	
	@Dado("que estou na pagina inicial")
	public void queEstouNaPaginaInicial() {
		
		getDriver().get("https://advantageonlineshopping.com/#/");
		
	}
	
	@Dado("clico no botao User")
	public void clicoNoBotaoUser() throws InterruptedException {
		
		//Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 10000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("menuUser")));
		getDriver().findElement(By.id("menuUser")).click();
		//dsl.clicarBotao("menuUser");
	}

	@Quando("no pop-up informo o username {string}")
	public void noPopUpInformoOUsername(String string) {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		
		dsl.escreverPorName("username", string);
		Assert.assertEquals(string, dsl.obterValorCampoPorName("username"));
		
		
	}
	@Quando("informo a password {string}")
	public void informoAPassword(String string) {
		dsl.escreverPorName("password", string);
		Assert.assertEquals(string, dsl.obterValorCampoPorName("password"));
		
	}

	@Entao("clico no botao SingIn")
	public void clicoNoBotaoSingIn() throws InterruptedException {
		
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 1000);	
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("sign_in_btnundefined")));
		
		dsl.clicarBotao("sign_in_btnundefined");
		
	}
	
	

}
