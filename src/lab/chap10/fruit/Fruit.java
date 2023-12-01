package lab.chap10.fruit;

public class Fruit extends Fruit_Test {
	String name;	// 과일 이름	
	int cnt; 		// 개수 
	int price;		// 가격 
	
	// method 
	void totalPrice () {
		System.out.println( name + " 의 총 가격은 : " + (cnt * price) ); 	
	}
	
	
	
}
