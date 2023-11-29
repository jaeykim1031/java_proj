package chap05.ex07;

import java.util.Arrays;

public class Multidimensional_Arrays2 {
	public static void main(String[] args) {
		// 이차원 배열 선언 방법
		
		// 1. 
		int[][] arr1 = new int[4][3]; // 선언과 동시에 할당
		
		int[][] arr2;
		arr2 = new int[3][4];
		
		// 2.
		int arr3[][] = new int[3][4];
		
		int arr4[][];
		arr4 = new int[3][4];
		
		// 3.
		int[][] arr5  = new int[][] /* <- 바로 여기 */{ {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15} };
									// 방 크기 지정시 오류 발생 주의
		
		System.out.println(arr5[2][2]);
		System.out.println(arr5[1][4]);
		
		int[][] arr6;
		arr6 = new int[][] {{1,2,3,4}, {11,22,33,44},{111,222,333,444} };
		
		System.out.println(arr6[0][2]);
		System.out.println(Arrays.toString(arr6[0]));
		System.out.println(Arrays.toString(arr6[1]));
		System.out.println(Arrays.toString(arr6[2]));
//		System.out.println(Arrays.toString(arr6[3])); : 에러
		
		// 4. 
		int[][] arr7 = {{1,2,3}, {4,5,6}, {7,8,9}}; 		// new int 생략 가능 
						// ! 주의 : 분리 선언 불가능 !
		
		System.out.println(arr7[0][2]);
		
		
		
		
	}

}
