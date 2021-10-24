package br.elizangela.core;

import static br.elizangela.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
		

	public void escreverPorId(String id_campo, String texto) {
		getDriver().findElement(By.id(id_campo)).clear();
		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
		
	}
	
	public void escreverPorName(String name_campo, String texto) {
		getDriver().findElement(By.name(name_campo)).clear();
		getDriver().findElement(By.name(name_campo)).sendKeys(texto);
		
	}
	
	public String obterValorCampoPorName(String name_campo) {
		return getDriver().findElement(By.name(name_campo)).getAttribute("value");
	}
	
	public String obterValorCampoPorXPath(String xpath_campo) {
		return getDriver().findElement(By.xpath(xpath_campo)).getAttribute("value");
	}
	
	public void clicarBotao(String id) {
		getDriver().findElement(By.id(id)).click();
		
	}
	
	public void clicarLink(String texto) {
		getDriver().findElement(By.linkText(texto)).click();
		
	}
	
	public void clicarItemPorXpath(String texto) {
		getDriver().findElement(By.xpath(texto)).click();
		
	}
	public void selecionarComboPorName(String name, String valor) {

		WebElement element = getDriver().findElement(By.name(name));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public String obterValorCombo(String name) {

		WebElement element = getDriver().findElement(By.name(name));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	public String obterTextoPagina(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getText();
	}
	
	public void clicarCheckPorName(String name) {
		getDriver().findElement(By.name(name)).click();
		
	}
	
	public boolean isCheckMarcado(String name) {
		return getDriver().findElement(By.name(name)).isSelected();
	}

}
