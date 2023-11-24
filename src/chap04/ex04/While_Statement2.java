package chap04.ex04;

public class While_Statement2 {
	public static void main(String[] args) {
		// 반복문에서 무한 루프
		
		int a = 1;
		
		while (a > 0 ) {			// <- 무한 루프
			System.out.println("무한 루프 작동 중 : " + a );
			
			if ( a == 10) break;
			
			a++;
		}
		
		boolean b = true;
		
		while ( b ) {			//<- 무한 루프
			
			System.out.println(a);
			 
			
			if (a == 10000) { b = false; }
			a++;
		}
	}
}
