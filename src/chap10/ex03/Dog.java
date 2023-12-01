package chap10.ex03;


public class Dog extends Animal{
		// TODO Auto-generated constructor stub
		
		@Override // 덮어쓰기 
		Void cry() {
			System.err.println("개는 멍멍");
		}
	}

}