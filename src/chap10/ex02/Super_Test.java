package chap10.ex02;

class A {				// 부모 클래스
	
	A(){
		System.out.println(" A 클래스의 기본 생성자 1");
	}
	A(int a){
		System.out.println("A 클래스의 인풋 1개 정수 - 생성자");
	}
	A(String a, int b) {
		System.out.println("A 클래스의 인풋 2개 - 문자열, 정수");
	}
}

class B extends A {
	B() {System.out.println("B 클래스의 기본 생성자");}
	B(int a){System.out.println("B 클래스의 인풋 1개개 - 정수");}
	B(String a, int b){
		System.out.println("B 클래스의 인풋 2개- 문자열, 정수");
	}
	
}

class C extends B {
	C(){System.out.println("C의 기본 생성자");}
	C(String a) {
		super(1);
		System.out.println(" C 출력"); 
}


public class Super_Test {

	public static void main(String[] args) {
		
			C c1 = new C( "today ");
			
			// ghc   
			
			
			System.out.println(c1.a); //22 
			System.out.println(c1.b); //33 
			
	}

}
