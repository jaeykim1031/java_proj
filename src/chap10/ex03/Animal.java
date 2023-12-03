	package chap10.ex03;


public class Animal {			// 부모 클래스

	// 필드
	String name;
	int age;
	static String color;

	// 메서드(인스턴스) : 객체화(인스턴스화) 해야만 호출 됨, override 가능
	 void cry()	{
		System.out.println("모든 동물을 운다. ");
	}
	
	// 메서드 (정적) : 객체화 하지 않고 클래스명 으로 호출 ok, 
	static void eat() {
			System.out.println("모든 동물은 밥을 먹는다");
	}
}
