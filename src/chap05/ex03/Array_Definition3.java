package chap05.ex03;

import java.util.Arrays;

public class Array_Definition3 {

	public static void main(String[] args) {
		// 배열의 값 출력하는 방법 
		
		// 1. 배열 변수 선언 : 정수, 인덱스 1000개, 번호 0 ~ 999
			int[] arr = new int[1000];
		
		// 2. 각 방에 6의 배수 저장 
			for (int i = 0, j = 6 ; i < arr.length ; i++ ) {
					arr[i] = j;
					j += 6;
			}
			
		// 향상된 for 문을 사용해 배열의 모든 index 출력 
			
			for ( int k : arr) { // arr 배열 번수의 0번 ~ 마지막 방 까지 출력 
				System.out.println(k);
			}
		
		// Arrays.toStriing(배열 변수): 배열의 모든 값을 출력
			System.out.println(Arrays.toString(arr));

	}

}
