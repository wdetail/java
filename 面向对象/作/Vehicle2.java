package 作;
	
public class Vehicle2 {

		private String brand;
		private String color;
		private double speed = 0;
		
		Vehicle2(){
			
		}
		
		Vehicle2(String brand,String color,double speed){ 
			
		}		

		public void run(){
			System.out.println(getColor()+"的"+getBrand()+"的速度是"+getSpeed());
		}

		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getSpeed() {
			return speed;
		}
		public void setSpeed(double speed) {
			this.speed = speed;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
}