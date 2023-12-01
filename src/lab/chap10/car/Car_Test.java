package lab.chap10.car;

import java.util.ArrayList;
import java.util.List;

public class Car_Test {
	
	public static void main(String[] args) {

		// 자식 객체를 생성하면서 부모 타입으로 지정 후 부모의 메서드 호출시 override 된 자식의 메서드가 작동
		// car.run() - 다형성
		
		Car c1 = new H_Car();
		Car c2 = new K_Car();
		Car c3 = new S_Car();
		
		// 부모의 run 메소드 호출 시, 자식이 오버라이딩(재정의) 된 메서드 작동됨
		c1.run();
		c2.run();
		c3.run();
		
		// ArrayList<Car>
		List<Car> aList = new ArrayList<>();
		
		aList.add(c1);
		aList.add(c2);
		aList.add(c3);
		
		System.out.println("========================");
		// for 사용 
		
		for ( int i = 0 ; i< aList.size() ; i++ ) {
				aList.get(i).run();				// aList.get(0) = c1
												// aList.get(1) = c2
												// aList.get(2) = c3
		}
		
		
	}
}
