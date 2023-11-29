package chap05.ex06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multidimensional_Arrays {
	public static void main(String[] args) {
		/*
		 * 다차원 배열 : 2차원 정방형 배열
		 * 
		 */
		
		// 1. 2차원 배열 선언
				//[n][m] : n행(세로), m열(가로)
		int [][] arr1 = new int[3][4];			// heap에 값을 저장할 방을 만들기
		
		// 2. 각 index에 값 넣음
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[0][3] = 4; 
		
		arr1[1][0] = 10;
		arr1[1][1] = 20;
		arr1[1][2] = 30;
		arr1[1][3] = 40; 
		
		arr1[2][0] = 100;
		arr1[2][1] = 200;
		arr1[2][2] = 300;
		arr1[2][3] = 400; 
		
//		arr1[2][4] = 500;	// <- 실행 단계의 오류 발생
							// 컴파일 단계의 오류 : 이클립스에서 확인
							// 배열의 방 번호를 넘길 때 오류 발생 (ArrayIndexOutOfBoundsException)
		
		
		// 방 번호 직접 출력
		System.out.println(arr1[0][0]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[2][3]);
		
		// for 출력
			// arr1.length : 일차원 배열일 때 열의 개수 출력, 이차원 배열일 때 행의 개수 출력
		
		System.out.println(arr1.length);		// 행의 개수 출력
		System.out.println(arr1[0].length);		// 열의 개수 출력
		
		// 이중 for를 통해 출력
		for ( int i = 0 ; i < arr1.length ; i++) {				// 행을 반복 ( i : 행의 방 번호)
			
			for (int j = 0 ; j < arr1[i].length ; j++) {		// 열을 반복 ( j : 열의 방 번호)
				
				System.out.printf("arr1[%d][%d] = %d \n", i, j, arr1[i][j]);
				System.out.print("\t");
			}
		}
		
		// enhan for 출력 ( 이중 for )
		System.out.println("======= Enhanced for =======");
		
		for (int[] a : arr1) { 				// 행을 반복해서 추출
			for (int b : a) {				// a 배열의 모든 값을 b에 담음.
				System.out.print(b);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		// Arrays.toString
		System.out.println("======= Arrays.toString =======");
		
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		
		System.out.println("======= for를 활용한 Arrays.toString =======");
		
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		
		
	}
}
