package br.elizangela.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.elizangela.pages.DSL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastrarUsuarioSteps {

	private WebDriver driver;
	private DSL dsl;

	@Dado("^que estou acessando a pagina de register$")
	public void queEstouAcessandoAPaginaDeRegister() throws Throwable {

		System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://advantageonlineshopping.com/#/register");
		dsl = new DSL(driver);
	}

	@Quando("^preencho o campo username \"([^\"]*)\"$")
	public void preenchoOCampoUsername(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("usernameRegisterPage")));
		dsl.escreverPorName("usernameRegisterPage", arg1);
		//driver.findElement(By.name("usernameRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho o campo email \"([^\"]*)\"$")
	public void preenchoOCampoEmail(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("emailRegisterPage")));
		dsl.escreverPorName("emailRegisterPage", arg1);
		//driver.findElement(By.name("emailRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho o campo password \"([^\"]*)\"$")
	public void preenchoOCampoPassword(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("passwordRegisterPage")));
		dsl.escreverPorName("passwordRegisterPage", arg1);
		//driver.findElement(By.name("passwordRegisterPage")).sendKeys(arg1);

	}

	@Quando("^confirmo a password \"([^\"]*)\"$")
	public void confirmoAPassword(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm_passwordRegisterPage")));
		dsl.escreverPorName("confirm_passwordRegisterPage", arg1);
		//driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho o campo first name \"([^\"]*)\"$")
	public void preenchoOCampoFirstName(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("first_nameRegisterPage")));
		dsl.escreverPorName("first_nameRegisterPage", arg1);
		//driver.findElement(By.name("first_nameRegisterPage")).sendKeys(arg1);

	}

	@Quando("^preencho o campo last name \"([^\"]*)\"$")
	public void preenchoOCampoLastName(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("last_nameRegisterPage")));
		dsl.escreverPorName("last_nameRegisterPage", arg1);
		//driver.findElement(By.name("last_nameRegisterPage")).sendKeys(arg1);

	}

	@Quando("^preencho o campo phone number \"([^\"]*)\"$")
	public void preenchoOCampoPhoneNumber(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("phone_numberRegisterPage")));
		dsl.escreverPorName("phone_numberRegisterPage", arg1);
		//driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(arg1);

	}

	@Quando("^seleciono o country \"([^\"]*)\"$")
	public void selecionoOCountry(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("countryListboxRegisterPage")));
		WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Brazil");
		
	}

	@Quando("^preencho o campo city \"([^\"]*)\"$")
	public void preenchoOCampoCity(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("cityRegisterPage")));
		dsl.escreverPorName("cityRegisterPage", arg1);
		//driver.findElement(By.name("cityRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho o campo address \"([^\"]*)\"$")
	public void preenchoOCampoAddress(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("addressRegisterPage")));
		dsl.escreverPorName("addressRegisterPage", arg1);
		//driver.findElement(By.name("addressRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho o campo state \"([^\"]*)\"$")
	public void preenchoOCampoState(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("state_/_province_/_regionRegisterPage")));
		dsl.escreverPorName("state_/_province_/_regionRegisterPage", arg1);
		//driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(arg1);

	}

	@Quando("^preencho o campo postal code \"([^\"]*)\"$")
	public void preenchoOCampoPostalCode(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("postal_codeRegisterPage")));
		dsl.escreverPorName("postal_codeRegisterPage", arg1);
		//driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(arg1);
	}

	@Quando("^aceito os termos de servico$")
	public void aceitoOsTermosDeServico() throws Throwable {
	 driver.findElement(By.name("i_agree")).click();
	}

	@Quando("^clico no botao \"([^\"]*)\"$")
	public void clicoNoBotao(String arg1) throws Throwable {
		dsl.clicarBotao("register_btnundefined");
		//driver.findElement(By.id("register_btnundefined")).click();
	}

	@Entao("^o cadastro e adicionado com sucesso$")
	public void oCadastroEAdicionadoComSucesso() throws Throwable {
		//throw new PendingException();
	}
	
	@Entao("^o sistema apresenta a mensagem User name already exists$")
	public void oSistemaApresentaAMensagemUserNameAlreadyExists() throws Throwable {
		String texto = driver.findElement(By.xpath("//label[normalize-space()='User name already exists']")).getText();
		   Assert.assertEquals("User name already exists", texto);
	}
	
	@Before
	public void inicio() {
		System.out.println("Iniciar");
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
	
	@After(order = 0)
	public void fecharBrowser() {
		driver.quit();
	}

}
