package ��;

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
			System.out.println("������һ������");
		}	
		System.out.println("�Բ����Ѿ�������11�����󡣲����ٴ���������");
		
		return p ;
	}
	
}
