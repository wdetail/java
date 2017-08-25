package ����;

import org.apache.commons.lang3.ArrayUtils;

public class Multi extends Question {
	
	private char[] answer ;
	
	public Multi(){
		
	}
	
	public Multi(String test, Option[] options, char[] answer){
		super(test, options);
		this.answer = answer;
	}
	
	public char[] getAnswer() {
		return answer;
	}
	public void setAnswer(char[] answer) {
		this.answer = answer;
	}
	
//	@Override
	public boolean check(char[] customer) {
		boolean flag = true; 

		if (customer != null && customer.length == answer.length) { // �𰸵ĸ�������ȷ�𰸵ĸ��� Ҫƥ��
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
