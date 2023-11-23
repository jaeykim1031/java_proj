package chap03.ex04;

public class RelationalOperators {

	public static void main(String[] args) {
		/* 비교 연산자 : 결과를 true, false 로 리턴
		 * 		- 크기 비교 연산자 : > < <= =>
		 * 		- 등가 비교 연산자 : == (같으면 true), != (다르면 true) 
		 */
		
		System.out.println( 5 > 2 );
		System.out.println( 5 < 2 );
		System.out.println( 5 >= 2 );
		System.out.println( 5 <= 2 );
		System.out.println( 5 == 2 );
		System.out.println( 5 != 2 );
		
		char a = 'a'; 
		char b = 'b';
		
		System.out.println( a == b );
		System.out.println( a != b );
		
		
		System.out.println( "[============================================]" );
		
		// 2. 참조 자료형일 때 등가 비교 연산자
			// 객체의 변수명(str1) : stack에 저장되어있음 , str1 = 값이 저장된 heap의 주소를 보유
			// 객체의 값은 : heap 메모리 영역에 저장 
			
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1 == str2); // '==' 은 stack에 저장된 변수 값을 비교
		
		// 참조 자료형에서 heap 영역의 값을 비교하려면 : .equals() 
		
		System.out.println(str1.equals(str2));
		
		System.out.println( "[============================================]" );
		
		
	}

}
