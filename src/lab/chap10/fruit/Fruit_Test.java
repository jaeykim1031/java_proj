package lab.chap10.fruit;

import java.util.ArrayList;
import java.util.List;

public class Fruit_Test {

	public static void main(String[] args) {
		/*
		 * 1. 자식 객체 생성 후
		 * Apple("사과", 30, 5000) Fruit 타입으로 정의
		 * Banana("바나나", 44, 6000) 
		 * Strawberry("딸기", 55 , 7000) 
		 * 
		 * 2. ArrayList 에 담기
		 *  
		 * 3. for 로 출력, totalPrice()로 호출 시 Override 된 객체 
		 * 
		 * 4. 출력 : " ***의 전체 가격은 : %%% 입니다 "
		 * 
		 * 	자식 객체를 생성하면서 부모 타입으로 지정하면, 배열이나 클래스에 동일한 타입으로 변경
		 * 
		 */
		
		// 1. 자식 객체를 생성하면서 부모 타입으로 지정함 - 배열, 컬렉션 동일한 타입으로 저장
								// ↓ 이 부분 (값 입력) 틀림
		Fruit f1 = new Apple("사과", 30, 5000);			// f1: Fruit, Apple
		Fruit f2 = new Banana("바나나", 44, 6000);		// f2: Fruit, Banana
		Fruit f3 = new Strawberry("딸기", 55 , 7000); 	// f3: Fruit, Strawberry	
		
		Apple a1 = new Apple("ewaeae", 4325, 1231); // -> 자동으로 업캐스팅(Fruit) 되어서 들어감 (자식 클래스)
		
		List<Fruit> aList = new ArrayList<>();
		
		aList.add(f1);
		aList.add(f2);
		aList.add(f3);
		aList.add(a1);
		
		for ( int i = 0 ; i< aList.size() ; i++ ) {
			aList.get(i).totalPrice();	
		}
		
		// 중요 *** 다형성 : 부모의 메소드를 호출할 때, 자식 클래스에서 오버라이드 된 메서드로 출력 ***

	}

}
