package chap04.ex05;

import java.util.Scanner;

public class Template_DoWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
				
		int a; 
		
		do {
			System.out.println("============================");
			System.out.println("1. 평균 출력 || 2. 합계 출력 || 3. 이름 출력 || 4. 프로그램 종료");
			System.out.println("============================");
			System.out.println("위 내용을 정수로 입력하세요 >>> ");
			
			a = sc.nextInt();
			
			if ( a == 1 ) {			// 루프 돌아감
				System.out.println("1. 평균 출력");
			} else if ( a == 2 ) {
				System.out.println("2. 합계 출력");
			} else if ( a == 3 ) {
				System.out.println("3. 이름 출력");
			} else if ( a == 4) {
				System.out.println("4. 종료");
				break;
			}
			
			
		} while (true);
		
		sc.close(); // 메모리에서 스캐너를 제거해야 함 
	}
}
