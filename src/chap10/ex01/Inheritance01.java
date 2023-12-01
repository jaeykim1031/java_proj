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
		 *
		 *						- 자식 클래스 생성 시 부모 클래스가 먼저 만들어지고 자식 클래스 생성됨
		 *						- "자식 클래스명" extends "부모 클래스명"
		 *
		 */

		// 1. Student 객체 생성
		Student s1 = new Student();

		// 부모 클래스에서 정의한 필드와 메서드
		s1.name = "홍길동";
		s1.age = 30;

		s1.eat();			// 모든 사람은 먹는다
		s1.sleep();			// 모든 사람은 잠을 잔다

		// Student 클래스의 필드와 메서드
		s1.studentID = 1111;
		s1.goToSchool(); 	// 학생은 학교를 간다

		s1.stuInfo();

		// 2. Professor
		Professor p1 = new Professor();

		p1.name = "김교수";
		p1.age = 50;

		p1.eat();
		p1.sleep();

		// 자식의 필드와 메서드
		p1.professorID = 2222;
		p1.teach();

		// 3. Worker
		Worker w1 = new Worker();

		// 부모의 필드와 메서드
		w1.name = "김교수";
		w1.age = 50;

		w1.eat();
		w1.sleep();

		// 자식
		w1.workerID = 3333;
		w1.goTowork();

		System.out.println("===== super vs super()=======================");
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
		
		// 1. Student(9999) 생성자 호출 -> Human, super("", 2); 호출
		// 2. Object 생성 -> Human 생성 -> """Student 생성"""
		
		System.out.println(s3.name);
		System.out.println(s3.age);

		System.out.println(s3.stuName);
		
		System.out.println("======================");
		
		// type casting 
		/*
		 * up casting : 자동 적용. 자식 타입 -> 부모 타입
		 * 				부모의 필드와 메서드만 사용 가능
		 * 
		 * down casting : (부모 -> 자식), 명시가 필수
		 * 					부모, 자식의 필드와 메서드 모두 사용 가능
		 *
		 */
		
		//자식 객체를 생성해, 부모 타입으로 지정 : 부모 폴더, 메소드만 사용 가능
		// 호출 : 1. child 호출 -> 2. professor 호출 -> human 호출
		// 생성 : 4. human 생성 -> 5.professor 생성 -> Child.

		// 		Type : Human : Human 필드의 메서드만 사용 가능

		Human ch01 = new Child(); // cd01 :Human, Professor, Child 내포
		
		// Human의 필드와 메서드만 사용 가능

		ch01.name = "leif" ;
		ch01.eat();
		
		// 다운 캐스팅  : Human, Professor 의 필드와 메서드 사용 가능
		Professor pp1 = (Professor) ch01;

		// Human
		pp1.age = 17;

		// Professor
		pp1.professorID = 42;

		// 다운 캐스팅  : child - Human, Professor 의 필드와 메서드 사용 가능
		Child ch05 = (Child) pp1;

		// Human
		ch05.name = "Nanna";

		// Professor
		ch05.professorID = 1313;

		// Child
		ch05.childName = "leifNanna";


		// 업캐스팅 : 자동 작동 
		// h01 = Human, Professor, Child
		Human h01 = ch05;

		// Human 클래스를 객체화해서 Human 타입 : Human
		// hh01 : Human
		Human hh01 = new Human();

		// Human
		hh01.age = 40;

		// Professor pp02 = (Professor) hh01 	<- 실행시 오류

		// Professor 를 객체화해서 Human 타입으로 지정
		// ppp01 : Human, Professor
		Human ppp01 = new Professor();

		// Human
		ppp01.name = "김길동";

		// 다운 캐스팅 : Human -> Professor
		Professor ppp02 = (Professor) ppp01;
		
		// Human
		ppp02.name = "rla"; 
		// Human
		ppp02.professorID = 11;

		// Child ch33 = (Child) ppp02; 		// 실행시 오류 발생

		Child ch44 = (ppp02 instanceof Child) ? (Child) ppp02 : null;		// <- 삼항 연산자
		
		// 객체 instanceof 타입 : 객체에 타입이 존재하면 true
		
		System.out.println(ch44);
		
		// Child 를 객체화 해서 Child 타입으로 지정 : 자신의 부모의 모든 필드와 메서드 사용 가능
		// Human, Professor, Child
		
		Child cc01 = new Child();
		
		cc01.name = "rla";				// Human
		cc01.professorID = 222;			// Professor
		cc01.childName = "thswk";		// Child
		
		Professor p100 = cc01; // 업 캐스팅 : Child -> Professor
			
		Human hh100 = p100;		// 업 캐스팅 : Professor -> Human
		
		Child cc100 = (Child) hh100;	// 다운 캐스팅 : Human -> Child
		cc100.age = 90;

		System.out.println(cc100.age);;
		
	}
}
