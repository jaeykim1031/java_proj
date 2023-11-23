package chap04.ex01;

public class If_Statement {
	public static void main(String[] args) {
		/* 제어문 : 프로그램의 순서를 바꿔서 처리 함
		 * 		if / switch
		 * 
		 * if 문 	: break; 가 내장되어있음
		 * switch 문 : break; 가 필요함 
		 * 
		 */
		
		/* 1. 조건이 하나 일 때 <- 삼항으로 교체 가능 
		 * if (조건) {
		 *		조건이 true 일 때 실행문; <- break; 내장
		 * }else {
		 * 		조건이 false 일 때 실행문
		 * }
		 * 
		 */
		/* 2. 조건이 여럿 일 때 
		 * if (조건1) {
		 *		조건1 일 때 실행문;
		 * }else if (조건2) {
		 * 		조건2 일 때 실행문;
		 * }else if (조건3) {
		 *   		.
		 *   		.
		 *   		.
		 * }else {
		 *   	위의 조건이 전부 아닐 때
		 * }
		 * 
		 * 3. 한 줄로 사용
		 * if (조건) 조건이 true 일 때 ; (중괄호 생략 가능)
		 *	
		 */
		
		int a = 10; 
		
		if( a > 30) { 						// 조건에서 true false 판정
			System.out.println("참 입니다. ");
		}else {
			System.out.println("거짓 입니다. ");
		}
		
		System.out.println("프로그램 종료");

		// 조건이 여러개 일 때 : 점수가 90 이상일 때 A 출력, 80점 이상일 때 B, 70점 이상일 때 C
		
		int score = 90;
		
		if ( score >= 90) {
			System.out.println("A 학점.");
		}else if (score >= 80) {
			System.out.println("B 학점.");
		}else if (score >= 70) {
			System.out.println("C 학점.");
		}else if (score >= 60) {
			System.out.println("D 학점.");
		}else {
			System.out.println("F 학점.");
		}	
		
		System.out.println("========== if 조건에서 조건 처리 =============");
		
		 score = 90;
		
//		if ( score >= 60) {
//			System.out.println("D 학점."); // <- true 라서 이 부분에서 탈출
//		}else if (score >= 70) {
//			System.out.println("C 학점.");
//		}else if (score >= 80) {
//			System.out.println("B 학점.");
//		}else if (score >= 90) {
//			System.out.println("A 학점.");
//		}else {
//			System.out.println("F 학점.");
//		}	
//		
		 if ( score >= 60 && score < 70) {			// true && false == false
			System.out.println("D 학점."); 
		}else if (score >= 70 && score < 80) {		// true && false == false
			System.out.println("C 학점.");
		}else if (score >= 80 && score < 90) {		// true && false == false
			System.out.println("B 학점.");
		}else if (score >= 90 && score < 100) {		// true && true == true
			System.out.println("A 학점.");
		}else {
			System.out.println("F 학점.");
		}	
		 
		System.out.println("=======================");
		// 조건이 true 일 때만 실행
		
		if (10 > 5)  System.out.println("참"); // <- 중괄호 생략 가능
		
		
		 
		 
		 
	}
}
