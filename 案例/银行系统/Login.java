package 银行系统;

import java.util.Date;
import java.util.Scanner;

public class Login {
	
	private int card ;//卡号
	private int cipher ;//密码
	private Scanner input;
	
	Login(){
		
	}
	
	Login(int card, int cipher ){
		this.card = card ;
		this.cipher = cipher ;
	}			
	
	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}

	public int getCipher() {
		return cipher;
	}

	public void setCipher(int cipher) {
		this.cipher = cipher;
	}
	
	public void In(){
		System.out.println("欢迎使用XX银行登录系统"+new Date());
		input = new Scanner(System.in);
		int a=2;
		for(int b=0; b<3; b++){
			System.out.println("请输入您的卡号:-----");
			String card = input.next();
			System.out.println("请输入您的密码:-----");
			String cipher = input.next();
			int result = (int)(Math.random() * 10000 );
			String r = String.valueOf(result) ;
			System.out.println("请输入验证码:("+r+")");
			String number = input.next();
			if(card.equals(card) && cipher.equals(cipher) && number.equals(r)){
				System.out.println("---欢迎"+card+"用户登录---");				
				break;
			}else if(a!=0){
				System.out.println("---您输入的信息有误,请重新输入(您还有"+a+"次机会!)---");
				a--; continue; 
			 }else			         		        
				 System.out.println("---对不起,您今天登陆次数超限,请明天再来!---");
			     System.exit(0); break;  
		}

		
	}

}
