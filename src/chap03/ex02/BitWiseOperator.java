package chap03.ex02;

import java.util.Scanner;

public class BitWiseOperator {

	public static void main(String[] args) {
		// 비트 연산자 
		
		// 1. 다양한 진법 표현 : 10진수, 8진수, 16진수, 2진수 (계산기 사용)
		
		int data = 13; 
		
		System.out.println(Integer.toBinaryString(data)); 	// 정수를 2진수로 출력 1101
		System.out.println(Integer.toHexString(data)); 		// 16진수로 출력 d 
		System.out.println(Integer.toOctalString(data));	// 8진수 15
		
		
		////========================================================================================================////
		// 자주 사용함																									  //
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5") ); // 문자열로 된 정수를 정수로 변환. """정수만 입력 되어야함"""
		
		System.out.println(Double.parseDouble("13.5")+ Double.parseDouble("134.4325")); // 문자열로 된 실수를 실수로 변환, 실수 타입으로 저장 
		// 중요함																										  //
		////========================================================================================================////
		
		// 스캐너에서 숫자가 문자열로 들어왔을 때 정수로 변환, 실수로 변환 후 연산
		Scanner sc = new Scanner(System.in);
		
		String kor;
		String eng;
		
		System.out.println("국어 점수(정수) , 영어 점수(정수) 를 차례대로 입력해주세요 >>> ");
		
		kor = sc.next();
		eng = sc.next();

		
//		int sum = kor + avg; <- string이라 오류 발생 
		int sum = Integer.parseInt(kor) + Integer.parseInt(eng);
		double avg = sum / 2;
		
		System.out.println("국어 점수 + 영어 점수 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
