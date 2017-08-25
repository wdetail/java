package Êý×é;

public class ÅÅÐò {
	public static void main(String[]args) {
		
		int[] a = {1,9,3,7,5,2,8,4,6};
		for(int i=1;i<a.length;i++ ){
			for(int j=0;j<a.length-i;j++){
				if(a[j]>a[j+1]){
					int b = a[j];
					a[j] = a[j+1];
					a[j+1] = b;
				}
			}
		}
		for(int c : a){
			System.out.println(c);
		}
	}

}
