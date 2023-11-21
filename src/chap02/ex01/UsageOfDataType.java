package chap02.ex01;
// 패키지 : 폴더 
public class UsageOfDataType { // 클래스 영역
	public static void main(String[] args) { // 메인 메소드 영역
		// 변수 : 선언 후 변수의 값을 다른 값으로 할당 할 수 있음. '되도록' 캐멀 케이스로 작성
		// 상수 : 할당 후 값을 수정할 수 없다. 변수 선언 앞에 final키 등록. '되도록' 상수 명은 대문자로만 지정 
		
		/* 자료형 : 변수/상수를 정의 할 때 반드시 자료형 필요 
			- 기본 자료형 (8개) : 메모리의 stack 공간에 변수와 값 할당
				true / false - boolean  
				정수 - byte short int long 
				실수 - float double
				문자 - char 
				
			- 참조 자료형 (무한) : stack에 변수명, heap에 값 할당
				첫 글자는 대문자
				객채 / 배열 / 인터페이스 
				AnythingGoes 임의로 설정 가능 
		*/
		
		//변수 선언 방법 
		
		//1. 변수 선언, 값 나중에 할당
			int a;
			int b; 
			
			a = 1; 
		
			System.out.println(a);
			// System.out.println(b); <- 값 할당이 안 되어 오류 발생
		
		//2. 변수 선언과 동시에 할당
			int c = 10;
			int d = 20;
			System.out.println(c); // 10 
			System.out.println(d); // 20 
			
		// literal : 변수/상수에 들어가는 값		
			c = 55;
			d = 66; 
			
			System.out.println(c); // 55 
			System.out.println(d); // 66 
			
		// 상수 : 한 번 값이 할당되고 난 후 다른 값을 넣을 수 없음, 되도록 대문자. 
			final int ABC = 200; 
			final double PI = 3.141592;
			
			System.out.println(ABC);
			
			// ABC = 300; <- 새로운 값 넣으면 오류 발생 
		
			
		System.out.println("========= 8가지 자료형 =========");
		
		boolean abc;
		abc = true;
		System.out.println(abc);
		
		// 정수
		//byte : 1 byte (8 bit) -128 ~ 127
			byte aa;
			byte bb;
			
			aa = -128;
			bb = 127;	
			System.out.println(aa);
			System.out.println(bb);
			
		//short : 2 byte -32768 ~ 32767
			short cc;
			short dd;
			
			cc = -32768;
			dd = 32767;	
			System.out.println(cc);
			System.out.println(dd);
			
		//int : 4 byte -2147483648 ~ 2147483647
			int ee;
			int ff;
			
			ee = -2_147_483_648;
			ff = 2_147_483_647;	
			System.out.println(ee);
			System.out.println(ff);
			
		//long : 8 byte -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
			// int 범위를 벗어났을때 리터럴에 l, L 명시 
			long gg;
			long hh;
			
			gg = -9_223_372_036_854_775_808L;
			hh = 9_223_372_036_854_775_807L;	
			System.out.println(gg);
			System.out.println(hh);
			
		// 실수 
		// float : 4 byte, 소수점 7자리까지 정밀도 유지, 리터럴 뒤에 f, F
		   float jj; 
		   jj = 1.11111111111111111111f;
		   System.out.println(jj);
		   
		// double : 8 byte, 소수점 15자리까지 정밀도 유지
		   double kk;
		   kk = 1.1111111111111111111111111111111;
		   System.out.println(kk);	   
		   
	   // 문자
	   // char : 1문자를 넣을 수 있음. 영문, 한글, 일본어, 중국어. 아스키 코드(10진수), 유니코드 할당('\\u값') 가능. '(입력값)'
		  // 아스키 코드 : 7bit. 영어 소/대문자, 숫자, 특수 문자, 공백 문자 
		  // 유니 코드 : 2byte. 거의 모든 문자를 다루기 위해 설계된 문자 처리 방식
	   // string : 문자열. "(입력값)"
		   char ll;
		   ll = 'A';
		   char mm;
		   mm = '가';
		   System.out.println(ll);
		   System.out.println(mm);
		   
		   // 'a' = 97 = '\u0061'   
		   char nn ='a';
		   char oo = 97;
		   char pp = '\u0061';  
		   System.out.println(nn);
		   System.out.println(oo);
		   System.out.println(pp);
		   
		   char firstName1 = '\uc7ac';
		   char firstName2 = '\uc601';
		   char lastName1 = '\uae40';
		   
		   System.out.println("내 이름은 " + lastName1 + " " + firstName1 + firstName2 + " 입니다.");
		   System.out.printf("내 이름은 %c %c%c 입니다.", lastName1, firstName1, firstName2 );
		   
	   //
		   
	}

}
