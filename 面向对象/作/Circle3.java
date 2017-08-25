package 作;

public class Circle3 extends Shape3 {
	
	private double radius;//半径
	
	
	public double getPer() { 
		return per = 2*3.14*radius;		
	} 
	 
	public double getArea() {
		return area = 3.14*radius*radius;
	}
	 
	public void showAll() {
		System.out.println("半径:"+radius);
	    System.out.println("颜色:"+color); 
	    System.out.println("面积:"+getArea());
	    System.out.println("周长:"+getPer());  	
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