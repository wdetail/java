package √∞≈›≈≈–Ú∑Ω∑®;

public class MaoPao {

	public static void Pao(int[] a){
		
		for(int i=1; i<a.length; i++){
			for(int j=0; j<a.length-i; j++){
				if(a[j]>a[j+1]){
					int b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
				}
			}
		}
		for(int c:a){
			System.out.print(c+"\t");
		}
	}
	
}
