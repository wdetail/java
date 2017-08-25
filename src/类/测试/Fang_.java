package ¿‡.≤‚ ‘;

import ¿‡.Fang;

public class Fang_ {
	
	public static void main(String[]args){
		
		int[] array = {1,2,4,5};
		int[] array1 = {5,6,8,9};
		
//		int[] result = Fang.addElement(array, 6);
		
//		int[] result = Fang.removeElementFromIndex(array, 2);
		
//		int[] result = Fang.subArray(array, 1, 3);
		
//		int[] result = Fang.removeElementByIndex(array, 2);
		
//		int[] result = Fang.sort(array);
		
		int[] result = Fang.addAll(array, array1);
		
		for(int y : array){
			System.out.print(y+"\t");
		}
		System.out.println();
		
		for(int x : result){
		    System.out.print(x+"\t");
		}
		
		
		
		
	}
}
