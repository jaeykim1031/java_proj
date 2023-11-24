package chap04.ex03;

public class For_Statement {
	public static void main(String[] args) {
		/*
		 * 제어문 : 프로그램의 조건에 따라 순서를 바꿈. if, switch
		 * 반복문 : 프로그램을 계속 반복해서 실행하도록 하는 구문. for, while, do while
		 * 			- 무한 루프에 빠지지 않게 해야함
		 */
		
		for (int i = 0; i <= 10 ; i++ ) {
			System.out.println("오늘 날씨는 춥습니다" + i); // i가 11이 되는 순간 조건이 false 가 되어 for 탈출 
		}
			// 무한 루프 처리를 하지 않으면 계속 실행 됨.
		int a;
		
//		for(a = 1 ; a > 0 ; a++ ) { // <- 조건이 계속 true라 무한 루프
		for(a = 1 ; a < 100 ; a++ ) { // 정상 작동 
			System.out.println(a);
		}
			// for 문 블록 밖에서 선언, 블록 안에서 재 할당 가능
		for(a = 10 ; a <= 100 ; a += 2 ) {
			System.out.println(a);
		}
		 
		System.out.println("마지막 a의 값은 : " + a );
//		System.out.println("마지막 i의 값은 : " + i ); // 블록 밖에선 오류 발생

//		for ( int i = 0; true ; i++ ) {
//			System.out.println("무한 루프 2 : " + i);
//		}
		
//		for ( int i = 0 ; ; i++ ) { 				// 조건 생략되었을 때 : JVM 에서 자동으로 true 입력함
//			System.out.println("무한 루프 3 : " + i);
//		}
		
		
//		* unreachable code.
//		for ( int i = 0; false ; i++ ) {  
//			System.out.println(i);
//		}
		
		
	}
}
