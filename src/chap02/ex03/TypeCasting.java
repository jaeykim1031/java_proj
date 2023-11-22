package chap02.ex03;

public class TypeCasting {

	public static void main(String[] args) {
		/* Type Casting : 자료형의 형식을 변환
		 * 
		 * 기본 자료형 8종 : Stack에 변수명, 값 저장함
		 * byte < short, char < int < long < float < double
		 * 
		 * 참조 자료형 : 무한히 생성 가능(객체) : Stack에 변수명(값이 위치한 참조 주소), Heap에 값
		 * 			객체 / 배열 / 인터페이스  
		 * 
		 * 
		 * - 자동 캐스팅 : 업캐스팅 (낮은 자료형에서 높은 자료형으로)
		 * - 수동 캐스팅 : 다운캐스팅 (높은 자료형에서 낮은 자료형으로)
		 * 				반드시 명시해야 함
		 * 
		 * 
		 * 연산할 때 Type이 정확해야 함 
		 * 
		 * 
		 */
		
//		1. 자동 캐스팅 (업캐스팅) 
		int a = 10;
		double b = 20.55;
		
		System.out.println( a + b ); // int가 자동으로 double
		
//		2. 수동 캐스팅 (다운캐스팅)
		System.out.println( (int)(a + b) ); // 소수점 삭제 됨
		
//		변수의 값을 할당할 때
		double c = 100; // 정수가 '자동'으로 업캐스팅되어서 double 변수에 할당
		int d = (int) 200.5 ;  // 실수를 다운캐스팅 하여 정수에 할당
		
		System.out.println(c);
		System.out.println(d);
		
	}

}
