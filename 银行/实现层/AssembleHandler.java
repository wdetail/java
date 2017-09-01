package 实现层;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import 内容.Account;
import 内容.User;

public class AssembleHandler {
	
	private Map<String, Account> accounts;
		
	public Map<String, Account> LoadAccounts() throws IOException{
		
	    InputStream in = new FileInputStream("D:/eclipse/LianXi/银行/domo.xls");
			
		HSSFWorkbook wb = new HSSFWorkbook(in);
			
		HSSFSheet sheet = wb.getSheet("Account");
		accounts = new HashMap<String , Account>();	
		HSSFSheet sheet1 = wb.getSheet("User");

		for (int i = 1; i < sheet.getLastRowNum()+1; i++) {
			Row row = sheet.getRow(i);
			Row row1 = sheet1.getRow(i);
			if(row!=null && row1!=null){
//				User u = new User(row1.getCell(0).toString(),row1.getCell(1).toString(),row1.getCell(2).toString(),row1.getCell(3).toString());				
				Account a = new Account();
				a.setCard(row.getCell(0).toString());
				a.setCipher(row.getCell(1).toString());			
				a.setBalance(new BigDecimal(row.getCell(3).toString()));
				a.setUser(new User(row1.getCell(0).toString(),row1.getCell(1).toString(),row1.getCell(2).toString(),row1.getCell(3).toString()));
				accounts.put(a.getCard(), a);
			}
		}	    
	    
        return accounts;
		
	}				

}
