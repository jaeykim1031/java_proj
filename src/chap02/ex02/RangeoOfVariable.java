package chap02.ex02;

public class RangeoOfVariable {
	public static void main(String[] args) {
		// main 메소드 : 
			// 메소드 : 객체지향언어에서 '함수'를 메소드라고 부름. 
		// 변수의 사용 범위 : 전역 / 지역 변수
		
		// 전역 변수 : 선언된 곳에서만 유효, 함수 밖에 선언하여 클래스 전체에서 사용이 가능, 전역 변수의 생명주기는 클래스 끝
		
		int a = 10;
		
		{
			// if, switch, for, while, do ~ while <- 제어문, 반복문
			// 지역변수 : 그 블록 안에서만 사용 됨.
			int b = 20;
			System.out.println("a 변수의 값을 출력 (내부 블록): " + a);
			System.out.println("b 변수의 값을 출력 (내부 블록): " + b);
			
			{
				int c = 30;
				System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
				
				System.out.println("a 변수의 값을 출력 (내부의　내부 블록): " + a);
				System.out.println("b 변수의 값을 출력 (내부의　내부 블록): " + b);
				System.out.println("c 변수의 값을 출력 (내부의　내부 블록): " + c);
				
				System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
			}
			
		}
		System.out.println("a 변수의 값을 출력 (외부 블록): " + a);
//		System.out.println("b 변수의 값을 출력 (외부 블록): " + b); <- 에러 
//		System.out.println("c　변수의 값을 출력 (외부 블록): " + c) <- 에러
	}
}
