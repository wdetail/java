package สýื้;

public class Maopao {
	public static void main(String[]args) {
		
		int[] a={1,60,20,3,9,40,5,7,80};
		for(int b=1;b<a.length;b++){
			for(int c=0;c<a.length-b;c++){
				if(a[c]<a[c+1]){
					int t=a[c];
					a[c] = a[c+1];
					a[c+1] = t;
				}
			}
		}
		for(int x:a)
		System.out.println(x);
	}

}
