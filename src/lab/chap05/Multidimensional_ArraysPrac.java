package lab.chap05;

import java.util.Arrays;

public class Multidimensional_ArraysPrac {
	public static void main(String[] args) {
		/*
		 * 
		 *  			< 이중 for로 값을 저장 >
		 * arr[3][10] : 0행에는 1부터 시작하여 1 증가
		 *				1행에는 3의 배수 저장 
		 *				2행에는 7의 배수, 8의 배수 저장
		 * 				
		 * 
		 * 이중 for 문으로 출력 
		 * enhanced for 출력
		 * Arrays.toString 출력
		 * 
		 */
		
		int[][] arr = new int[3][10];
		
//		System.out.println(arr.length);			// 행의 개수
//		System.out.println(arr[0].length);		// 0번 열의 개수
//		System.out.println(arr[1].length);		// 1번
//		System.out.println(arr[2].length);		// 2번
		
		
		for ( int i = 0 ; i < arr.length ; i++ ) {		// 행 반복 (일차원 배열)
			
				if (i == 0) { // 1부터 시작하여 1 증가
					int a = 1;
					for ( int j = 0 ; j < arr[i].length ; j++ ) {	// 열 반복
						
							arr[i][j] = a;		// i가 0 일때
							a++;
					}
					
				}else if ( i == 1 ) { // 3의 배수
					int a = 1;
					for ( int j = 0 ; j < arr[i].length ; j++ ) {	
						
							arr[i][j] = a*3;	// i가 1 일때		 
							a++;
					}
					
				}else if ( i == 2 ) { // 7, 8의 배수 
					int a = 1;
					for ( int j = 0 ; j < arr[i].length ; a++ /* <- 중요 */ ) {
						
						arr[i][j] = a; 			// i가 2 일때
						
							if ( a % 7 == 0 || a % 8 == 0) {
								arr[i][j] = a;
								j++; 			// 인덱스가 찼을때 다음 인덱스로 
								
							}
					}
			}
			
		}
		
	System.out.println("==============================");
	
	for ( int i = 0 ; i < arr.length ; i++ ) {
		System.out.println(Arrays.toString(arr[i]));
	}
		
		
		
				
	}
}
