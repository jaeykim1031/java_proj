package chap03.ex03;

public class LogicalOper {

	public static void main(String[] args) {
		// 논리 연산자 : 결과 값으로 true/false 를 리턴  * 중요함 * 
		
			/* && (AND) : true && true -> true 	
			 * 			  true && false -> false
			 * 			  false && true -> false
			 * 			  false && false -> false
			 * 
			 * 			양쪽 모두 true일 때만 true 
			 * 
			 * || (OR) : true || true -> true 	
			 * 			 true || false -> true
			 * 			 false || true -> true
			 * 			 false || false -> false
			 * 
			 * 			하나라도 true면 true
			 * 
			 * ^ (XOR) : true ^ true -> false 	
			 * 			 true ^ false -> true
			 * 			 false ^ true -> true
			 * 			 false ^ false -> false
			 * 
			 * 			앞뒤가 같을 때 false, 다를 때 true
			 * 
			 * ! (NOT) : true 일 때 false, false 일 때 true			 
			 * 
			 */
		
		System.out.println( true && true );
		System.out.println( true && false );
		System.out.println( false && true );
		System.out.println( false && false );
		System.out.println( "================================" );
		
		System.out.println( true || true );
		System.out.println( true || false );
		System.out.println( false || true );
		System.out.println( false || false );
		System.out.println( "================================" );

		
		System.out.println( true ^ true );
		System.out.println( true ^ false );
		System.out.println( false ^ true );
		System.out.println( false ^ false );
		System.out.println( "================================" );
		
		System.out.println( !true );
		System.out.println( !false );
		System.out.println( "================================" );
		
		// 논리 연산자는 쇼트 서킷이 발생 할 수 있다. 이를 방지하기 위해서 비트 연산자를 사용할 수 있다
//				앞의 연산자로만 결과 갚을 유추할 수있는 경우 뒷 부분을 작동시키지 않음 
//					AND 연산에서 앞에  false가 올 경우 쇼트 서킷
//					OR 연산에서 앞에  false가 올 경우 쇼트 서킷

	}

}
