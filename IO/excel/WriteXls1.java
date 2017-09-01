package excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXls1 {

	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("D:/eclipse/LianXi/IO/excel/demo.xls");

		HSSFWorkbook wb = new HSSFWorkbook();
		
		HSSFSheet sheet = wb.createSheet("致馨公寓");
		
		HSSFRow row_title = sheet.createRow(0);
		
		HSSFCell row_title_cell_0 = row_title.createCell(0);
		row_title_cell_0.setCellValue("楼栋");
		HSSFCell row_title_cell_1 = row_title.createCell(1);
		row_title_cell_1.setCellValue("门号");
		HSSFCell row_title_cell_2 = row_title.createCell(2);
		row_title_cell_2.setCellValue("人数");
		HSSFCell row_title_cell_3 = row_title.createCell(3);
		row_title_cell_3.setCellValue("户主 ");
		
		for (int i = 1 ; i <= 4 ; i++) {
			HSSFRow row = sheet.createRow(i);
			
			for (int j = 0; j < 4; j++) {
				HSSFCell cell = row.createCell(j);
				cell.setCellValue(i + "-" + j);
			}
			
		}
		
		wb.write(out);
		
		out.flush();
		out.close();
		
	}

}
