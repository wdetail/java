package øº ‘;

public class Fill extends Question{
	
	private String answer ;
	
	public Fill(){
		
	}
	
	public Fill(String text, String fillAnswer ){
		super(text);
		this.answer = fillAnswer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public boolean check(String[] customer) {
		
		return this.answer == customer[0] ? true : false;
	}

}
