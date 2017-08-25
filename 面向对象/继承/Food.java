package 继承;

public class Food {
	
	public Food(){
		System.out.println("这里有一堆好吃的");
	}
	
	private String name;
	private double price;
	
	public void eat() {
		System.out.println("真好吃");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
