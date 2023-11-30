package chap17.ex02;

import java.util.List;

public class Method {
	
	// 1. 필드
	List<Student> aList;		// import list 필요함 
	int[] arr; 
	
	// 2. 기본 생성자 ( Method(){} ) 생략됨 
	
	// 3. 메서드 : 인풋 -(프로그램)- > 출력, 객체 생성 후 메서드 호출
	
	
	void arrayListOut (List<Student> aList) {
		// aList를 인풋 받아서 Student 객체를 꺼내서 모든 필드의 내용 출력
		
		for (int i = 0 ; i < aList.size() ; i++) {
			Student s = aList.get(i);
			System.out.println(s);
		}
		
	}
	
	//					 인풋 : 배열, 정수   출력 : 인풋 받은 배열에서 정수로 들어오는 값의 개수
	void arrayOutPut (int[] arr1 , int i ) {
		
		int cnt = 0;
		for ( int j = 0 ; j < arr1.length ; j++) {
			
				if (arr1[j] == i) { 
					cnt++;
			}
		}
		System.out.println("입력된 정수는 : , " + i + "배열에 " +  cnt + "개 존재 합니다");
	}
	
	// List<Student> 객체를 받아서 각 객체의 이름, 주소 출력
	void nameAddr (List <Student> aList) {
		
		for (int i = 0; i < aList.size() ; i++) {
			Student s = aList.get(i);
			System.out.println("이름 : " + s.getName() + " 주소 : " + s.getAddr());	
		}
	
	}
	// List<Student> 객체를 받고 꺼내서 메소드 호출 sumAvg()
	void all (List<Student> aList) { 
		for ( int i = 0; i <aList.size();i++) {
			Student s = aList.get(i);
			s.sumAvg();
		}
		
	}
	void sMethod (Student s){
		s.sumAvg();
	}
	 
	
	
}

