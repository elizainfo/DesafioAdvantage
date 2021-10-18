package br.elizangela.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class CadastroPage {
	
	private DSL dsl;
	
	public CadastroPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void setUsername(String username) throws IOException{
		
//		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
//		FileInputStream inputStream = new FileInputStream(file);
//		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		//Leitura de dado contido em linha e coluna específica
		
//		XSSFRow row0 = sheet.getRow(1);
//		XSSFCell cell0 = row0.getCell(0);
		
		dsl.escreverPorName("usernameRegisterPage", username);
		//dsl.escreve("elementosForm:nome", 
		//System.out.println("Username is :"+ username );
		
	}

}
