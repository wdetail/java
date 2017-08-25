package 建造模式.简单工程;

public class Test {

	public static void main(String[] args) {
		
		Vegetable v1 = VegetableFactory.factory("potato");
		
		Vegetable v2 = VegetableFactory.factory("tomato"); 

	}

}
