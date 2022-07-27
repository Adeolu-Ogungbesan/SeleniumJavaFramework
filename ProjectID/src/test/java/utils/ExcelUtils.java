package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectpath; 
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			projectpath =  System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet = workbook.getSheet("sheetName");
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		//getRowCount();
		getCellData(0, 0);
		getCellDataNumber(1, 1);
	}
	public static void getRowCount() {
		try {
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows is :"+rowCount);

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static void getCellData(int rowNum, int colNum) {
		try {
			
			String CellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(CellData);

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}


	}
	public static void getCellDataNumber(int rowNum, int colNum) {
		try {
			workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double CellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(CellData);

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}}
