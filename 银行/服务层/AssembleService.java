package �����;

import java.io.IOException;
import java.util.Map;

import ��Ϣ����.AccountCache;
import ����.Account;
import ����.WrapData;
import ʵ�ֲ�.AssembleHandler;

public class AssembleService {
	
	//���� handler �� ����װ��
	private AssembleHandler handler = new AssembleHandler();
	
	//�����ݴ�  ���е��˻���
	private Map<String , Account> accounts ;

	//
	public void LoadAccounts() throws IOException {
		
		//�����˻���Ϣ
		accounts = handler.LoadAccounts();
		
		WrapData wrapData = new WrapData();
		wrapData.setAccounts(accounts);
		
		AccountCache.getInstance().setWrapData(wrapData);
	}


}
