package chap17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// ctrl shift o 

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		 * 배열 : 하나의 변수에 많은 값 저장 - 최대 크기 있음. 인덱스 존재(0 시작)
		 * 		 동일한 타입의 자료를 저장 - 기본/참조 자료형
		 * 			int[] arr1 = new int[50];
		 * 
		 * 	- 단점 : 배열의 중간값을 삭제/추가할 경우, 자동으로 빈 자리가 생기지 않음
		 * 			배열의 크기가 고정되며 수정이 불가함
		 * 
		 * 컬렉션(프레임워크) : 배열의 단점을 보완하여 만든 클래스 
		 * 			- List(인터페이스) : ArrayList, LinkedList, Vector
		 * 				<메서드 선언>	:	<메서드 구현>
		 * 			- Set(인터페이스) : HashSet, LinkedHashSet, TreeSet
		 * 						-> 중복된 값을 넣지 못함
		 * 			- Map(인터페이스) : HashMap, ...
		 * 
		 * 	- 장점 : 값을 제한 없이 저장할 수 있다. - 방 크기 선언하지 않음
		 * 			중간값을 수정하면 동적으로 크기 조절함 
		 * 			제너릭 타입으로 지정
		 */
		
		// 배열 : 
		String[] arr1 = new String[] {"가","나","다","라","마","바","사"};
		
		for (int i = 0 ; i < arr1.length ; i++){
			System.out.print(arr1[i] + ", ");
		}
		System.out.println();
		System.out.println(arr1.length);
		
		arr1[2] = null;
		arr1[3] = null;
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1.length);
		
		// 컬렉션 :
			
		// 1. ArrayList 선언
//					: List - 인터페이스 - 메서드를 선언 
//					: ArrayList - List 인터페이스를 구현한 구현체, 선언만 된 메서드를 구현한 구현체
//					: import 필요
		
		List<String> aList1 = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		ArrayList<String> aList3 = new ArrayList<>();
		
		// 메소드를 사용하여 값을 넣고, 삭제함
		// aList.add("a") , aList.remove("b")
		// aList.size() : 공간 개수를 출력
		
		
		List<String> aList = new ArrayList<String>();

		// 공간의 크기 출력
		System.out.println(aList.size());
		
		// 값 입력
		aList.add("가");
		System.out.println(aList.size());

		// 공간 값 출력 
		System.out.println(aList);
		
		// 값 추가 입력
		aList.add("나"); 
		aList.add("다"); 
		aList.add("라"); 
		aList.add("마"); 
		aList.add("바"); 
		aList.add("사"); 
		
		// 객체 자체를 출력
		System.out.println(aList);
		System.out.println(aList.size());
		
		// 값 삽입 -> 공간 크기를 자동으로 확장 후 삽입함
		aList.add(3, "hi");
		System.out.println(aList);
		System.out.println(aList.size()); 	// 1 증가
		
		// 값 삭제 
		aList.remove(3);		// index 3 의 값 삭제. 자동 최적화
		System.out.println(aList);
		System.out.println(aList.size());
		
		aList.remove("라");		// 값을 삭제 
		System.out.println(aList);
		System.out.println(aList.size());
		
		// 특정 공간의 값을 출력 : .get(index);
		System.out.println("====================");
		
		for ( int i = 0 ; i < aList.size() ; i++ ) {
			System.out.println(aList.get(i));
		}

		// 배열의 모든 값 출력 : Arrays.toString(arr);
		// 컬렉션은 객체 자체를 출력 : toString() 메서드가 재정의 됨
		
		System.out.println(aList);

		System.out.println("====================");
		
		// wrapper class : 기본 자료형을 객체로 만들어 놓은 클래스 
		
		// boolean -> Boolean
		// byte -> Byte
		// short -> Short
		// int -> Integer
		// long -> Long
		// double -> Double
		// char -> Character
		
		
		List<Integer> aList4 = new ArrayList<>();
		
		for (int i = 0 , a = 1 ; i < 100 ; i++) {
			aList4.add(a*10);
			a++;
		}
		
		for (int i = 0 ; i < aList4.size() ; i++ ) {
			System.out.println(aList4.get(i));
			
		}
	}

}
