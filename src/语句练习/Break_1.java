package �����ϰ;

public class Break_1 {
	public static void main(String [] args){
		int x, sum=0;
		for(x=1;x<=100;x++){
			sum+=x;
			
			if(sum>20){
				break;
			}
		}
		System.out.println("��1��"+x+"�ĺ�Ϊsum"+sum);
	}

}
