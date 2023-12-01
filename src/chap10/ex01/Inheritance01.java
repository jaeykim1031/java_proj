package chap10.ex01;

public class Inheritance01 {
	public static void main(String[] args) {
		/*
		 * 상속 (Inheritance) : OOP의 가장 큰 특징 
		 *						- 자바는 하나의 부모 클래스만 상속, 다중 상속 미 지원.
		 *						- 중복 방지 가능
		 *						- OOP의 꽃
		 *
		 *						- 부모 클래스의 필드, 메서드, 이너 클래스가 그대로 자식 클래스에 상속됨 (생성자는 상속되지 않음)
		 *						- 자식 클래스 생성 시 자식 클래스 생성자 내부에 super()가 생략 되어있음
		 *															super() : 부모 클래스의 생성자를 호출
		 *						- 자식 클래스 생성 시 부모 클래스가 먼저 만들어지고 자식 클래스 생성됨
		 *						- "자식 클래스명" extends "부모 클래스명"
		 * 
		 */
		
		// this  키워드 : 자기 자신의 객체, this.필드 / this.메서드
		// this() 메서드 : 생성자 실행 블록에서 사용됨, 반드시 첫 라인에 와야 함 
							// 다른 생성자를 호출
			 
		// super 키워드 : 부모의 필드 메서드 호출, super.필드 / super.메소드
		// super() 메서드 : 생성자 실행 블록에서만 사용, 반드시 첫 라인데
		
							// 부모 클래스의 생성자를 호출
							// 자식 클래스 생성자 내부에는 실행 블록 첫 라인에 super() 생략되어 있음
							// 자식 클래스를 생성하면 super()에 의해 부모 클래스 먼저 생성 됨 
		 
		
		
		Student s2 = new Student();
		
		// Student 클래스의  input 1개인 생성자 호출

		
		
		System.out.println("======================");
		Student s3 = new Student(9999);
		
		// 1. Student(9999) 생성자 호출 -> Human.super("", 2); 호출
		// 2. Object 생성 -> Human 생성 -> """Student 생성"""
		
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		System.out.println(s3.stuName);
		
		System.out.println("======================");
		
		// type casting 
		/*
		 * up casting : 자동 경용. 자식 -> 부모
		 * 				부모의 필드나 
		 * 
		 * down casting : (부모 -> 자식), 명시가 필수
		 * 
		 */
		
		//자식 객체를 생성해, 부모 타입으로 지정 : 부모 폴더, 메소드만 사용 가능
		// 호출 : 1. child 호출 -> 2. professor 호추 -> human 호출
		// 생성 : 4. human 생성 -> 5.professor 생성 -> Chird
		// 		Type : Human : Human 필드의 메서드만 사용 가능 		
	
		
		Human ch01 = new Child(); // cd01 :Human, Professor Child 내포
		
		
		
		// Human 
		pp1.age = 10 ;
		
		//Professer
		pp1.professorID = 30;
		
		// 다운 캐스팅  : child - Human, Professor, Child 의 필드와 메서드 사용 가능 
		
		// Child
		ch05.chirdName = "아기";
		
		// 업캐스팅 : 자동 작동 
		// h01 =Human, Professor, Child
		Human h01 = ch05;
		
		// Professor 를 객체화해서 Human 타입으로 지정 
		Human ppp01 = new Professor();
		
		// Human
		ppp01.name = "김길동";
		
		// 다운 캐스팅 : Human -> Professor
		Professor ppp02 = (Professor) ppp01;
		
		// Human
		ppp02.name = "rla"; 
		// Human
		ppp02.prfessorId = 11;
		
		Child ch44 = (ppp02 instanceof Child) ? (Child) ppp02 : null;		// <- 삼항 연산자
		
		// 객체 instanceof 타입 : 객체에 타입이 존재하면 true
		
		System.out.println(ch44);
		
		// Child 를 객체화 해서 Child 타입으로 지정 : 자신의 부모의 모든 필드와 메서드 사용 가능
		// Human, Professor, Child
		
		Child cc01 = new Child();
		
		cc01.name = "rla";			// Human
		cc01.professorID = 222;		// Professor
		cc01.childName = "thswk"	// Child
		
		Professor p100 = cc01: // 업캐스팅 : Child -> Professor
			
		Human hh100 = p100;		// 업캐스팅 : Professor -> Human
		
		Child cc
		
		
		
	}
}
