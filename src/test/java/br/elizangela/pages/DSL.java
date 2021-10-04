package br.elizangela.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;
	
	
	public DSL(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void escreverPorId(String id_campo, String texto) {
		driver.findElement(By.name(id_campo)).sendKeys(texto);
		
	}
	
	public void escreverPorName(String name_campo, String texto) {
		driver.findElement(By.name(name_campo)).sendKeys(texto);
		
	}

}
