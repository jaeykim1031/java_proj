 package lab.chap04;

public class For_StatementPrac2 {

	public static void main(String[] args) {
		// 이중 for 를 활용해 1 ~ 19단 까지, 옆으로 출력(printf)
		// 6, 7, 12단 제외 (continue;)
		
		for (int i = 1 ; i < 20 ; i++) {
			
			if ( i == 6 || i == 7 || i == 12)
				continue;
			
			for (int j = 1 ; j < 20 ; j++) { 
				
				System.out.printf( "%d * %d = %d\t", i , j, i * j );
			}
			System.out.println();
		}
	}

}
