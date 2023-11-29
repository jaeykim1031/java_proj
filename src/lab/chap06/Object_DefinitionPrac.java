package lab.chap06;

class Animal {
	
	// 1. 필드
	String aName;
	String aColor;
	int aLeg;
	int aSpeed;
	String aCry;
	
	// 생성자 : 필드의 기본 값을 입력하는 생성자
	
	Animal (String aName, String aColor, int aSpeed, int aLeg, String aCry ){
		this.aName = aName;
		this.aColor = aColor;
		this.aLeg = aLeg;
		this.aSpeed = aSpeed;
		this.aCry = aCry;
	}
	
	// 메서드 - 필드의 모든 값을 출력해 주는 메서드 
	void printAll () {
		System.out.println("동물의 이름 : " + aName);
		System.out.println("동물의 색 : " + aColor);
		System.out.println("동물의 속도 : " + aSpeed);
		System.out.println("동물의 다리 수 : " + aLeg);
		System.out.println("동물의 울음 소리 : " + aCry);
		
	}
	
	
	// 메서드 - : int abc () { 팔 다리 개수 + 속도 return }   
	int abc (int aLeg, int aSpeed) {
		int sum;
		sum = aLeg + aSpeed;
		
		return sum;
	}
	
	
}


public class Object_DefinitionPrac {

	public static void main(String[] args) {
		// 객체 생성 및 테스트
		
		// 호랑이, 독수리, 사자, 개
		
		Animal tiger = new Animal("Tiger", "Orange", 56, 4, "ROAR");
		Animal eagle = new Animal("Eagle", "Black", 190, 2, "???");
		Animal lion = new Animal("Lion", "Yellow", 50, 4, "ROAR");
		Animal dog = new Animal("Dog","Many", 50, 4, "WOOF");
		
		tiger.printAll();
		eagle.printAll();
	}

	
}
