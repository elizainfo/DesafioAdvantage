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
	
	public void setUsername(String username){
		dsl.escreverPorName("usernameRegisterPage", username);
		}
	
	public void setEmail(String email) {
		dsl.escreverPorName("emailRegisterPage", email);
		}
	
	public void setPassword(String pass) {
		dsl.escreverPorName("passwordRegisterPage", pass);
		}
	
	public void setConfirmaPassword(String cpass) {
		dsl.escreverPorName("confirm_passwordRegisterPage", cpass);
		}
	
	public void setFirstName(String firstname) {
		dsl.escreverPorName("first_nameRegisterPage", firstname);
	}
	
	public void setLastName(String lastname) {
		dsl.escreverPorName("last_nameRegisterPage", lastname);
	}
	
	public void setPhoneNumber(String phone) {
		dsl.escreverPorName("phone_numberRegisterPage", phone);
	}
	
	public void setCountry(String country) {
		dsl.selecionarComboPorName("countryListboxRegisterPage", country);
	}
	
	public void setCity(String city) {
		dsl.escreverPorName("cityRegisterPage", city);
	}
	
	public void setAdress(String adress) {
		dsl.escreverPorName("addressRegisterPage", adress);
	}
	
	public void setState(String state) {
		dsl.escreverPorName("state_/_province_/_regionRegisterPage", state);
	}
	
	public void setPostalCode(String postalcode) {
		dsl.escreverPorName("postal_codeRegisterPage", postalcode);
	}

}
