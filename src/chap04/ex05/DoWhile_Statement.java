package chap04.ex05;

public class DoWhile_Statement {
	public static void main(String[] args) {
		/*
		 * while : 조건이 true 일 때 실행문이 실행.
		 * do-while : 조건에 상관 없이 do 실행문 1번은 실행 됨.
		 * 
		 * 초기값;
		 * do {
		 * 		실행문;
		 * 		증감식;
		 * }while (조건문);
		 * 
		 */
		
		// while 
		
		int a = 0;
		while (a < 0) {
			System.out.println("a : " + a ); // <- 작동하지 않음. (a의 값)
		}
		
		// do - while 
		
		int b = 0;
		do {
			System.out.println("b : " + b );
		}while (b < 0);						// 조건문
		
		// 반복 처리
		
		int c = 0;
		do {
			System.out.println("c : " + c);
			c++;
		} while ( c < 100 ); 
		
		// 반복 횟수가 10번일 경우 두 반복문 비교
		
		System.out.println("========= while ==========");
		
		a = 0;
		while (a < 10 ) {
			System.out.println("a : " + a);
			a++;
		}
		
		System.out.println("========= do - while ==========");
		
		a = 0;
		do {
			System.out.println("a : " + a);
			a++;
		} while ( a < 10 );
		
		
	}
}
