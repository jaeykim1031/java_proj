package lab.chap03;

import java.util.Scanner;

public class ConditionalOperPractice2 {

	public static void main(String[] args) {
		// Scanner 로 "안녕"이라는 문자열을 입력, "안녕" 문자열이 입력 되었을 때 "안녕하세요", 아닐 땐 "안녕 못 합니다"
			// == 대신 .equals("")
			// 삼항 연산자 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인사말을 입력하시오 >>> ");
		
		String hello = sc.next(); // 참조 자료형
		
		String greeting = (hello.equals("안녕")) ? "안녕하세요 " : "안녕 못 합니다 ";
		
		
		System.out.println(greeting);

		
	}
}
