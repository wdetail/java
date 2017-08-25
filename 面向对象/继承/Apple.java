package 继承;

public class Apple extends Fruit {
	
	public Apple() {
		System.out.println("酸酸甜甜就是我");
		System.out.println("瞧我这红红的脸蛋");
	}
		
	
	private int size;


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
