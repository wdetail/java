package 作;

public class Rectangle3 extends Shape3 {
	
	private double width;//宽
	private double height;//高
	
	 
	public double getPer() { 
		return per = 2*(width+height);
		
	} 
	 
	public double getArea() {
		return area = width*height;
	}
	 
	public void showAll() {
		System.out.println("长:"+width);
	    System.out.println("宽:"+height);
	    System.out.println("颜色:"+color);
	    System.out.println("面积:"+getArea());
	    System.out.println("周长:"+getPer());  	
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
