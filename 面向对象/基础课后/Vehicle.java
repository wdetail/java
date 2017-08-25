package 基础课后;

public class Vehicle {//汽车类
	
	private String brand;
	private String color;
	private double speed;
	
	public Vehicle(){		
	}
	public Vehicle(String brand,String color){
		this.brand = brand;
		this.color = color;
		speed = 0;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void run(){
		System.out.println(getColor()+"的"+getBrand()+"的速度是"+getSpeed());
	}
	public String getBrand() {
		return brand;
	}



}
