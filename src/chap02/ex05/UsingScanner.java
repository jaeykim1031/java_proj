package chap02.ex05;

import java.util.Scanner;

public class UsingScanner {
	
	public static void main(String[] args) {
		
		// 외부의 라이브러리 사용 : 자바에서 만들어진 클래스의 묶음을 라이브러리라고 함
			// import 필요 java.lang 패키지의 클래스는 import 없이 바로 사용 가능 
		
		System.out.println();
		
		String a;
		Integer b;
		Double c;
		Long d;    // 위 4개 전부 객체형 자료 (기본형과 다름)
		
		/*Scanner : 콘솔로 부터 입력값을 받아오는 클래스 (객체) 
		 * 		- 외부 클래스 : java.lang 외부에 존재하는 클래스 <- import 필요함
		 * 		- 동일한 패키지에 존재하는 클래스는 import 없이 사용 가능
		 * 		- 동일한 패키지에 존재하지 않는 클래스는 import
		 * 		- java.utill.Scanner : 클래스의 전체 이름(패키지 명, 클래스 명) 
		 * 		- ctrl + shift + o : 자동 import
		 * 		- 콘솔에서 값을 넣고 Enter / Space 누르면 다음 스캐너에서 입력 대기
		 */		
		
//     참조타입  객체변수명
		Scanner sc = new Scanner(System.in);
//					 new : heap에 객체의 값을 저장하겠다
		
		// 변수 선언
		String fName;
		String mName;
		String myName;
		
		System.out.println("아버지 이름을 입력 하세요 >>> ");
		fName = sc.next(); // sc.next(); : 콘솔로 부터 "문자열" 을 인풋 받음, 콘솔에서 input 대기 중 
		System.out.println("어머니 이름을 입력 하세요 >>> ");
		mName = sc.next(); 
		System.out.println("자신의 이름을 입력 하세요 >>> ");
		myName = sc.next();  
		
		System.out.println("입력받은 아버지 이름은 : " +fName);
		System.out.println("입력받은 어머니 이름은 : " +mName);
		System.out.println("입력받은 나의 이름은 : " +myName);
		
		System.out.println("======================================");
		
		// 스캐너롤 정수 입력 받기 : 
		
		int aa;
		int bb;
		int cc; 
		
		System.out.println("aa bb cc 변수에 정수 값을 공백으로 입력하시오 >>> ");
		
		aa = sc.nextInt();		// 콘솔에서 정수 입력
		bb = sc.nextInt();
		cc = sc.nextInt();
		
		System.out.println("aa : " + aa + "\nbb : " + bb + "\ncc : " + cc);
		
	}
}
