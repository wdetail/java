package ������;

import java.io.IOException;

import org.junit.Test;

import ����.Account;
import �����.AssembleService;
import ����.Dispatch;

public class Start {
	
	@Test
	public void start() throws IOException {		
		//��ʼ������
		AssembleService assembleService = new AssembleService();
		assembleService.LoadAccounts();	
		
		Dispatch.dispatch("account.login");
		
	}

}
