package chap05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
		/*
		 * 변수, 상수, 배열(array)을 정의 할 때 '자료형'이 정의되어야 함
		 * 			- 기본 자료형 : stack에 변수명, 값 저장. -> stack의 값을 비교
		 * 					* stack은 초기 값이 할당되지 않더라도 사용 가능 (초기값 없이 사용하면 오류)
		 * 
		 * 			- 참조 자료형 : stack에 변수, 참조 주소. heap에 값이 저장 (변수명).equals()로 비교 
		 * 						 String : 참조 자료형, 문자열. <- 객체
		 *					* heap에는 반드시 초기 값 할당되어야 함	
		 *							boolean : false	 
		 * 							정수		: 0
		 * 							실수		: 0.0
		 * 
		 * 배열(array) : 하나의 배열 변수에 여러 값을 넣을 수 있음 
		 * 			- 방 번호 (index) : 0번 부터 시작
		 * 			- 배열 선언시 방 번호가 선언 되어야 함 
		 * 			- 배열 방의 개수 확인 : (배열 변수명).length() 
		 * 
		 */
		
		// 변수
		
		int a = 10; // 선언시 값 할당
		int b; // 선언만
		
		System.out.println(a);
//		System.out.println(b); <- 오류, 초기 값이 할당 되지 않으면 오류 
		
		int c;
		c = 20;
		c = 30;
		c = 40;
		
		System.out.println(c);

		// 배열
		
		int[] arr = new int[5]; // 0부터 시작해서 4번까지 5개
		
			// 자료형[] 배열변수 = new 자료형[방 개수]
			//					new : 배열의 값을 heap에 저장
		
		// 배열의 각 방의 값을 출력 			
		System.out.println("arr 배열의 0번째 방의 값 출력 : " + arr[0]); // 기본적으로 0이 채워져있음 
		System.out.println("arr 배열의 1번째 방의 값 출력 : " + arr[1]); 
		System.out.println("arr 배열의 2번째 방의 값 출력 : " + arr[2]); 
		System.out.println("arr 배열의 3번째 방의 값 출력 : " + arr[3]); 
		System.out.println("arr 배열의 4번째 방의 값 출력 : " + arr[4]); 
		
		// 배열의 각 방에 값을 입력 
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60; <- 실행 시 오류 발생 : runtime 오류. ArrayIndexOutOfBoundsException (배열의 인덱스 문제)
		
		System.out.println("arr 배열의 0번째 방의 값 출력 : " + arr[0]); 
		System.out.println("arr 배열의 1번째 방의 값 출력 : " + arr[1]); 
		System.out.println("arr 배열의 2번째 방의 값 출력 : " + arr[2]); 
		System.out.println("arr 배열의 3번째 방의 값 출력 : " + arr[3]); 
		System.out.println("arr 배열의 4번째 방의 값 출력 : " + arr[4]); 
		

	}

}
