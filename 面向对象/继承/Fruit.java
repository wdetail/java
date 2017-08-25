package 继承;

public class Fruit extends Food {
	
	public Fruit() {
		System.out.println("我有各种样子");
	}

	
	private String color;


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
}
