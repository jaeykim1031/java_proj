package chap06.ex02;

// 외부 클래스

		// Public 클래스는 하나만

class Student{			// 객체를 만드는 설계도, 객체화(인스턴스화) 해야 사용할 수 있음 
	// 필드, 메소드, 생성자, inner class 
	
	// 객체 : 보이는 모든 사물
	// 1. 필드 : 객체가 가지는 속성 값
	String name;		// 이름
	int num;			// 학번
	int kor;			// 국어 성적
	int eng;			// 영어 성적
	int math;			// 수학 성적  < - 전부 heap 저장 
	
	// 2.기본 생성자 : 다른 생성자가 없을 때 생략 가능
//	Student(){}
	
	// 3. 메소드 : 필드의 값을 조작해서 출력
	void printAll() { 	// 필드에 등록된 내용 출력  <- 입력값 없고 void
		System.out.println("이름 : " + name );
		System.out.println("학번 : " + num );
		System.out.println("국어 점수 : " + kor );
		System.out.println("영어 점수 	: " + eng );
		System.out.println("수학 점수 : " + math );
	}
	
	double avg() {
			double avgAll = 0.0;
			
			avgAll = ( kor + eng + math	) / 3;
			
			return avgAll;
	}
	
	int puls (int a, int b) {
		int sum =  a + b;
		
		return sum;
	}
	
	String abc (String name, String name2) {
		return name + " + " + name2;
	}
}

class Car {
	
	// 1. 필드 선언
	String carName;
	String carColor;
	double carSpeed;
	int carDoor;
	
	// 2. 생성자 : 리턴 타입이 생략된 메서드, 클래스 이름과 동일해야 함, 필드의 값 초기화
	Car () {} 		// <- 기본 생성자
	
	Car (String carName, String carColor, double carSpeed, int carDoor) {
		this.carName = carName;
		this.carColor = carColor;
		this.carSpeed = carSpeed;
		this.carDoor = carDoor;
	}
	
	// 메서드 : 프로그램의 기능, 호출시 작동
	void printAll() {
		System.out.println("차 이름 : " + carName);
		System.out.println("차 색 : " + carColor);
		System.out.println("차 속도 : " + carSpeed);
		System.out.println("차 문 개수 : " + carDoor);
	}
	
	
}

public class Object_Definition2 {
	public static void main(String[] args) {
		
		// 1. 객체 생성 테스트는 반드시 main 메서드 안에서 실행
		Student s1 = new Student();
		
		// 2. 객체의 모든 필드 출력
		
		// 메서드 호출 
		s1.printAll();
		
		System.out.println(s1.puls(313, 4324)); 	// 리턴 : 호출한 곳으로 값을 돌려 줌 
		
		System.out.println(s1.abc("ssd", "hdd"));
		
		// 3. s1 객체의 필드에 값 할당 : 직접 입력 / 생성자 / setter
		
		s1.name = "홍길동";
		s1.num = 42;
		s1.kor = 77;
		s1.eng = 36;
		s1.math = 41;
		
		s1.printAll();
		System.out.println("평균 : " + s1.avg());		
		
		System.out.println("=============");
		
		Student s2 = new Student();
		s2.name = "이소라";
		s2.num = 24;
		s2.kor = 14;
		s2.eng = 41;
		s2.math = 56;
		
		System.out.println("평균 : " + s2.avg());		
		s2.printAll();
		
		
		System.out.println("======= Car 객체 ========");
		
		Car car1 = new Car(); 		// 생성자 있을 경우. 명시 필수  
		car1.printAll();
		
		System.out.println("=============");
		Car car2 = new Car("Benz", "Black", 157, 4);
		car2.printAll();
		
		Car car3 = new Car("Audi", "White", 163, 2);
		car3.printAll();


	}

}
