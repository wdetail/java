package ����ϵͳ;

import java.util.Date;
import java.util.Scanner;

public class Login {
	
	private int card ;//����
	private int cipher ;//����
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
		System.out.println("��ӭʹ��XX���е�¼ϵͳ"+new Date());
		input = new Scanner(System.in);
		int a=2;
		for(int b=0; b<3; b++){
			System.out.println("���������Ŀ���:-----");
			String card = input.next();
			System.out.println("��������������:-----");
			String cipher = input.next();
			int result = (int)(Math.random() * 10000 );
			String r = String.valueOf(result) ;
			System.out.println("��������֤��:("+r+")");
			String number = input.next();
			if(card.equals(card) && cipher.equals(cipher) && number.equals(r)){
				System.out.println("---��ӭ"+card+"�û���¼---");				
				break;
			}else if(a!=0){
				System.out.println("---���������Ϣ����,����������(������"+a+"�λ���!)---");
				a--; continue; 
			 }else			         		        
				 System.out.println("---�Բ���,�������½��������,����������!---");
			     System.exit(0); break;  
		}

		
	}

}
