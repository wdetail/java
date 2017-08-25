package 作;

public class Car2 extends Vehicle2{
	

		private int loader; 
		
		Car2(){ 
			
		} 
		Car2(String brand, String color, int loader ){
			
		} 
		public void run(){ 
			System.out.println(getColor()+"的载人数"+loader+"的"+getBrand()+"的速度是"+getSpeed());

		}

		public int getLoader() {
			return loader;
		}
		public void setLoader(int loader) {
			this.loader = loader;
		}
		
		
		public static void main(String[] args) {

		} 		

}
