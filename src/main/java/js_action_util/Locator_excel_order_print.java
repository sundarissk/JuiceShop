package js_action_util;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Locator_excel_order_print {
	private static final String FILE_NAME = "C:\\Users\\skuma\\eclipse-workspace\\JuiceShop_sel\\test-output\\js_order_details.xls";
	//private static final String FILE_NAME2 = "Location2";
	public static XSSFWorkbook workbook;

	static {
		workbook = new XSSFWorkbook();
	}
	public void ex_write_sinlgle(String SheetName) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
		XSSFSheet sheet = workbook.createSheet(SheetName);
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Product");
		row.createCell(1).setCellValue("Price");
		row.createCell(2).setCellValue("Quantity");
		row.createCell(3).setCellValue("Total price");
		workbook.write(outputStream);
		// workbook.close();

	}
	
	public static void main(String[] args) throws IOException {
		Locator_excel_order_print run = new Locator_excel_order_print();
		run.ex_write_sinlgle("JS ORDER");
		workbook.close();

	}
}
