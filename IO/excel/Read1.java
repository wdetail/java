package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Read1 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("d:/eclipse/LianXi/IO/excel/demo.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook(in);
		
		HSSFSheet sheet = wb.getSheetAt(0);
		
		Iterator<Row> rows = sheet.iterator();
		
		while(rows.hasNext()){
			
			Row row = rows.next();
			
			Iterator<Cell> cells = row.cellIterator();
			
			while(cells.hasNext()){
				
				Cell cell = cells.next();
				
				switch(cell.getCellType()){
				
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue()+"\t");
					break;
					
				default:
					break;
				
				}
			}
			System.out.println();
			
			
		}

	}

}
