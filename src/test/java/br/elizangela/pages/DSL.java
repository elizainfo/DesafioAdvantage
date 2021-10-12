package br.elizangela.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {
	
	private WebDriver driver;
	
	
	public DSL(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void escreverPorId(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).clear();
		driver.findElement(By.id(id_campo)).sendKeys(texto);
		
	}
	
	public void escreverPorName(String name_campo, String texto) {
		driver.findElement(By.name(name_campo)).clear();
		driver.findElement(By.name(name_campo)).sendKeys(texto);
		
	}
	
	public String obterValorCampoPorName(String name_campo) {
		return driver.findElement(By.name(name_campo)).getAttribute("value");
	}
	
	public String obterValorCampoPorXPath(String xpath_campo) {
		return driver.findElement(By.xpath(xpath_campo)).getAttribute("value");
	}
	
	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
		
	}
	
	public void clicarLink(String texto) {
		driver.findElement(By.linkText(texto)).click();
		
	}
	
	public void clicarItemPorXpath(String texto) {
		driver.findElement(By.xpath(texto)).click();
		
	}
	public void selecionarComboPorName(String name, String valor) {

		WebElement element = driver.findElement(By.name(name));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public String obterValorCombo(String name) {

		WebElement element = driver.findElement(By.name(name));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	public String obterTextoPagina(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public void clicarCheckPorName(String name) {
		driver.findElement(By.name(name)).click();
		
	}
	
	public boolean isCheckMarcado(String name) {
		return driver.findElement(By.name(name)).isSelected();
	}

}
