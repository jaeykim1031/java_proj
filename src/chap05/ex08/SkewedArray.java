package chap05.ex08;

import java.util.Arrays;

public class SkewedArray {
	public static void main(String[] args) {
		// 비정방형 배열 : 행에 대해서 열의 개수가 다름.
		
		// 1. 선언
		int[][] arr = new int[3][];		// 행만 정의
		
		// 2. 행에 대한 열의 공간 크기 지정
		arr[0] = new int[2]; 
		arr[1] = new int[3]; 
		arr[2] = new int[5]; 
		
		// 3. 출력
		System.out.println(Arrays.toString(arr[0])); 
		System.out.println(Arrays.toString(arr[1])); 
		System.out.println(Arrays.toString(arr[2])); 
		
	}
}
