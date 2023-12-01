package lab.chap10;

public class Animal {			// 최상위 부모 클래스
	String name;
	
	Animal( String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Animal a2 = new Animal();
	a2.cry();
	
	// dog 객체화, animal 타입으로 지정. a3 : Animal, Dog
	
	Animal a3 = new	Dog();
	a3.cry();			// Animal의 cry() 호출 시  Dog의 cry()를 호출함	== ""다형성""
	
	
	// Eagle 을 객체화 해서 Animal 타입으로 지정
	Animal a4 = new Eagle();
	
	a4.cry(); 			// Animal의 Cry를 호출 시 Eagle의 Cry() 작동함
	
	
						// Lion을 객체화 하여 Animal 타입으로 지정  
	Animal a5 = new Lion();
	a5.cry();
	
	
	
}
