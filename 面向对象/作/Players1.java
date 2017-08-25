package 作;

public class Players1 {
	
	private static int sum ;
	
	private Players1(){
		
	}
	
	public static Players1 create(){
		sum = 1 ;
		Players1 p = null ;
		while(sum < 12){
			p = new Players1();
			sum++ ;
			System.out.println("创建了一个对象");
		}	
		System.out.println("对不起，已经创建了11个对象。不能再创建对象了");
		
		return p ;
	}
	
}
