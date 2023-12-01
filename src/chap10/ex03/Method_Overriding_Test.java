package chap10.ex03;

public class Method_Overriding_Test {

	public static void main(String[] args) {
		/*
		 * Method Overriding : 
		 * 		- 정적 메서드 : static 메서드명 , 객체 생성 없이 "클래스명.메소드명" 으로 호출
		 * 		- 인스턴스 메서드 :앞에 static 이 없는 메서드. 객체화해야 호출 가능 
		 * 
		 *		- 상속 관계에서 적용 가능
		 *		- 부모에서 선언된 인스턴스 메서드를 자식 클래스에서 재정의(오버라이드)해서 사용하는 것
		 *
		 *		- ""다형성"" : 자식을 객체화 하여 부모의 타입으로 선언 후, 부모의 메서드를 호출시 
		 *						자식의 오버라이드 된 메서드가 작동
		 * 						부모의 메서드 호출 시 자식의 오버라이드 한 메서드 호출
		 */
		
		// 1. 객체 생성 : Animal
		
		Animal a1 = new Animal();
		
		a1.name = "ehdanf";
		a1.age  = 10;
		a1.color = ""
		
		// 정적 할당
		a1.color = "빨강" ;
		// 인스턴스 
		a1.cry();
		
		 
		
	}
}
