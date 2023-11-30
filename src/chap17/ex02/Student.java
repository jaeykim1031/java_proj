package chap17.ex02;

public class Student {
	/*
	 *  클래스 : 객체를 만들기 위한 틀. 객체(모든 인스턴스 대표하는 포괄적 의미) : 클래스를 기반으로 메모리에 로드된 것
	 */ 
	
	//	 1. 필드 : 속성	
	
	String name;
	String addr;
	int num;
	
	int kor, eng, math;
	
	//	 2. 생성자 : 클래스 기반으로 객체 생성시 생성자 호출 (하나의 메서드) 
		
		// 기본 생성자 : 다른 생성자가 없을 때는 생략되어 외부에서 호출 가능
			Student() {}
			
		// 인풋 값이 1, 2, 3개인 생성자 
			Student(String name){ this.name = name; }
			
			Student(int num){ this.num = num; }
			
			Student(String name, String addr){ this.name = name; this.addr = addr; }
			
			Student(String name, String addr, int num){
				this.name = name ; this.addr = addr ; this.num = num;
			}
			Student (String name, int kor, int eng, int math) {
				this.name = name ; this.kor = kor ; this.eng = eng ; this.math = math;
			}

			
		// 생성자 오버로딩	
		// Method Overloading : 메서드 이름이 동일, 시그니쳐(식별자)에 따라 해당 메서드 호출
												// 식별자 : 인풋 개수, 인풋 자료형 
		 
		// Method Overriding : 상속 관계에서 부모 클래스의 메서드를 재정의하여 사용하는 것
						// 다형성 : 하나의 메소드를 여러 형태로 출력
						// 상속 : 중복된 코드를 방지
			
	//	 3. 메서드 : 기능, 입력 -> 출력, 
			
		// kor, eng, math 점수를 합계와 평균을 구해서 출력하는 메소드
			public void sumAvg() {
				int sum = 0;
				sum = kor + eng + math;
				
				double avg = sum / 3.0 ; 
				
				System.out.println( name + " 님의 총 점수는 " + sum + "점 입니다. 평균 점수는 :" + avg  ); 
			}
			
		 
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAddr() {
				return addr;
			}

			public void setAddr(String addr) {
				this.addr = addr;
			}

			public int getNum() {
				return num;
			}

			public void setNum(int num) {
				this.num = num;
			}

			public int getKor() {
				return kor;
			}

			public void setKor(int kor) {
				this.kor = kor;
			}

			public int getEng() {
				return eng;
			}

			public void setEng(int eng) {
				this.eng = eng;
			}

			public int getMath() {
				return math;
			}

			public void setMath(int math) {
				this.math = math;
			}

			
		// toString 메서드 : object 클래스에 존재함, 객체 자체를 출력시 heap의 주소가 출력되지 않고 필드의 값 출력
	
			@Override
			public String toString() {
				return "Student [name=" + name + ", addr=" + addr + ", num=" + num + ", kor=" + kor + ", eng=" + eng
						+ ", math=" + math + "]";
			}
		
}
