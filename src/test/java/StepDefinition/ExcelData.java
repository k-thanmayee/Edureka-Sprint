package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	@DataProvider(name = "loginData")
	public String[][] getData() throws IOException
	{
		File excelFile = new File("C:\\Users\\TKOLICHA\\Documents\\SprintExcel.xlsx");
		System.out.println(excelFile.exists());
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rows-1][cols ];
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<cols;j++)
			{
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		return data;

	}
}
