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

public class CadastrarUsuarioSteps {

//	public static void main(String[] args) throws IOException{
//		File file = new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
//		FileInputStream inputStream = new FileInputStream(file);
//		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = wb.getSheet("Usuario_Data");
//	}

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

	@Dado("que acesso a pagina inicial do sistema")
	public void queAcessoAPaginaInicialDoSistema() {
		driver.get("https://advantageonlineshopping.com/#");
	}

	@Quando("clico no icone de usuario")
	public void clicoNoIconeDeUsuario() throws InterruptedException {

		Thread.sleep(10000);

		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("menuUser")));

		dsl.clicarBotao("menuUser");

	}

	@Entao("clico na opção Create New Account")
	public void clicoNaOpçãoCreateNewAccount() {

		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("CREATE NEW ACCOUNT")));

		dsl.clicarLink("CREATE NEW ACCOUNT");

	}

	@Dado("^que estou acessando a pagina de register$")
	public void queEstouAcessandoAPaginaDeRegister() throws Throwable {

		driver.get("http://advantageonlineshopping.com/#/register");
	}

	@Quando("^preencho o campo username \"([^\"]*)\"$")
	public void preenchoOCampoUsername(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("usernameRegisterPage")));

		// driver.findElement(By.name("usernameRegisterPage")).sendKeys(this.main(getRow(1).getCell(1).getStringCellValue()));

		dsl.escreverPorName("usernameRegisterPage", arg1);
	}

	@Quando("^preencho o campo email \"([^\"]*)\"$")
	public void preenchoOCampoEmail(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("emailRegisterPage")));
		dsl.escreverPorName("emailRegisterPage", arg1);
	}

	@Quando("^preencho o campo password \"([^\"]*)\"$")
	public void preenchoOCampoPassword(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("passwordRegisterPage")));
		dsl.escreverPorName("passwordRegisterPage", arg1);

	}

	@Quando("^confirmo a password \"([^\"]*)\"$")
	public void confirmoAPassword(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm_passwordRegisterPage")));
		dsl.escreverPorName("confirm_passwordRegisterPage", arg1);
	}

	@Quando("^preencho o campo first name \"([^\"]*)\"$")
	public void preenchoOCampoFirstName(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("first_nameRegisterPage")));
		dsl.escreverPorName("first_nameRegisterPage", arg1);

	}

	@Quando("^preencho o campo last name \"([^\"]*)\"$")
	public void preenchoOCampoLastName(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("last_nameRegisterPage")));
		dsl.escreverPorName("last_nameRegisterPage", arg1);

	}

	@Quando("^preencho o campo phone number \"([^\"]*)\"$")
	public void preenchoOCampoPhoneNumber(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("phone_numberRegisterPage")));
		dsl.escreverPorName("phone_numberRegisterPage", arg1);

	}

	@Quando("^seleciono o country \"([^\"]*)\"$")
	public void selecionoOCountry(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("countryListboxRegisterPage")));

		dsl.selecionarComboPorName("countryListboxRegisterPage", "Brazil");
		Assert.assertEquals("Brazil", dsl.obterValorCombo("countryListboxRegisterPage"));
	}

	@Quando("^preencho o campo city \"([^\"]*)\"$")
	public void preenchoOCampoCity(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("cityRegisterPage")));
		dsl.escreverPorName("cityRegisterPage", arg1);
	}

	@Quando("^preencho o campo address \"([^\"]*)\"$")
	public void preenchoOCampoAddress(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("addressRegisterPage")));
		dsl.escreverPorName("addressRegisterPage", arg1);
	}

	@Quando("^preencho o campo state \"([^\"]*)\"$")
	public void preenchoOCampoState(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("state_/_province_/_regionRegisterPage")));
		dsl.escreverPorName("state_/_province_/_regionRegisterPage", arg1);

	}

	@Quando("^preencho o campo postal code \"([^\"]*)\"$")
	public void preenchoOCampoPostalCode(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("postal_codeRegisterPage")));
		dsl.escreverPorName("postal_codeRegisterPage", arg1);
		// driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(arg1);
	}

	@Quando("^aceito os termos de servico$")
	public void aceitoOsTermosDeServico() throws Throwable {
		dsl.clicarCheckPorName("i_agree");
		// driver.findElement(By.name("i_agree")).click();
		Assert.assertTrue(dsl.isCheckMarcado("i_agree"));
	}

	@Entao("^clico no botao \"([^\"]*)\"$")
	public void clicoNoBotao(String arg1) throws Throwable {
		dsl.clicarBotao("register_btnundefined");
	}

	@Entao("^o sistema apresenta a mensagem User name already exists$")
	public void oSistemaApresentaAMensagemUserNameAlreadyExists() {

		String texto = dsl.obterTextoPagina("//label[normalize-space()='User name already exists']");
		Assert.assertEquals("User name already exists", texto);
	}

}
