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
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell = row2.getCell(8);
		String address= cell.getStringCellValue();
		System.out.println("Address is :"+ address);
		
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
