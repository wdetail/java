package 实现层;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import 内容.Account;

public class CallHandler {
	
	private Map<String, Account> accounts;
	
    public Map<String, Account> WriteAccounts() throws IOException{
		
		OutputStream out = new FileOutputStream("D:/eclipse/LianXi/银行/domo.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook();
		
        HSSFSheet sheet = wb.createSheet("Account");
        
        HSSFSheet sheet1 = wb.createSheet("User");
		
		HSSFRow row_title = sheet.createRow(0);
		
		HSSFCell row_title_cell_0 = row_title.createCell(0);
		row_title_cell_0.setCellValue("card");
		HSSFCell row_title_cell_1 = row_title.createCell(1);
		row_title_cell_1.setCellValue("cipher");
		HSSFCell row_title_cell_2 = row_title.createCell(2);
		row_title_cell_2.setCellValue("user");
		HSSFCell row_title_cell_3 = row_title.createCell(3);
		row_title_cell_3.setCellValue("balance");
		
		HSSFRow row_first = sheet.createRow(1);
		
		HSSFCell row_first_cell_0 = row_first.createCell(0);
		row_first_cell_0.setCellValue("1001");
		HSSFCell row_first_cell_1 = row_first.createCell(1);
		row_first_cell_1.setCellValue("1234");
		HSSFCell row_first_cell_2 = row_first.createCell(2);
		row_first_cell_2.setCellValue("001");
		HSSFCell row_first_cell_3 = row_first.createCell(3);
		row_first_cell_3.setCellValue("666.66");
		
        HSSFRow row_second = sheet.createRow(2);
		
		HSSFCell row_second_cell_0 = row_second.createCell(0);
		row_second_cell_0.setCellValue("1002");
		HSSFCell row_second_cell_1 = row_second.createCell(1);
		row_second_cell_1.setCellValue("4321");
		HSSFCell row_second_cell_2 = row_second.createCell(2);
		row_second_cell_2.setCellValue("002");
		HSSFCell row_second_cell_3 = row_second.createCell(3);
		row_second_cell_3.setCellValue("999.9");        
		
		HSSFRow row_title1 = sheet1.createRow(0);
		
		HSSFCell row_title1_cell_0 = row_title1.createCell(0);
		row_title1_cell_0.setCellValue("name");
		HSSFCell row_title1_cell_1 = row_title1.createCell(1);
		row_title1_cell_1.setCellValue("gender");
		HSSFCell row_title1_cell_2 = row_title1.createCell(2);
		row_title1_cell_2.setCellValue("tel");
		HSSFCell row_title1_cell_3 = row_title1.createCell(3);
		row_title1_cell_3.setCellValue("ID");
		
		HSSFRow row_first1 = sheet1.createRow(1);
		
		HSSFCell row_first1_cell_0 = row_first1.createCell(0);
		row_first1_cell_0.setCellValue("小俊");
		HSSFCell row_first1_cell_1 = row_first1.createCell(1);
		row_first1_cell_1.setCellValue("男");
		HSSFCell row_first1_cell_2 = row_first1.createCell(2);
		row_first1_cell_2.setCellValue("1357");
		HSSFCell row_first1_cell_3 = row_first1.createCell(3);
		row_first1_cell_3.setCellValue("19950101");
		
        HSSFRow row_second1 = sheet1.createRow(2);
		
		HSSFCell row_second1_cell_0 = row_second1.createCell(0);
		row_second1_cell_0.setCellValue("小军");
		HSSFCell row_second1_cell_1 = row_second1.createCell(1);
		row_second1_cell_1.setCellValue("男");
		HSSFCell row_second1_cell_2 = row_second1.createCell(2);
		row_second1_cell_2.setCellValue("2468");
		HSSFCell row_second1_cell_3 = row_second1.createCell(3);
		row_second1_cell_3.setCellValue("19950202");
				
		wb.write(out);
		
	    out.flush();
		out.close();
    	
 
		
		
	    return accounts;
	}

}
