package 周末;

public class Ye_6 {

	public static void main(String[] args) {
		int x,y,z;
		for(x=1;x<=20;x++){
			for(y=1;y<=33;y++){
				for(z=3;z<=300;z+=3){
					if((5*x+3*y+z/3==100) && (x+y+z==100)){
						System.out.println
						("公鸡："+x+"只；"+"母鸡数："+y+"只；"+"雏鸡数："+z+"只");
					}
				}
			}
		}
		

	}

}
