package br.elizangela.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarUsuarioSteps {
	
	private WebDriver driver;
	
	@Dado("^que estou acessando a pagina de register$")
	public void queEstouAcessandoAPaginaDeRegister() throws Throwable {
		
		System.setProperty("webdriver.firefox.driver", "C:\\Workspaces\\DesafioAdvantage\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://advantageonlineshopping.com/#/register");
	}

	@Quando("^informo o nome do usuario \"([^\"]*)\"$")
	public void informoONomeDoUsuario(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo o email \"([^\"]*)\"$")
	public void informoOEmail(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo a senha \"([^\"]*)\"$")
	public void informoASenha(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^confirmo a senha \"([^\"]*)\"$")
	public void confirmoASenha(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo meu primeiro nome \"([^\"]*)\"$")
	public void informoMeuPrimeiroNome(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo meu ultimo nome \"([^\"]*)\"$")
	public void informoMeuUltimoNome(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo meu numero de telefone \"([^\"]*)\"$")
	public void informoMeuNumeroDeTelefone(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^seleciono o pais \"([^\"]*)\"$")
	public void selecionoOPais(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo a cidade \"([^\"]*)\"$")
	public void informoACidade(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo o endereco \"([^\"]*)\"$")
	public void informoOEndereco(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo o estado de \"([^\"]*)\"$")
	public void informoOEstadoDe(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^informo o CEP \"([^\"]*)\"$")
	public void informoOCEP(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Quando("^desmarco a opcao de receber ofertas exclusivas$")
	public void desmarcoAOpcaoDeReceberOfertasExclusivas() throws Throwable {
	    throw new PendingException();
	}

	@Quando("^aceito os termos de servico$")
	public void aceitoOsTermosDeServico() throws Throwable {
	    throw new PendingException();
	}

	@Quando("^clico no botao \"([^\"]*)\"$")
	public void clicoNoBotao(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Entao("^o cadastro e adicionado com sucesso$")
	public void oCadastroEAdicionadoComSucesso() throws Throwable {
	    throw new PendingException();
	}

}
