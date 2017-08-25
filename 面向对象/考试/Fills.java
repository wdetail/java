package 考试;

import org.apache.commons.lang3.ArrayUtils;

public class Fills extends Question{
	
	private String[] answer ;
	
	public Fills(){
		
	}
	
	public Fills(String text, String[] fillAnswer ){
		super(text);
		this.answer = fillAnswer;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
		this.answer = answer;
	}
	
	public boolean check(String[] customer) {
		boolean flag = true; 

		if (customer != null && customer.length == answer.length) { // 答案的个数和正确答案的个数 要匹配
//
			for (int i = 0; i < answer.length; i++) {
				
				flag = ArrayUtils.contains(customer, answer[i]);

				if (!flag) break;				
			}           
		} 
		else {
			flag = false;
		}

		return flag;
	}

}
