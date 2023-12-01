package chap10.ex01;

public class Human {		// 부모 클래스 (super class)
	
	// 기본 생성자 생략됨
	Human() {
		super();		// Object 클래스(최상위)가 호출됨, Java.lang.Object
	}
	
	// 생성자
	Human (String name, int age){
		super(); 		// 생략 됨 
		this.name = name;
		this.age = age;
	}
	
	// 필드
	String name;
	int age;
	
	// 메서드 
	void eat() {
		System.out.println("모든 사람은 학교에 간다. ");
	}
	
	void stuInfo() {
		System.out.println("모든 사람은 잔다 ");
	}
	
	
	 // 1. Student 겍체 생ㅅㅇ
	// Studenst s1 : 메모리에 로드 됨
	  Student s1 = new Student();
	  
	  
	  // 2. 
	  // Student 클래스, 필드, 내성
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
