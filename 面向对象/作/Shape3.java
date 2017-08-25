package 作;

public abstract class Shape3 {
	
	protected double area;//面积
	protected double per; //周长
	protected String color; //颜色
	
	Shape3(){ 
		
	} 
	Shape3(String color){ 

	}
	
	public abstract double getArea(); 
	public abstract double getPer(); 
	public abstract void showAll();
	

}
