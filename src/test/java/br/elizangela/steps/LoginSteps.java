package br.elizangela.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.elizangela.pages.DSL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
	private WebDriver driver;
	private DSL dsl;
	
	@Dado("que estou na pagina inicial")
	public void queEstouNaPaginaInicial() {
		
		//System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://advantageonlineshopping.com/#/");
		
	}
	
	@Dado("clico no botao User")
	public void clicoNoBotaoUser() throws InterruptedException {
		
		//Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("menuUser")));
		driver.findElement(By.id("menuUser")).click();
		//dsl.clicarBotao("menuUser");
	}

	@Quando("no pop-up informo o username {string}")
	public void noPopUpInformoOUsername(String string) {
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
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
		
		WebDriverWait wait = new WebDriverWait(driver, 1000);	
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("sign_in_btnundefined")));
		
		dsl.clicarBotao("sign_in_btnundefined");
		
	}
	
	

}
