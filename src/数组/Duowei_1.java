package สýื้;

public class Duowei_1 {
	public static void main(String[]args){
    int[][]a = new int[3][4];
    for(int i=0;i<a.length;i++){
    	for(int j=0;j<a[i].length;j++){
    		a[i][j]=i+j;
    	}
    }
    System.out.println(a[2][3]);
	}
}
