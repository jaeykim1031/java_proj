package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Array_DefinitionPrac2 {
	public static void main(String[] args) {
		// arr : 배열 변수  String 값을 저장 , 인덱스 개수 6개 
		
		// 0 = 자바, 1 = html, 2 = css, 3 = javasript, 4 = oracl. 5 = spring
		
		// 총 네 가지 방법으로 출력하기 
		
		String[] arr = new String[6]; 
		
		arr[0] = "Java";
		arr[1] = "Html";
		arr[2] = "css";
		arr[3] = "JavaScript";
		arr[4] = "Oracle";
		arr[5] = "Spring";
		
		
		Scanner sc = new Scanner (System.in); 
		
		int a; 
		
		do {
			System.out.println("=====================================================");
			System.out.println("1. 인덱스 직접. || 2. for || 3. enhanced for || 4. Arrays.toString(arr)");
			System.out.println("|| 5. 종료");
			System.out.println("=====================================================");
			System.out.println("위 내용을 정수로 입력하세요 >>> ");
			
			a = sc.nextInt();
			
			if ( a == 1 ) {			// 루프 돌아감
				System.out.println("1. 인덱스 직접.");
				System.out.println("============================");
				
					System.out.println(arr[0]);
					System.out.println(arr[1]);
					System.out.println(arr[2]);
					System.out.println(arr[3]);
					System.out.println(arr[4]);
					System.out.println(arr[5]);
					
			} else if ( a == 2 ) {
				System.out.println("2. for ");
				System.out.println("============================");

				for (int i = 0 ; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				
			} else if ( a == 3 ) {
				System.out.println("3. enhanced for");
				System.out.println("============================");

				for ( String j : arr ) {
					System.out.println(j);
				}
				
			} else if ( a == 4) {
				System.out.println("4. Arrays.toString(arr)");
				System.out.println("============================");

				System.out.println(Arrays.toString(arr));

			} else if ( a == 5) {
				break;
			}
			
			
		} while (true);
		
	

	}
}

