package 周末;

public class Zuo_10 {
	public static void main(String[]args){		 
	     int x=2, y=1, z=3;   
	    if(x > y) {
	      int t = x;
	      x = y;
	      y = t;
	     }
	    if(x > z) {
	      int t = x;
	      x = z;
	      z = t;
	     }
	    if(y > z) {
	      int t = y;
	      y = z;
	      z = t;
	     }
	    System.out.println( "三个数字由小到大排列为： "+x + " " + y + " " + z);
	    System.out.println( "三个数字由大到小排列为： "+z + " " + y + " " + x);

	}

}
