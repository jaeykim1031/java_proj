package lab.chap10.fruit;

public class Apple extends Fruit {

	// 부모의 필드가 상속됨 
	
	Apple () {} 		// <- 기본 생성자 필요
	
	Apple(String name, int cnt, int price) {
		// super(); : 생략됨
		super.name = name;
		super.cnt = cnt;
		super.price = price;
	}
	
	@Override
	void totalPrice() {			// 코드 작성 totalPrice = cnt * price
		
		// 출력 : *** 의 전체 가격은 : &&& 입니다.
		System.out.println(super.name + "의 전체 가격은 : " + ( super.cnt * super.price ) + " 입니다");
	}
}
