package javaCollection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mapexampleforExcle {

	@Test(dataProvider = "datasupplier")
	public void getTestadata(Map<Object, Object> map) {

		System.out.println("-------------Test case started ----------------");
		Reporter.log("Firstname " + map.get("FirstName"));
		System.out.println(map.get("FirstName"));
		Reporter.log("LastName " + map.get("LastName"));
		System.out.println(map.get("LastName"));
		System.out.println(map.get("Email"));
		Reporter.log("Email " + map.get("Email"));
		System.out.println("-------------Test case Ended ----------------");

	}

	@DataProvider(name = "datasupplier")
	public Object[][] readdatafromExcel() {
		String path = "C:\\Users\\rabiu\\git\\repository\\DemoMavenId\\src\\test\\resources\\TestData.xls";
		File file = new File(path);
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HSSFWorkbook workbook = null;
		try {
			workbook = new HSSFWorkbook(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HSSFSheet sheets = workbook.getSheet("Sheet1");

		int getlastrownumber = sheets.getLastRowNum();
		Reporter.log("getlastrownumber " + getlastrownumber);
		System.out.println(getlastrownumber + "getlastrownumber");
		int lastcellnumber = sheets.getRow(0).getLastCellNum();
		Object[][] obj = new Object[getlastrownumber][1];
		for (int i = 0; i < getlastrownumber; i++) {
			Map<Object, Object> datamap = new HashMap<>();
			for (int j = 0; j < lastcellnumber; j++) {
				datamap.put(sheets.getRow(0).getCell(j).toString(), sheets.getRow(i + 1).getCell(j).toString());
			}
			obj[i][0] = datamap;
		}

		return obj;

	}

}
