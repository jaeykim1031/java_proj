package chap01;
// 패키지 : 클래스를 관리하는 폴더

public class ConsoleOutPut1 { // 클래스 블록
	public static void main(String[] args) { // 메인 메소드 블록 : 클래스 블록 내부 
		// 메인 메소드 안에서 코드 작성 <- 객체를 다루기 전까지
		
		// 1. system.out.println();   : 콘솔에 출력 후 라인 개행(\n)
		
			// 문자열 : "(출력대상)"
			// 문자열을 연결해서 출력 : "(문자열)" + "(문자열)"
			System.out.println("안녕하세요");
			System.out.println("안녕하세요" + "1234");
			System.out.println(2 + 3); // 정수일 땐 + : 더하기
			System.out.println("2" + "3"); 
			// 실수 출력
			System.out.println(10.5 + 20.11);
			System.out.println("10.5" + 20.11); // 문자열 + 실수 -> 연결 됨, 뒤의 실수가 문자열로 강제 변환
			System.out.println("안녕" + (10.5 + 20.11)); // 괄호로 우선 순위 처리 가능
			
			
		// 변수에 값을 할당 후 출력
			// 변수 : 특정 값을 저장하는 메모리 공간
			// 변수 선언 : 자료형 변수명 = 값;
		
		//		= 		: 왼쪽의 변수에 오른쪽의 값을 할당 ( <- )
		//		==		: 같다. true/false 값을 리턴
		
		// 문자열을 담는 변수 
			String str = "안녕"; 
		
		// 정수를 담는 변수 
			int a = 10;
			int b = 20;
			System.out.println(str);
			System.out.println(a);
			System.out.println(b);
			
		// 문자열 + 변수 
			System.out.println("str 변수의 내용 :" + str );
			System.out.println("a + b = " + ( a + b ));
			
		// 2. system.out.print();  : 콘솔에 출력 후 개행 없음 
			System.out.println("============= println() =============");
			System.out.println("오늘");
			System.out.println("날씨");
			System.out.println("맑음");
			
			System.out.println("============= print =============");
			System.out.print("오늘");
			System.out.print("날씨");
			System.out.print("맑음");
			System.out.println();
			
			System.out.println("===== print() \\n : 엔터 ====");
			System.out.print("오늘\n");
			System.out.print("날씨\n");
			System.out.print("맑음\n");
			
			System.out.println("===== print() \\t : 탭 ====");
			System.out.print("오늘\t");
			System.out.print("날씨\t");
			System.out.print("맑음\t");
			System.out.println();
			
			System.out.println("=================printf================");
		// 3. system.out.printf();  : 콘솔에 출력 후 출력 문자열 라인의 변수 값을 불러 옴. 
									// %s : 문자열 %d : 정수 
									// %n.mf: 정수 부분 n자리, 소수점 아래 m자리
							
			str = "맑음";
			a = 50; 
			b = 30;
			double c = 123.4567; 
			
			System.out.printf("오늘의 날씨는 %s입니다.\n" , str );
			System.out.println("오늘의 날씨는" + str + " 입니다" );
			
		// printf : 문자열과 변수 동시에 출력시 코드가 간결함
		// println : 문자열과 변수 동시에 출력시 코드가 길어짐
			
			System.out.printf("오늘의 날씨 : %s \n 변수 a + b = %d \n 실수 c의 값 : %4.2f \n" , str , (a+b), c  );
			
			System.out.println("===============================");
			
			System.out.println("오늘의 날씨 : " + str + "\n변수 a + b = " + ( a + b ) + "\n실수 c의 값 : " + c );
			
			System.out.println("===============================");
			
		//변수 선언
			
			String str1 = "오늘 ";
			String str2 = "날씨는 ";
			String str3 = "맑습니다.";
			int d = 100; 
		
		// printf(); 출력
			System.out.printf("%s %s %s 정수의 값은 : %d ", str1, str2, str3, d);
		//  System.out.printf("%s %s %d 정수의 값은 : d% ", str1, str2, str3 ,d); <- 순서가 맞지 않아 오류 발생 ( str3 <-> %d )
			
			
	}
	// system.out.println("Hello world"); <- 오류 발생
}
