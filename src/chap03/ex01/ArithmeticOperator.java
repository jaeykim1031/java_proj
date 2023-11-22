package chap03.ex01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자 : + , - , * , / , % (나머지만)
		 * 증감 연산자 : ++ (1씩 증가) , -- (1씩 감소)
		 */
		
		// 1. 산술 연산자
		
		int a = 5;
		int b = 10; 
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b); // 나머지만 출력 <- 중요함 
	
		// 캐스팅
		System.out.println( 2 + (double) 3 ); // 5.0
		
		// 
		System.out.println( 8 % 5 ); // 나머지만 출력. '나머지가 0 이면 피제수는 제수의 배수' 
		
		System.out.println( 8 / 5 ); // 몫만 출력, int
		System.out.println( (int) (8 / 5.0) ); // 몫만 출력
		System.out.println( 8 % 5 );
		System.out.println( 8 / 5.0 ); // 몫만 출력, double
		System.out.println("=================");
		
		// 2. 증감 연산자 : ++, --
		
		int val1 = 3;
		System.out.println(++val1); 	// 4 <- 값을 증가 시키고 출력 
		System.out.println(val1); 		// 4
		
		System.out.println(--val1); 	// 3 <- 값을 감소 시키고 출력 
		System.out.println(val1); 		// 3
		
		int val2 = 3;
		System.out.println(val2++); 	// 3 <- 출력 후 증가 
		System.out.println(val2); 		// 4
		
		System.out.println(val2--); 	// 4 <- 출력 후 감소 
		System.out.println(val2); 		// 3
		
		
		System.out.println("=================");
		int val7 = 3;
		int val8 = 4;
		int val9 = 2 + val7-- + ++val8 ; // == 2 + 3( 출력 전이라 값 그대로 ) + 5
		
		System.out.println("val9 : " + val9);
		System.out.println("val7 : " + val7); // 처리 후라서 감소됨 == 2
		System.out.println("val8 : " + val8);

		System.out.println("=================");
		int val10 = 30;
		int val11 = 40;
		int val12 = 50;
		
		int val13 = 7 + --val10 + ++val11 + val12--; // 7 + 29 + 41 + 50
		
		System.out.println("val13 : " + val13);
		
		System.out.println( val10 ); // 29	
		System.out.println( val11 ); // 41		
		System.out.println( val12 ); // 49 // 처리 후라서 감소됨
		// 증감 연산자의 위치에 따라 출력 값 달라짐 


		
	}

}
