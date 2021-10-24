package br.elizangela.steps;

import static br.elizangela.core.DriverFactory.getDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.elizangela.core.DSL;
import br.elizangela.core.DriverFactory;
import br.elizangela.pages.CadastroPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastrarUsuarioSteps {

	private DSL dsl;
	private CadastroPage page;

	@Before
	public void inicializaBrowser() {
		System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		dsl = new DSL();
		page = new CadastroPage();
	}

	@After(order = 1)
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,new File("target/screenshots/"+cenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void finaliza() {
		DriverFactory.killDriver();
	}

	@Dado("que acesso a pagina inicial do sistema")
	public void queAcessoAPaginaInicialDoSistema() {
		getDriver().get("https://advantageonlineshopping.com/#");
	}

	@Quando("clico no icone de usuario")
	public void clicoNoIconeDeUsuario() throws InterruptedException {

		Thread.sleep(10000);

		WebDriverWait wait = new WebDriverWait(getDriver(), 1000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("menuUser")));

		dsl.clicarBotao("menuUser");

	}

	@Entao("clico na opção Create New Account")
	public void clicoNaOpçãoCreateNewAccount() {

		WebDriverWait wait = new WebDriverWait(getDriver(), 1000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("CREATE NEW ACCOUNT")));

		dsl.clicarLink("CREATE NEW ACCOUNT");

	}

	@Dado("^que estou acessando a pagina de register$")
	public void queEstouAcessandoAPaginaDeRegister() throws Throwable {

		getDriver().get("http://advantageonlineshopping.com/#/register");
	}

	@Quando("^preencho o campo username \"([^\"]*)\"$")
	public void preenchoOCampoUsername(String username) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("usernameRegisterPage")));

		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
				
		XSSFRow row0 = sheet.getRow(1);
		XSSFCell cell0 = row0.getCell(0);
		username = cell0.getStringCellValue();
		
		page.setUsername(username);
		
	}

	@Quando("^preencho o campo email \"([^\"]*)\"$")
	public void preenchoOCampoEmail(String email) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("emailRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
				
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		email = cell1.getStringCellValue();
		
		page.setEmail(email);
		
	}

	@Quando("^preencho o campo password \"([^\"]*)\"$")
	public void preenchoOCampoPassword(String pass) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("passwordRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
				
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell2 = row2.getCell(2);
		pass = cell2.getStringCellValue();
		
		page.setPassword(pass);

	}

	@Quando("^confirmo a password \"([^\"]*)\"$")
	public void confirmoAPassword(String cpass) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm_passwordRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
				
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell2 = row2.getCell(2);
		cpass = cell2.getStringCellValue();
		
		page.setConfirmaPassword(cpass);
	}

	@Quando("^preencho o campo first name \"([^\"]*)\"$")
	public void preenchoOCampoFirstName(String firstname) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("first_nameRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		XSSFRow row3 = sheet.getRow(1);
		XSSFCell cell3 = row3.getCell(3);
		firstname = cell3.getStringCellValue();
				
		page.setFirstName(firstname);

	}

	@Quando("^preencho o campo last name \"([^\"]*)\"$")
	public void preenchoOCampoLastName(String lastname) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("last_nameRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		XSSFRow row4 = sheet.getRow(1);
		XSSFCell cell4 = row4.getCell(4);
		lastname = cell4.getStringCellValue();
	
		page.setLastName(lastname);

	}

	@Quando("^preencho o campo phone number \"([^\"]*)\"$")
	public void preenchoOCampoPhoneNumber(String phone) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("phone_numberRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		XSSFRow row5= sheet.getRow(1);
		XSSFCell cell5 = row5.getCell(5);
		phone = cell5.getStringCellValue();
		
		page.setPhoneNumber(phone);

	}

	@Quando("^seleciono o country \"([^\"]*)\"$")
	public void selecionoOCountry(String country) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("countryListboxRegisterPage")));

		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		XSSFRow row6= sheet.getRow(1);
		XSSFCell cell6 = row6.getCell(6);
		country = cell6.getStringCellValue();
				
		page.setCountry(country);
		
		Assert.assertEquals("Brazil", dsl.obterValorCombo("countryListboxRegisterPage"));
	}

	@Quando("^preencho o campo city \"([^\"]*)\"$")
	public void preenchoOCampoCity(String city) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("cityRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		XSSFRow row7= sheet.getRow(1);
		XSSFCell cell7 = row7.getCell(7);
		city = cell7.getStringCellValue();
				
		page.setCity(city);
	}

	@Quando("^preencho o campo address \"([^\"]*)\"$")
	public void preenchoOCampoAddress(String adress) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("addressRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		XSSFRow row8 = sheet.getRow(1);
		XSSFCell cell = row8.getCell(8);
		adress= cell.getStringCellValue();
				
		page.setAdress(adress);
	}

	@Quando("^preencho o campo state \"([^\"]*)\"$")
	public void preenchoOCampoState(String state) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("state_/_province_/_regionRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		XSSFRow row9 = sheet.getRow(1);
		XSSFCell cell9 = row9.getCell(9);
		state = cell9.getStringCellValue();
		
		page.setState(state);

	}

	@Quando("^preencho o campo postal code \"([^\"]*)\"$")
	public void preenchoOCampoPostalCode(String postalcode) throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("postal_codeRegisterPage")));
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		XSSFRow row10 = sheet.getRow(1);
		XSSFCell cell10 = row10.getCell(10);
		postalcode = cell10.getStringCellValue();
		
		page.setPostalCode(postalcode);
		
	}

	@Quando("^aceito os termos de servico$")
	public void aceitoOsTermosDeServico() throws Throwable {
		dsl.clicarCheckPorName("i_agree");
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
