package ��;

public class Rectangle3 extends Shape3 {
	
	private double width;//��
	private double height;//��
	
	 
	public double getPer() { 
		return per = 2*(width+height);
		
	} 
	 
	public double getArea() {
		return area = width*height;
	}
	 
	public void showAll() {
		System.out.println("��:"+width);
	    System.out.println("��:"+height);
	    System.out.println("��ɫ:"+color);
	    System.out.println("���:"+getArea());
	    System.out.println("�ܳ�:"+getPer());  	
	}
	 
	Rectangle3(){ 
		 
	}
	 
	Rectangle3(double width, double height, String color){ 
		 this.width = width;
		 this.height = height;
		 this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
 }
