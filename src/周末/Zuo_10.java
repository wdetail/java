package ��ĩ;

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
	    System.out.println( "����������С��������Ϊ�� "+x + " " + y + " " + z);
	    System.out.println( "���������ɴ�С����Ϊ�� "+z + " " + y + " " + x);

	}

}
