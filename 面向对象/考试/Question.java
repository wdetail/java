package ����;

public class Question {
	
	protected String text ;
	protected Option[] options;
	


	public Question(){
		System.out.println("�뿪ʼ��ı���!");		
	}
	
	public Question(String text, Option[] options) {
		super();
		this.text = text ;
		this.options = options ;
	}
	
	public Question(String text ) {
		super();
		this.text = text;
	}
	
	//���ඨ�� , ����������ʵ�������ļ��鷽ʽ
	public boolean check(char[] customer){
		return false;		
	}
	
	public boolean check(String[] customer){
		return false;		
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
		
	public Option[] getOptions() {
		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;
	}

	public boolean check(char c) {
		return false;
	}

}
