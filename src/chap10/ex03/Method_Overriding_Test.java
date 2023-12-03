package chap10.ex03;

public class Method_Overriding_Test {

	public static void main(String[] args) {
		/*
		 *  Method Overriding :
		 * 		- 정적 메서드 : static 메서드명 , 객체 생성 없이 "클래스명.메소드명" 으로 호출
		 * 		- 인스턴스 메서드 :앞에 static 이 없는 메서드. 객체화해야 호출 가능 
		 * 
		 *		- 상속 관계에서 적용 가능
		 *		- 부모에서 선언된 인스턴스 메서드를 자식 클래스에서 재정의(오버라이드)해서 사용하는 것
		 *
		 *
		 *		- ""다형성"" : 자식을 객체화 하여 부모의 타입으로 선언 후, 부모의 메서드를 호출시 
		 *						자식의 오버라이드 된 메서드가 작동
		 * 						부모의 메서드 호출 시 자식의 오버라이드 한 메서드 호출
		 */
		
		// 1. 객체 생성 : Animal
		Animal a1 = new Animal();

		// 인스턴스 필드
		a1.name = "동물";
		a1.age  = 10;

		// 정적 할당
		a1.color = "빨강";

		// 인스턴스 메서드
		a1.cry();

		// 정적 메서드
		a1.eat();

		// 2. 객체 생성 없이 클래스 명으로 필드, 메서드 호출 (static 필드, static 메서드)

		Animal.color = "노랑";
		Animal.eat();

		System.out.println("===============");
		Animal a2 = new Animal();

		a2.eat();


		// Dog 객체화 Animal 타입으로 지정 - a3 : Animal, Dog
		Animal a3 = new Dog();
		a3.cry();			// Animal의 cry() 를 호출시 Dog의 cry()를 호출함 - 다형성

		// Eagle 객체화 해서 Animal 타입으로 지정
		Animal a4 = new Eagle();
		a4.cry();			// Animal의 cry() 를 호출시 Eagle의 cry()를 호출함 - 다형성

		// Lion을 객체화 해서 Animal 타입으로 지정
		Animal a5 = new Lion();
		a5.cry();			// Animal의 cry() 를 호출시 Lion의 cry()를 호출함 - 다형성
		
	}
}
