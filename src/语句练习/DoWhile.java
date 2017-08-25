package 语句练习;

public class DoWhile {
	public static void main(String[]args){
		int x = 1;
		int sum = 0;
		do{
			sum = sum+x;
			x++;			
		}while(x<=100);
		System.out.println("从1到100的 和：sum"+sum);
	}
    
}
