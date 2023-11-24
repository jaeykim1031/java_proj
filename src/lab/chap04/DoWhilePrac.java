package lab.chap04;

import java.util.Scanner;

public class DoWhilePrac {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in); 
				
		int a; 
		
		do {
			System.out.println("============================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~ 1000까지 3의 배수 || 4. 입력된 10개의 정수 중 짝수의 개수 출력");
			System.out.println("5. 종료");
			System.out.println("============================================================");
			System.out.println("위 내용을 정수로 입력하세요 >>> ");
			
			a = sc.nextInt();
			
			if ( a == 1 ) {									// 루프 돌아감
				System.out.println("1. 구구단 출력");
				// 구구단 

				for (int i = 1 ; i < 10 ; i++) {
					System.out.printf("============ %d 단 출력 ================\n", i);
					for (int j = 1 ; j < 10 ; j++) { 
						System.out.printf( "%d * %d = %d\n", i , j, i * j );
					}
				}
				
			} else if ( a == 2 ) {
				System.out.println("2. 19단 출력");
				// 19단

				for (int i = 1 ; i < 20 ; i++) {
					System.out.printf("============ %d 단 출력 ================\n", i);
					for (int j = 1 ; j < 20 ; j++) { 
						System.out.printf( "%d * %d = %d\n", i , j, i * j );
					}
				}
				
			} else if ( a == 3 ) {
				System.out.println("3. 1 ~ 1000까지 3의 배수");
				//for, while, do - while 문 
				System.out.println ( "========= for 사용 =========" );
				
				for( int i = 1; i <= 1000 ; i++) {
					if ( i % 3 == 0) {
					System.out.println ("for : " + i );
				}
			}
				
				System.out.println ( "========= while 사용 =========" );
				int i = 1;
				
				while ( i <= 1000 ) {
					if( i % 3 == 0) {
						System.out.println ( "while : " + i );
					}
					i++;
				}
				
				System.out.println ( "========= do - while 사용 =========" );
				
//				boolean c = true;           
//				int d = 1;                  
//				                            
//				do {                        
//					if (d % 3 == 0) {System.out.println( "3의 배수(do-while) : " + d);}
//					if (d == 1000) c =false;
//					d++;
//				} while ( c );
				
				int j = 1;
				
				do {
					if ( j % 3 == 0 ) {
					System.out.println( "do - while : " + j );
					}
					j++;
				} while( j <= 1000);
				
			} else if ( a == 4) {
				System.out.println("4. 입력된 10개의 정수 중 짝수의 개수 출력");
				
				int index = 1;
				int even = 0;
				
				while ( index <= 10) {
					System.out.printf("%d 번째 정수를 입력하세요.", index);
					int input = sc.nextInt();
					
						if (input < 0) {System.out.println("양의 정수를 입력하세요."); continue;}
						
						if (input % 2 == 0) {
						even++;
					}
					index++;
				}
				System.out.printf("정수의 개수는 %d개 입니다.\n", even);

				
			} else if ( a == 5) {
				System.out.println("5. 종료");
				break;
			}
			
		} while (true);
		
		sc.close(); // 메모리에서 스캐너를 제거해야 함 
	}
}
