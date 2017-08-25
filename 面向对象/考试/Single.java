package øº ‘;

public class Single extends Question {
	
	private char answer ;
	
	public Single(){
		
	}
	
	public Single(String text, Option[]options, char answer ) {
		super(text, options);
		this.answer = answer;
	}
	
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
	
	public boolean check(char[] customer) {
		
		return this.answer == customer[0] ? true : false;
	}
	
}
