package 建造模式.简单工程;

public class VegetableFactory {
	public static Vegetable factory(String name){
		
		if("potato".equals(name)){
			return new Potato();
		}
		else if("tomato".equals(name)){
			
			return new Tomato();
		}else
			return null;
		
	}

}
