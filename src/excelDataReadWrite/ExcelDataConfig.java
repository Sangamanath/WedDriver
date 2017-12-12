package excelDataReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	
	public ExcelDataConfig(String excelPath) {
		// TODO Auto-generated constructor stub
		try
		{
			File src=new File(excelPath);
			FileInputStream fis=new FileInputStream(src);
			//sheet1=wb.getSheetAt(0);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getData(int getSheetNumber, int row, int col)
	{
		sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}

}
