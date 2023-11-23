package chap03.ex06;

public class ConditionalOper {

	public static void main(String[] args) {
		// 삼항 연산자 : if ~ else 의 축약

		// ( 참/거짓 ) ? 참일 때 실행 : 거짓일 때 실행 ;
		
		int val1 = (3 > 5) ? 6 : 9 ;
		
		System.out.println(val1);
		
		// if 문으로 표현 
		int val2 = 4;
		
		if (true) {
			val2 = 6; // 조건이 true 일때
		}else {
			val2 = 9; // 조건이 false 일때
		}
		
		
	}

}
