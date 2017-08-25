package 周末;

public class Zuo_1 {

	public static void main(String[] args) {
		int x=66;
		if(x<=10){
			double y1= x*0.1;
			System.out.println("应发奖金总和："+y1+"万元");
		}
		else if(x>10 && x<=20){
			double y2= (x-10)*0.075+1;
			System.out.println("应发奖金总和："+y2+"万元");
		}
		else if(x>20 && x<=40){
			double y3= (x-20)*0.05+0.75+1;
			System.out.println("应发奖金总和："+y3+"万元");
		}
		else if(x>40 && x<=60){
			double y4= (x-40)*0.03+1+0.75+1;
			System.out.println("应发奖金总和："+y4+"万元");
	    }
		else if(x>60 && x<=100){
			double y5= (x-60)*0.015+0.6+1+0.75+1;
			System.out.println("应发奖金总和："+y5+"万元");
		}
		else if(x>100){
			double y6= (x-100)*0.01+0.6+0.6+1+0.75+1;
			System.out.println("应发奖金总和："+y6+"万元");
	    }
    }
}
