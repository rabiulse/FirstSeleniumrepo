package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class readDatafromExcel {
	@Test
	public static void readdatafromloop() throws IOException {
//HssF-- .xls
		// Xssf--.xlsx and .xls

		String path = "C:\\Users\\rabiu\\git\\repository\\DemoMavenId\\src\\test\\resources\\TestData.xls";
		File file = new File(path);
		FileInputStream fs = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fs);
		HSSFSheet sheets = workbook.getSheet("Sheet1");
		// HSSFRow row = sheets.getRow(2);
		// HSSFCell cell = row.getCell(1);
		// String celldata = cell.getStringCellValue();
		// System.out.println(celldata);

		// apply for loop to get the data for all cell

		int rowscount = sheets.getLastRowNum();
		int colcount = sheets.getRow(1).getLastCellNum();
		System.out.println(rowscount);
		System.out.println(colcount);

		for (int rows = 0; rows <= rowscount; rows++) {
			// HSSFRow rows1 = sheets.getRow(rows);

			for (int c = 0; c < colcount; c++) {

				HSSFCell cell1 = sheets.getRow(rows).getCell(c);

				switch (cell1.getCellType()) {
				case STRING:
					String cellvalue = cell1.getStringCellValue();
					System.out.print(cellvalue);
					break;
				case NUMERIC:
					System.out.print(cell1.getNumericCellValue());
					break;
				default:
					break;

				}
				System.out.print(" | ");

			}

			System.out.println();

		}

	}

	@Test
	public void readdatafromiterator() throws IOException {

		String path = "C:\\Users\\rabiu\\git\\repository\\DemoMavenId\\src\\test\\resources\\TestData.xls";
		File file = new File(path);
		FileInputStream fs = new FileInputStream(file);
		try (HSSFWorkbook workbook = new HSSFWorkbook(fs)) {
			HSSFSheet sheets = workbook.getSheet("Sheet1");
			Iterator iterator = sheets.iterator();
			while (iterator.hasNext()) {
				HSSFRow row = (HSSFRow) iterator.next();

				Iterator Celliterator = row.iterator();

				while (Celliterator.hasNext()) {

					HSSFCell cell = (HSSFCell) Celliterator.next();
					switch (cell.getCellType()) {
					case STRING:
						String cellvalue = cell.getStringCellValue();
						System.out.print(cellvalue);
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					default:
						break;

					}
					System.out.print(" | ");

				}

				System.out.println();

			}
		}
	}

}
