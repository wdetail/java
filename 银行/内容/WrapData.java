package ����;

import java.util.Map;

public class WrapData {

	private Account account;
	private Map<String, Account> accounts;
//	private User user;
//	private Map<String User> users;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Map<String, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, Account> accounts) {
		this.accounts = accounts;
	}

}
