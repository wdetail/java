package ��;

public abstract class Shape3 {
	
	protected double area;//���
	protected double per; //�ܳ�
	protected String color; //��ɫ
	
	Shape3(){ 
		
	} 
	Shape3(String color){ 

	}
	
	public abstract double getArea(); 
	public abstract double getPer(); 
	public abstract void showAll();
	

}
