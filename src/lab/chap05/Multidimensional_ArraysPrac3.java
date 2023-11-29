package lab.chap05;

import java.util.Arrays;

public class Multidimensional_ArraysPrac3 {
	public static void main(String[] args) {
		int[][][] arr = new int [12][5][7];
		
	
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}
