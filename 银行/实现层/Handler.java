package 实现层;

import java.util.Map;

import 信息缓存.AccountCache;
import 内容.Account;

public class Handler {
	
	private Map<String, Account> accounts;
	
	//登录验证
	public Account CheckAccount(Account account) {

		accounts = AccountCache.getInstance().getWrapData().getAccounts();

		if (accounts.containsKey(account.getCard())) {

			Account eq = accounts.get(account.getCard()); //帐号对上了 , 下一步查密码

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
