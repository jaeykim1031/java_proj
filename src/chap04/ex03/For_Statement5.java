package chap04.ex03;

public class For_Statement5 {
	public static void main(String[] args) {
		/*
		 * 반복문 내에서 continue;, break; 사용  <- if 조건
		 * 		- continue; : 아래 코드는 사용하지 않고 증감식으로
		 * 		- break;	: 반복문 탈출
		 */
		
		// continue;
		for ( int i = 1 ; i < 10 ; i++) {
			if ( i % 3 == 0 ) {
				continue; // 3의 배수 일 때 true -> 아래 코드 출력 하지 않음, 바로 증감식으로 
			}
		
			System.out.println("i의 값 : " + i);
		}
		
		// break;
		for ( int i = 1 ; i < 10 ; i++) {
			
			System.out.println("i의 값 : " + i);
			
			if (i == 7 ) break;
		}
		
		
		
	}
}
