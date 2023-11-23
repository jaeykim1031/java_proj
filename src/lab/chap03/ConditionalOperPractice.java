package lab.chap03;

import java.util.Scanner;

public class ConditionalOperPractice {

	public static void main(String[] args) {
		// 실습
		/* 0. 스캐너 장착, 정수 입력, %로 나머지 측정, || 연산자 사용, 삼항 연산자 사용 
		 * 
		 * 1. 스캐너로 정수 값을 인풋 받아서 -> 출력 내용 : 인풋 받은 값은 **이고 짝수/홀수 입니다 
		 * 
		 * 2. 스캐너로 값을 인풋 받아서 -> 출력 내용 : 인풋 받은 값은 **이고 3, 6, 9의 배수 입니다
		 */
		
		// 1번
		Scanner sc = new Scanner(System.in);
		
		int i;
		System.out.println("숫자를 입력하시오 >>> ");
		i = sc.nextInt();
		
		String str = ( i % 2 == 0) ? " 짝수입니다" : " 홀수입니다" ;
				
		System.out.println("입력 받은 값은 " + i + " 이며" + str);
		
		String str369 = ( i % 3 == 0 || i % 6 == 0 || i % 9 == 0) ? " 3, 6, 9의 배수 입니다 ": " 3, 6, 9의 배수가 아닙니다" ;
		System.out.println("입력 받은 값은 " + i + " 이며" + str369);
		
		
		
	}

}
