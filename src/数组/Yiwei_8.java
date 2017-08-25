package สýื้;

public class Yiwei_8 {

	public static void main(String[] args) {
		
		int[] a = {1,3,5,3,6,7,5};
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] == a[j]){
					a[j] = 0;
				}
			}
		}
		for(int x : a)
		System.out.print(+x);

	}

}
