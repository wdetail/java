package 类.测试;

import 类.Hero;

public class Hero_ {
	
	public static void main(String[] args){
		
		Hero gailun = new Hero();
		gailun.name = "盖伦";
		gailun.type = "tank";
		gailun.weapon = "大刀";
		gailun.force = 4;
		gailun.endurance = 5;
		
		Hero ruizi = new Hero();
		ruizi.name = "瑞兹";
		ruizi.type = "apc";
		ruizi.weapon = "魔法书";
		ruizi.force = 7;
		ruizi.endurance = 3;
		
		Hero aixi = new Hero();
		aixi.name = "艾希";
		aixi.type = "adc";
		aixi.weapon = "弓箭";
		aixi.force = 8;
		aixi.endurance = 2;
		
		System.out.println(ruizi.weapon);
		
		aixi.目标();
		gailun.目标();
		
		ruizi.想法("我想一个打五个，拿个 penta kill!");
				
	}

}
