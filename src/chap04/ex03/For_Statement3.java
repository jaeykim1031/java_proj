package chap04.ex03;

public class For_Statement3 {

	public static void main(String[] args) {
		// 무한 루프에서 break;를 통해 탈출
		// 		- 반복문(for, while, do while) 안에서 특정 시점에 break; 
		
		// for 문 
		
		for (int i = 0 ; i >= 0 ; i += 10) { // -> 무한 루프문 
			System.out.println( i );
			
			if ( i == 100 ) {
				break;
			}
		}
		
		for (int i = 0 ; i >= 0 ; i += 10) { // -> 무한 루프문 
			System.out.println( i );

				break;
				
//			System.out.println( i ); <- unreachable code 
			}
		
		
		for (int i = 0 ; i >= 0 ; i += 10) { // -> 무한 루프문 
			System.out.println( i );
			
			if ( i == 10000 ) {
				break;
			}
			System.out.println("Check");
		}
		
		
		
	}

}
