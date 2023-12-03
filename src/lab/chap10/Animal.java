package lab.chap10;

public class Animal {			// 최상위 부모 클래스
	String name;
	int age;
	static String color;

	void cry(){
		System.out.println("모든 동물은 운다. ");
	}
	
	static void eat() {
		System.out.println("모든 동물은 먹는다");
	}
	
}
