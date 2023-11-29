package lab.chap05;

import java.util.Arrays;

public class Multidimensional_ArraysPrac2 {
	public static void main(String[] args) {
		/*
		 * arr[5][10] ( 5행 10열 )
		 * 
		 * ! for, 이중 for, 연산자에 대한 이해 필요 !
		 * 
		 * [0] : 짝수 만 
		 * [1] : 3의 배수를 제외 한 홀수
		 * [2] : 4, 5의 배수 
		 * [3] : 10의 배수 
		 * [4] : 구구단 8단의 값
		 * 
		 * for, enhanced for, Arrays.toString()으로 출력
		 * 
		 */
		
		// 1. 배열 선언 
		
		int [][] arr = new int[5][10];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		// 2. 값 입력 ( 이중 for 활용 -> 외부 for : 행
									// 내부 for : 열 )
		
		for ( int i = 0 ; i < arr.length ; i++ ) {			// i : 행의 번호
			
			int a = 1;
			
			if		 ( i == 0) {
				for ( int j = 0 ; j < arr[i].length ; j++ ) {
					
					arr[i][j] = a * 2;
					a++;
				}
				
			/*
			 * if		 ( i == 0){
			 * 		int a = 1;
			 * 		for (int j = 0 ; j < arr[i].lenght ; a++){
			 * 			if ( a % 2 ==0 ){
			 * 				arr[i][j] = a;
			 * 				j++;
			 * 			}
			 * 		} 
			 * 	
			 */
				
			}else if ( i == 1) {
				// a의 초기값은 1
				for ( int j = 0 ; j < arr[i].length ; a++ ) {
					
					arr[i][j] = a;
					
					if ( a % 2 == 1 && a % 3 != 0)
						j++;
				}
				
			}else if ( i == 2) {
				for ( int j = 0 ; j < arr[i].length ; a++ ) {
					
					arr[i][j] = a; 			
					
					if ( a % 4 == 0 || a % 5 == 0) {
						arr[i][j] = a;
						j++; 			// 공간에 값이 할당 되어야 인덱스 증가 
					}
				}
			}else if ( i == 3) {
				for ( int j = 0 ; j < arr[i].length ; j++ ) {
					
					arr[i][j] = a * 10;
					a++;
				}
				
			}else if ( i == 4) {
				for ( int j = 0 ; j < arr[i].length ; j++ ) {
					
					arr[i][j] = a * 8;
					a++;
				}
			}
		}
	
		
		System.out.println( "================== 출력 ===================" );
		
		for ( int i = 0 ; i < arr.length ; i++) {
			for ( int j = 0 ; j < arr[i].length ; j++ ){
				//System.out.print( "arr[" + i +"][" + j + "] = " + arr[i][j] + "\t" );
				System.out.print(arr[i][j]);
				System.out.print("\t");
				
			}
			System.out.println();
		}
		
		for ( int[] a : arr ) {			// arr 안에 있는 값을 빼내기
			for (int b : a ) { 
				System.out.print(b);
				System.out.print("\t");
			}
			System.out.println();  
		}
		
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
