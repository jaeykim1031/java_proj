package lab;

public class ConsoleOutput1 {

	public static void main(String[] args) {
		
		String fatherName = "홍길동"; // 캐멀 케이스 : 소문자 시작, 단어가 이어지는 첫 글자를 대문자로 표시
		String motherName = "홍길순";
		String myName = "홍당무";
		
		int age = 30;
		
		double weight1 = 70.5;
		double weight2 = 50.7;
		
	// 출력 내용 : 우리 아버지의 이름은 홍길동이고, 우리 어머니의 이름은 홍길순 입니다
	//			나의 이름은 홍당무이고, 나이는 30살, 몸무게는 70.5kg 입니다
		
		
		// println() : 출력
		System.out.println("우리 아버지의 이름은 " + fatherName +" 이고, 우리 어머니의 이름은 " + motherName + "입니다");
		System.out.println("나의 이름은 " + myName + "이고, 나이는 " + age + "살, 몸무게는 " + weight1 + "kg 입니다");
		
		
		// printf() : 출력
		System.out.printf("우리 아버지의 이름은 %s이고, 우리 어머니의 이름은 %s 입니다\n", fatherName, motherName);
		System.out.printf("나의 이름은 %s이고, 나이는 %d살, 몸무게는 %.1fkg 입니다\n", myName, age, weight1 );
		
		
		
	}

}
