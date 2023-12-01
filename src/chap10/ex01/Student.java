package chap10.ex01;

public class Student extends Human{		// 자식 클래스
							// ↑↑ 부모 클래스
	
	// Human 클래스의 필드와 메서드가 Student 클래스로 상속
	
	// 기본 생성자 ↓ 생략됨
	Student(){
		super();			// 부모 클래스의 () 생성자 == 기본 생성자 호출
	}
	
	Student(int studentID){
//		super();			// 자식 클래스 안에는 항상 존재하나 생략되어있음.

		super("jane", 20); 	// 부모 클래스의 인풋이 2개인 생성자 호출
		this.studentID = studentID;
		this.stuName = super.name; //
		super.eat(); 
	}
	
	// 필드 : 
	String stuName;
	int studentID;
	
	// 메서드
	void goToSchool () {
		System.out.println("학생은 학교를 간다");
	}

	void stuInfo()	{
		System.out.println("학생이름은 + " + name + "이고, 나이는 " + age +" 입니다. ");
	}

		
		
	
}
