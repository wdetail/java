package 周末;

public class Ye_7 {

	public static void main(String[] args) {
		int a,b,c;
		for(a=1;a<=33;a++){
			for(b=1;b<=50;b++){
				for(c=2;c<=200;c+=2){
					if((3*a+2*b+c/2==100) && (a+b+c==100)){
						System.out.println
						("大马："+a+"匹；"+"中马："+b+"匹；"+"小马："+c+"匹");
					}
				}
			}
		}
		

	}

}
