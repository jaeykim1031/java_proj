package chap04.ex03;

public class For_Statement4 {
	public static void main(String[] args) {
		
		
		// 이중 for 문
				for ( int i = 0; i < 10 ; i++ ) {
						System.out.println("외부 for 문의 i 값 : " + i);
					for ( int j = 0 ; j < 10 ; j++ ) {
						System.out.printf("변수 i : %d\n변수 j : %d\n\n", i ,j); // 내부 for 가 먼저 증가함 
					}
				}
				
				for (int i = 1 ; i < 10 ; i++) {
					System.out.printf("============ %d 단 출력 ================\n", i);
					for (int j = 1 ; j < 10 ; j++) { 
						System.out.printf( "%d * %d = %d\n", i , j, i * j );
					}
				}
				
				for (int i = 1 ; i < 10 ; i++) {
					
					for (int j = 1 ; j < 10 ; j++) { 
						System.out.printf( "%d * %d = %d\t", i , j, i * j );
					}
					System.out.println();
				}
	}
}
