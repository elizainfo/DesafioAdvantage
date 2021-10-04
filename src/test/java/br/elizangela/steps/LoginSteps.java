package br.elizangela.steps;

import java.security.spec.ECField;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.elizangela.pages.DSL;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
	private WebDriver driver;
	private DSL dsl;


	@Dado("que estou na pagina inicial")
	public void queEstouNaPaginaInicial() {
		
		System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://advantageonlineshopping.com/#/");
		dsl = new DSL(driver);
		
	}
	
	@Dado("clico no botao User")
	public void clicoNoBotaoUser() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menuUser")));
		driver.findElement(By.id("menuUser")).click();
	}

	@Quando("no pop-up informo o username {string}")
	public void noPopUpInformoOUsername(String string) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		dsl.escreverPorName("username", string);
		Assert.assertEquals(string, driver.findElement(By.name("username")).getAttribute("value"));
		
	}
	@Quando("informo a password {string}")
	public void informoAPassword(String string) {
		dsl.escreverPorName("password", string);
		Assert.assertEquals(string, driver.findElement(By.name("password")).getAttribute("value"));
		
	}

	@Quando("clico no botao SingIn")
	public void clicoNoBotaoSingIn() {
		WebDriverWait wait = new WebDriverWait(driver, 60);	
		wait.until(ExpectedConditions.elementToBeSelected(By.id("sign_in_btnundefined")));
		driver.findElement(By.id("sign_in_btnundefined")).click();
				//.xpath("//button[normalize-space()='SIGN IN']")).click();
		
	}
	
	@Entao("o login é efetivado com sucesso")
	public void oLoginÉEfetivadoComSucesso(String login) {
		
		login =	driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")).getText();
		Assert.assertEquals(login, driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")).getAttribute(login));
		//span[@class='hi-user containMiniTitle ng-binding']
	}



}
