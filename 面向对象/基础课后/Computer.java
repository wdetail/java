package 基础课后;

public class Computer {
	
	private char color;
	private int cpu;
	
	public Computer() {

	}

	public Computer(char color, int cpu) {
		this.color = color;
		this.cpu = cpu;
	}
	
	
	public char getColor() {
	    return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public void showComputer() {
		System.out.println("笔记本的颜色:" + getColor());
		System.out.println("笔记本的CPU型号:" + getCpu());

	}


}
