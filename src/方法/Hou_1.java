package ����;

public class Hou_1 {
	public static void main(String[] args) {
		Hou_1.func(5);
	}	

	public static int func(int n) {
		int m = 1;
		for (int i = 1; i <= n; i++) {
			m = m * i;
		}
		System.out.println("n�Ľ׳��ǣ�"+m);
		return m;
	}
    

}
