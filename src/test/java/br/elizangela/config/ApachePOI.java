package br.elizangela.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOI {
	
	public static void main(String[] args) throws IOException {
		
		File file =    new File("C:\\Workspaces\\DesafioAdvantage\\src\\test\\resources\\DataAdvantage.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Usuario_Data");
		
		//Leitura de dado contido em linha e coluna específica
		
		XSSFRow row0 = sheet.getRow(1);
		XSSFCell cell0 = row0.getCell(0);
		String username = cell0.getStringCellValue();
		System.out.println("Username is :"+ username );
		
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		String email = cell1.getStringCellValue();
		System.out.println("Email is :"+ email );
		
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell2 = row2.getCell(2);
		String password = cell2.getStringCellValue();
		System.out.println("Password is :"+ password );
		
		XSSFRow row3 = sheet.getRow(1);
		XSSFCell cell3 = row3.getCell(3);
		String firstname = cell3.getStringCellValue();
		System.out.println("Firstname is :"+ firstname );
		
		XSSFRow row4 = sheet.getRow(1);
		XSSFCell cell4 = row4.getCell(4);
		String lastname = cell4.getStringCellValue();
		System.out.println("Lastname is :"+ lastname );
		
		XSSFRow row5= sheet.getRow(1);
		XSSFCell cell5 = row5.getCell(5);
		String phonenumber = cell5.getStringCellValue();
		System.out.println("Phonenumber is :"+ phonenumber );
		
		XSSFRow row6= sheet.getRow(1);
		XSSFCell cell6 = row6.getCell(6);
		String country = cell6.getStringCellValue();
		System.out.println("Country is :"+ country );
		
		XSSFRow row7= sheet.getRow(1);
		XSSFCell cell7 = row7.getCell(7);
		String city = cell7.getStringCellValue();
		System.out.println("City is :"+ city );
		
		XSSFRow row8 = sheet.getRow(1);
		XSSFCell cell = row8.getCell(8);
		String endereco= cell.getStringCellValue();
		System.out.println("Endereço é :"+ endereco);
		
		XSSFRow row9 = sheet.getRow(1);
		XSSFCell cell9 = row9.getCell(9);
		String estado = cell9.getStringCellValue();
		System.out.println("Estado é :"+ estado);
		
		XSSFRow row10 = sheet.getRow(1);
		XSSFCell cell10 = row10.getCell(10);
		String cep = cell10.getStringCellValue();
		System.out.println("CEP é :"+ cep);
		
		//Leitura do arquivo excel completo
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        for(int i=1;i<=rowCount;i++){
            
            int cellcount=sheet.getRow(i).getLastCellNum();
            
                System.out.println("Row"+ i+" data is :");
            
            for(int j=0;j<cellcount;j++){
            	
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            }
            
            System.out.println();
        }
    }
	
	

}
