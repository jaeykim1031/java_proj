package chap04.ex02;

public class Switch_Statement {

	public static void main(String[] args) {
		/*
		 * switch : 기본적으로 case 문 안에서 break; 사용해야 함 
		 * 			- defalut 에서는 break 없이 탈출 가능
		 */
		int val1 = 5;
		
		switch (val1) { 				// 점프 변수, case의 값으로 점프
		case 1:
			System.out.println('A');
			break;
		case 2:
			System.out.println('B');
			break;
		case 3:
			System.out.println('C');
			break;
		case 4:
			System.out.println('D');
			break;
		default: 						// case에 없는 값은 default로 점프
			System.out.println('E'); 
			// break; 없어도 됨
			
		char ch = 'j';
		
		switch (ch) {
		case 'a':
			System.out.println("A 학점입니다");
			break;
		case 'b':
			System.out.println("B 학점입니다");
			break;
		case 'c':
			System.out.println("C 학점입니다");
			break;

		default:
			System.out.println("F 학점입니다");
			
		}
		
		String abc = "월요일";
		
		switch (abc) {
		 case "월요일":
             System.out.println("월요일은 자바를 공부합니다");
             break;
         case "화요일":
             System.out.println("화요일은 데이터베이스를 공부합니다");
             break;
         case "수요일":
             System.out.println("수요일은 Html를 공부합니다");
             break;
         case "목요일":
             System.out.println("목요일은 리액트를 공부합니다");
             break;
         case "금요일":
             System.out.println("금요일은 JSP를 공부합니다");
             break;
         case "토요일":
             System.out.println("토요일은 운동합니다");
             break;
         case "일요일":
             System.out.println("일요일은 TV를 시청합니다");
             break;
         default:
             System.out.println("잘못된 값입니다, 요일을 입력하세요");
		}
		
			
		}
	}

}
