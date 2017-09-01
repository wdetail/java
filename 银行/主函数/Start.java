package 主函数;

import java.io.IOException;

import org.junit.Test;

import 内容.Account;
import 服务层.AssembleService;
import 调用.Dispatch;

public class Start {
	
	@Test
	public void start() throws IOException {		
		//初始化加载
		AssembleService assembleService = new AssembleService();
		assembleService.LoadAccounts();	
		
		Dispatch.dispatch("account.login");
		
	}

}
