package excelDataReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReadWrite {
	public static void main(String args[]) throws IOException
	{
	File data=new File("C:/Users/PC-Rothy/workspace/Selenium-3.7/ExcelData/Book1.xlsx");
	
	FileInputStream input=new FileInputStream(data);
	
	XSSFWorkbook book=new XSSFWorkbook(input);
	
	
	XSSFSheet sheet1=book.getSheetAt(0);
	
	
	String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data of excel is : "+data1);
	
	int rowcount=sheet1.getLastRowNum();
	System.out.println("Total no of rows :" +rowcount);
	
	for(int i=0; i<rowcount; i++)
	{
		String dataRow=sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(+i+"Data is : "+dataRow);
	}
	int colCount=sheet1.getLeftCol();
	System.out.println(" Total coloum's is : "+colCount);
	for(int j=0; j<colCount; j++)
	{
		String colData=sheet1.getRow(0).getCell(j).getStringCellValue();
		System.out.println(+j+ "Coloum Data is here :  " +colData);
	}
	book.close();
	
	}
}
 