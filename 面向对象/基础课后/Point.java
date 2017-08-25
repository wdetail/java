package 基础课后;

public class Point {//点类
	public int x0;
	public int y0;
	
	public Point(){
    }
    public Point(int x0,int y0){
    	this.x0=x0;
        this.y0=y0;
    }
    public void movePoint(int dx,int dy){
    	this.x0 = this.x0 + dx;
    	this.y0 = this.y0 + dy; 
    	
    }
    
	 public int getX0() {
		return x0;
	}
	public void setX0(int x0) {
		this.x0 = x0;
	}
	public int getY0() {
		return y0;
	}
	public void setY0(int y0) {
		this.y0 = y0;
	}
}

