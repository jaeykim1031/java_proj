package lab.chap10.car;

public class S_Car extends Car {

								// @ (Annotation)
	@Override					// @Override : 부모의 메서드를 오버라이드 하겠다고 선언
	void run() {
		System.out.println("ssangyong car");
	}

	
	
}
