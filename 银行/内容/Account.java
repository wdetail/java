package ƒ⁄»›;

import java.math.BigDecimal;

public class Account {//’Àªß
	
	private User user;

	private String card;
	private String cipher;//√‹¬Î

	private BigDecimal balance;

	
	public Account() {	}

	public Account(BigDecimal balance, String card, String cipher, User user) {
		this.balance = balance;
		this.card = card;
		this.cipher = cipher;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getCipher() {
		return cipher;
	}

	public void setCipher(String cipher) {
		this.cipher = cipher;
	}	

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [user=" + user + ", card=" + card + ", cipher=" + cipher + ", balance=" + balance + "]";
	}	
	
}
