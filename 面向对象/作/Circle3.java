package ��;

public class Circle3 extends Shape3 {
	
	private double radius;//�뾶
	
	
	public double getPer() { 
		return per = 2*3.14*radius;		
	} 
	 
	public double getArea() {
		return area = 3.14*radius*radius;
	}
	 
	public void showAll() {
		System.out.println("�뾶:"+radius);
	    System.out.println("��ɫ:"+color); 
	    System.out.println("���:"+getArea());
	    System.out.println("�ܳ�:"+getPer());  	
	}
	
	Circle3() {
		
	}
	
	Circle3(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
			

}