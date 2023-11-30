package lab.chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_ArrayListPrac {
	public static void main(String[] args) {
		/*
		 * 배열 : arr - 100번째 공간까지, 10의 배수만, 후 출력 ( for, Arrays.toString )
		 *  
		 * 컬렉션 : aList - 20의 배수 100번째 공간까지만
		 *  
		 */
		
		// 배열 
		
		int arr[] = new int [100];		// index : 0 ~ 99 
		
		for ( int i = 0, a = 1 ; i < arr.length ; i++ ) {
			arr[i] = a*10;
			a++;
		}
		
		// 배열 출력 
		for( int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		System.out.println("========================");

		
		for (int k : arr) {
			System.out.print(k + ", ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
	
		
		// 컬렉션 : 제너릭 타입 <Integer> 으로 선언
		
		List<Integer> aList = new ArrayList<Integer/* <- 생략 가능 */>();
		ArrayList<Integer> aList2 = new ArrayList<>();
		
		// 입력 
		// .add(값) : (가장 많이 씀) 마지막 공간에 값 추가
		// .add(index, 값) : 지정한 위치에 값 추가
 		// .size : 공간 개수
		// .remove(index/값) : 삭제
		// .get(index) : 출력
				
		for ( int i = 0, a = 0 ; i < 100 ; i++ ) { 		// index 0 ~ 99
			a += 20;
			aList.add(a);
		}
		
		System.out.println("컬렉션 공간의 크기 : " + aList.size());
		
		for ( int i = 0 ; i < aList.size() ; i++) {
			System.out.print(aList.get(i) + " , ");
		}
		
		
	}
}
