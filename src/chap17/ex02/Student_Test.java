package chap17.ex02;

import java.util.ArrayList;
import java.util.List;

public class Student_Test {

	public static void main(String[] args) {
		// 1. Student 객체 생성
		
		Student s1 = new Student();			// 기본 생성자 
		Student s2 = new Student("abc");
		Student s3 = new Student(3241);
		Student s4 = new Student("defg", "seoul");
		Student s5 = new Student("eiuwhe", "seoul", 4686);
		
		// 2. 객체를 ArrayList<Student>에 저장 <- 배열
				//		< 타입 > : 제너릭, 객체형 타입 적용되어야 함

		List<Student> aList = new ArrayList<>();
				
		// aList에 <Student> 객체 저장 
		aList.add(s1);
		aList.add(s2);
		aList.add(s3);
		aList.add(s4);
		aList.add(s5);
		
		System.out.println("========================");
		
		int[] arr = new int[] { 1, 2, 4, 4, 6, 78, 5, 3, 3};
		
		// 1. Method (클래스, 타입) - > 객체 생성
		 
		Method m = new Method();
		
		m.arrayListOut(aList);				// aList의 값 다섯 개를 받아서 출력
		
		m.arrayOutPut(arr, 0);
		
		m.arrayListOut(aList);
		
		aList.add(new Student("abc", 53, 97, 56));
		aList.add(new Student("eaw", 32, 89, 63));
		aList.add(new Student("bbtrt", 17, 25, 77));
		
		m.all(aList);
		
		System.out.println("---------------------------------");
		
		m.sMethod(new Student("thtrh", 41, 14, 32));
		
		
		
		

	}

}
