package lab.chap04;

import java.util.Scanner;

public class If_StatementPrac {

	public static void main(String[] args) {
		/*
		 * 콘솔에서 "월요일" 입력 되었을 때 출력 "월요일은 자바를 공부합니다"
		 * 콘솔에서 "화요일" 입력 되었을 때 출력 "화요일은 데이터베이스를 공부합니다"
		 * 콘솔에서 "수요일" 입력 되었을 때 출력 "수요일은 Html, JavaScript를 공부합니다"
		 * 콘솔에서 "목요일" 입력 되었을 때 출력 "목요일은 JSP를 공부합니다"
		 * 콘솔에서 "금요일" 입력 되었을 때 출력 "금요일은 Spring를 공부합니다"
		 * 콘솔에서 "토요일" 입력 되었을 때 출력 "토요일은 운동합니다"
		 * 콘솔에서 "일요일" 입력 되었을 때 출력 "일요일은 TV를 시청합니다"
		 * 
		 * 요일 외의 값이 입력 되었을 때 : "요일을 입력하세요"
		 * 
		 * if, else if 사용 .equals() 사용
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요일을 입력하시오 >>> ");
		
		String day = sc.next();
		
		if (day.equals("월요일")) {
			System.out.println("월요일은 자바를 공부합니다");
			
			System.out.println("월요일 출력");
			
		}else if (day.equals("화요일")) {
			System.out.println("화요일은 데이터베이스를 공부합니다");
		}else if (day.equals("수요일")) {
			System.out.println("수요일은 Html, JavaScript를 공부합니다");
		}else if (day.equals("목요일")) {
			System.out.println("목요일은 JSP를 공부합니다");
		}else if (day.equals("금요일")) {
			System.out.println("금요일은 Spring를 공부합니다");
		}else if (day.equals("토요일")) {
			System.out.println("토요일은 운동합니다");
		}else if (day.equals("일요일")) {
			System.out.println("일요일은 TV를 시청합니다");
		}else {
			System.out.println("잘못된 값입니다, 요일을 입력하세요");
		}	
		
		// 변수명 한꺼번에 바꾸기 : Alt + Shift + R
		// 라인의 여러 값 한꺼번에 바꾸기 : Alt + Shift + A
		
		}

	
	}


