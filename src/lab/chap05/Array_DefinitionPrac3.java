package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Array_DefinitionPrac3 {
	public static void main(String[] args) {
		/*
		 * 1. 스캐너로 인풋 값을 받아서 배열의 인덱스 크기 지정. 7의 배수와 8의 배수 저장 후 출력 
		 * 2. 스캐너로 인풋 값을 받아서 배열의 인덱스 크기 지정. 1씩 증가하며, 4의 배수 제외하고 출력
		 * 3. 스캐너로 인풋 값을 받아서 배열의 인덱스 크기 지정. 3의 배수 저장, 6의 배수 제외.
		 * 
		 * 		배열, 제어문(for, do-while), 연산자( ||, !=, ==)  
		 * 
		 */
		
		Scanner sc = new Scanner (System.in); 
		
		// 내부 블록에서 사용할 변수 선언
		// 배열 변수, 스캐너로 선택하는 변수, 배열의 방 크기를 스캐너로 받는 변수 
		
		int input; 		// 선택지 고르는 값 
		int idx; 		// 인덱스의 크기 
		int [] arr;

		do {
			System.out.println("=====================================================");
			System.out.println("1. 7의 배수와 8의 배수를 저장 후 출력. || 2. 1씩 증가하며, 4의 배수 제외해서 저장 후 출력. || 3. 3의 배수 저장, 6의 배수 제외해서 저장 후 출력. || 4. 프로그램 종료. ");
			System.out.println("====================================================="); 
			System.out.println("선택하세요 >>> ");
			input = sc.nextInt();
			
			if ( input == 1 ) {			
				System.out.println("1. 7의 배수와 8의 배수.");
				System.out.println("============================");
				
				System.out.println("배열의 크기를 정해주세요(정수) >>> ");
				idx = sc.nextInt();
				arr = new int [idx]; 					// 배열 인덱스의 크기를 스캐너로 인풋 받음
				
				System.out.println("입력된 배열의 크기는 : " + arr.length);
				
				int a = 1;			 					// 인덱스 내부 값
				
														// 각 인덱스에 7의 배수, 8의 배수 "입력" 
				
				for (int i = 0 ; ; a++) {				// 조건 공백 처리 == true (무한 루프)
					if (i == idx) {break;}
					if ( a % 7 ==0 || a % 8 == 0 ) {	// a가 7 / 8의 배수일 때
						arr[i] = a;						// arr[i]에 7 / 8의 배수 할당
						i++;							// 7 / 8의 배수값이 등록 되었을때 인덱스 번호 증가 
					}
				}
				
														// 배열의 내용 "출력" 
				
				for (int i = 0 ; i < arr.length ; i++) {
					System.out.println("인덱스 번호 : " + i + " 값 : " + arr[i]);
				}
				
			} else if ( input == 2 ) {
				System.out.println("2. 1씩 증가하며, 4의 배수 제외해서 저장 후 출력.");
				System.out.println("============================");
				
				System.out.println("배열의 크기를 정해주세요(정수) >>> ");
				idx = sc.nextInt();
				arr = new int [idx]; 
				
				// 1, 2, 3, 5, 6, 7, 9, 10, 11....
				
				System.out.println("입력된 배열의 크기는 : " + arr.length);
				
				int a = 1 ;
				for ( int i = 0 ; i < arr.length ; a++ ) {	// i : 방 인덱스, a : 값	
					
					if ( a % 4 == 0 ) { continue; }			// 4의 배수일 때는 아래의 코드 실행되지 않음 
					
					arr[i] = a;
					i++;									// 4의 배수가 아닐 때만 인덱스 증가, 값 할당 
				}
				for (int i = 0 ; i < arr.length ; i++) {
					System.out.println("인덱스 번호 : " + i + " 값 : " + arr[i]);
				}

			} else if ( input == 3 ) {
				System.out.println("3. 3의 배수 저장, 6의 배수 제외.");
				System.out.println("============================");
				
				System.out.println("배열의 크기를 정해주세요(정수) >>> ");
				idx = sc.nextInt(); 
				arr = new int [idx]; 
					
				System.out.println("입력된 배열의 크기는 : " + arr.length);

				int a = 1;
				
				for ( int i = 0 ; i < arr.length ; a++ ) {		// 방 인덱스는 값이 할당 되었을 때만 증가되어야 한다 
					
					if ( a % 3 == 0 ) {							// 3의 배수, 6의 배수 동시에 포함
						if ( a % 6 != 0) { 						// 3의 배수만 포함
							arr[i] = a;
							i++;
							}
						}
					}
				
				for (int i = 0 ; i < arr.length ; i++) {
					System.out.println("인덱스 번호 : " + i + " 값 : " + arr[i]);
				}
				
			} else if ( input == 4) {
				System.out.println("4. 프로그램 종료.");
				System.out.println("============================");
				break;
			}
			
			
			} while (true);
	
			System.out.println("unreachable code");
			sc.close();
		}
	}
