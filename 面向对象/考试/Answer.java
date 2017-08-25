package øº ‘;

public class Answer {
	
	private char[] choice;
	private String[] key;
	

	public Answer() {
		
	}

	public Answer(char[] choice) {
		super();
		this.choice = choice;
	}
	
	public Answer(String[] key) {
		super();
		this.key = key;
	}

	public char[] getChoice() {
		return choice;
	}

	public void setChoice(char[] choice) {
		this.choice = choice;
	}
	
	public String[] getKey() {
		return key;
	}

	public void setKey(String[] key) {
		this.key = key;
	}
	
}
