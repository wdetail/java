package ʵ�ֲ�;

import java.util.Map;

import ��Ϣ����.AccountCache;
import ����.Account;

public class Handler {
	
	private Map<String, Account> accounts;
	
	//��¼��֤
	public Account CheckAccount(Account account) {

		accounts = AccountCache.getInstance().getWrapData().getAccounts();

		if (accounts.containsKey(account.getCard())) {

			Account eq = accounts.get(account.getCard()); //�ʺŶ����� , ��һ��������

			if (account.getCipher().equals(eq.getCipher())) {
				return eq;
			} else {
				return null;
			}
		} else {
			return null;
		}
		
	}

}
