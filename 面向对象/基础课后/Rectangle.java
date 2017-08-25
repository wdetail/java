package 基础课后;

public class Rectangle {//矩形类
	
	public int width ;
	public int height ;
	
	public Rectangle(){	
	}
	public Rectangle(int width,int height){
	  	this.width=width;
	    this.height=height;
	}
	public int getArea(){
		return this.width*this.height;
	}
	public int getPer(){
		return 2*(this.width+this.height);
	}
	public void showAll(){		
		System.out.println("Width="+this.width);
	    System.out.println("Height="+this.height);
	    System.out.println("Area="+this.getArea());
	    System.out.println("Per="+this.getPer());

	}

}
