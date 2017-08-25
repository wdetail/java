package ·½·¨;

public class Hou_3 {

	public static void main(String[] args) {				
			Hou_3.method();
	}
		
		public static void method() {
			for (int i = 200; i < 300; i++) {
				boolean b = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						b = false;
						break;
					}
				}
				if (!b) {
					continue;
				}
				System.out.println(i);
				break;
			}
		}	

}
