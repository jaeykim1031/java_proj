package chap06.ex01;
	// 클래스 외부 : 패키지, import, 

public class Object_Definition {
	// ↓ 클래스 블록 : 필드, 메소드, 생성자
	
	
	// 필드 (멤버 변수) : heap 공간에 변수와 값이 저장. 클래스 블록에 저장된 변수를 필드라고 함
			// 변수 : 메소드 블록 안에 선언된 것. stack에 변수명, 값 저장됨
	String name;
	int age;
	double weight;
	String add;

	// 메소드 (함수) : 리턴 타입, 메소드 이름(입력매개변수), { ("호출시 실행 코드"); }
	void printName() {
		System.out.println("필드에 입력된 이름 : " + name);
	}
	
	// 생성자 : 클래스 이름과 동일. 리턴 타입이 없는 메소드. 객체 생성시 필드의 값을 초기화.
	
	Object_Definition(){}	// 기본 생성자(생략 가능) : 객체 생성 시 생성자 호출해서 필드의 값을 초기화 
	
	// 인풋 값이 존재하는 생성자.
	Object_Definition(String name, int age, double weight, String add){
		// this : 자신 객체의 필드, 
		// 인풋 변수의 이름 = 받는 변수의 이름 = 필드 이름 일 경우 this.""
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.add = add;
		
	}
	
	// 메소드(호출시 작동)
	int printAge() {
		return age;
	}
	
	void printAll() {
		System.out.println("이름 : " + name + " , 나이 : " + age );
		System.out.println("몸무게 : " + weight + ", 주소 : " + add);
		
	}
	
 public static void main(String[] args) {
	 // ↓ 메소드(함수) 블록 : 
	 
	/*
	 * 절차적 프로그래밍 (POP, Procedural Programming) : 시간의 순서대로 프로그래밍 (C)
	 * 		- 성능 우수, 유지보수하기 어렵다, 개발하기 어렵다, 반복된 코드가 계속 적용될 수 있음 
	 * 		- 최적화에 특화되어 있음
	 * 
	 * 객체 지향 프로그래밍 (OOP, Object-Oriented Programming) : Java, C++,
	 * 		- 유지보수하기 쉽다, 개발하기 쉽다, 반복된 코드를 줄일 수 있다(간결한 코드), 캡슐화(보안이 강하다)
	 * 			상속(중복 방지), 다형성(여러 형태로 찍어낼 수 있음)
	 * 
			 * 클래스 : 객체를 생성하는 틀, 설계도 (일종의 틀)
			 * 
			 * 객체 (인스턴스) : (클래스를 기반으로) RAM에 로드
	 * 				- 하나의 클래스로 여러 객체를 생성할 수 있음 
	 * 
	 */
	 
	 // 변수 
	 String abc; 
	 
	 // 1. 객체 생성 : 클래스를 메모리 위에 올림. 클래스 = 객체를 만드는 '''설계도'''
	 		// 구조 : 클래스 명 객체 = new 클래스 명();
	 
	 		// 		 타입 	변수명 = new 생성자 호출;
	 Object_Definition hong = new Object_Definition();
	 
	 // 2. 객체의 필드의 값 등록
	 hong.name = "홍길동";
	 hong.age = 30;
	 hong.weight = 77.5;
	 hong.add = "서울";
	 
	 // 3. 객체의 메소드 호출
	 hong.printName();
	 System.out.println(hong.printAge()); 		// 리턴값이 있어서 
	 
	 hong.printAll();
	 
	 System.out.println("================");
	 
	 // 객체 생성 : 생성자에 매개 변수의 값을 넣어 객체 생성 
	 Object_Definition lee = new Object_Definition("abc", 0, 0, "abc");		// <- String int double String 순서
	 
	 // 메소드 호출 
	 lee.printAll();
	 
	 System.out.println("================");
	 
	 //객체 생성 (설계도) 
	 Object_Definition park = new Object_Definition("ㅂㅂㅂ", 53, 14.34, "131" );
	 
	 // 메소드 호출
	 park.printAll();
	 
	 System.out.println(park.name);
	 System.out.println(park.age);
	 
	 System.out.println("================");
	 System.out.println(hong.name);
	 System.out.println(hong.age);
	 
	 System.out.println("================");
	 System.out.println(lee.name);
	 System.out.println(lee.age);

	 System.out.println("======== 필드 값 수정 =======");
	 lee.name = "lee sang hyeok";
	 lee.age = 27;
	 
	 System.out.println("================");
	 System.out.println(lee.name);
	 System.out.println(lee.age);

	 
 	}
}
