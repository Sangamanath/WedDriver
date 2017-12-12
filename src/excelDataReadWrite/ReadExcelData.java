/**
 * 
 */
package excelDataReadWrite;

/**
 * @author PC-Rothy
 *
 */
public class ReadExcelData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelDataConfig excel=new ExcelDataConfig("C:/Users/PC-Rothy/workspace/Selenium-3.7/ExcelData/Book1.xlsx");
		
		System.out.println(" Here is the Data : " +excel.getData(0, 0, 0) +"Success !!!!");
	}

}
