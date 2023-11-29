 package chap05.ex05;

public class Array_Definition5 {
	public static void main(String[] args) {
		/*
		 * 기본 데이터 타입 (8가지) vs 참조 데이터 타입[] 참조 변수명
		 */
		
		// 1. 기본 데이터 타입에서 대입 연산 : stack의 값을 복사
		
		int val1 = 3;
		int val2 = val1; // stack에 저장된 값을 대입 
		
		System.out.println(val1); 	// 3
		System.out.println(val2); 	// 3
		
		val2 = 7;
		
		System.out.println(val2); 	// 7

		// 2. 참조 데이터 타입에서 대입 연산 : stack의 heap의 주소를 복사 
		System.out.println("=========================");
		
		int[] arr1 = new int[] {3, 4, 5};
		int[] arr2 = arr1;					// arr2에는 arr1의 참조 주소( stack에 저장된 )가 복사 됨
		
		System.out.println(arr1);
		System.out.println(arr2);	// 두 개 모두 heap의 주소 
		
		arr1[0] = 7;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);	// 동일 
		
	}
}
