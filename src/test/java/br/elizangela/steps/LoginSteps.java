package br.elizangela.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
	private WebDriver driver;


	@Dado("que estou na pagina inicial")
	public void queEstouNaPaginaInicial() {
		
		System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://advantageonlineshopping.com/#/");
		
	}
	
	@Dado("clico no botao User")
	public void clicoNoBotaoUser() {
		driver.findElement(By.id("menuUser")).click();
	}

	@Quando("no pop-up informo o username {string}")
	public void noPopUpInformoOUsername(String string) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		driver.findElement(By.name("username")).sendKeys(string);
		
	}
	@Quando("informo a password {string}")
	public void informoAPassword(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
		
	}

	@Quando("clico no botao SingIn")
	public void clicoNoBotaoSingIn() {
		driver.findElement(By.id("sign_in_btnundefined")).click();
		
	}
	
	@Entao("o login é efetivado com sucesso")
	public void oLoginÉEfetivadoComSucesso() {
	}



}
