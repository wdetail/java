package 类;

public class Hero {
	
	public String name;
	public String type;
	public String weapon; //武器
	public int force; //武力
	public int endurance; //耐力
	
	public void 目标(){
		System.out.println("推掉敌方基地");
	}
	
	public void 想法(String idea) {
		System.out.println("我是:"+ name +"我有个想法 :"+ idea);
	}
	

}
