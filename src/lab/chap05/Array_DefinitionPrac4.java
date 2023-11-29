package lab.chap05;

import java.util.Arrays;

public class Array_DefinitionPrac4 {
	public static void main(String[] args) {
		/*
		 * 변수 : 값 하나만 저장. stack에 변수명, 값 저장 (기본 자료형)
		 * 배열 : 여러 개의 값을 저장. stack에 변수명, 참조 자료. heap에 값 저장 (참조 자료형)
		 * 												.equals() 로 heap에 있는 값 비교 
		 * 												heap 공간에는 초기 값이 반드시 필요함.
		 */
		
		int[] b = new int[10];
		
		System.out.println(b[0]); // -> 정수는 0, 실수는 0.0, boolean은 false, 문자열은 null이 기본 값
		
		b[0] = 3;
		b[1] = 6;
		b[9]= 10;
		
		for (int i = 0 ; i < 10 ; i++ ) {
			System.out.println(b[i]);
		}
		
		//			결과는 같음.
		
		for (int i = 0 ; i < b.length ; i++ ) {
			System.out.println(b[i]);
		}
		
		// enhanced for : 인덱스 0부터 마지막까지 모두 출력
		System.out.println("===== enhanced for =====");
		
		for (int k : b ) {
			System.out.println(k);
		}
		
		// Arrays.toString (배열 변수)
		System.out.println("===== Arrays.toString =====");
		
		System.out.println(Arrays.toString(b));
		
		
	}
}
