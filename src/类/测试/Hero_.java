package ��.����;

import ��.Hero;

public class Hero_ {
	
	public static void main(String[] args){
		
		Hero gailun = new Hero();
		gailun.name = "����";
		gailun.type = "tank";
		gailun.weapon = "��";
		gailun.force = 4;
		gailun.endurance = 5;
		
		Hero ruizi = new Hero();
		ruizi.name = "����";
		ruizi.type = "apc";
		ruizi.weapon = "ħ����";
		ruizi.force = 7;
		ruizi.endurance = 3;
		
		Hero aixi = new Hero();
		aixi.name = "��ϣ";
		aixi.type = "adc";
		aixi.weapon = "����";
		aixi.force = 8;
		aixi.endurance = 2;
		
		System.out.println(ruizi.weapon);
		
		aixi.Ŀ��();
		gailun.Ŀ��();
		
		ruizi.�뷨("����һ����������ø� penta kill!");
				
	}

}
