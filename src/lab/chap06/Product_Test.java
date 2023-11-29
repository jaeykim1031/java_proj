package lab.chap06;

public class Product_Test {

	public static void main(String[] args) {
		
		// 1. Product 객체 4개 생성.
		// 2. setter를 사용해서 객체의 필드 값 주입 
		// 3. 배열 arr, index 10, 각 공간에 4번의 객체를 배열 공간에 할당.
		// 4. 배열의 값을 꺼내서 Product 변수 p에 담고 출력 (for)
		
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		
		p1.setIdx(1);
		p1.setProName("lego");
		p1.setQty(14);
		p1.setYear(2022);
		p1.setProColor("red");
		
		p2.setIdx(2);
		p2.setProName("bottle");
		p2.setQty(441);
		p2.setYear(2023);
		p2.setProColor("blue");
		
		p3.setIdx(3);
		p3.setProName("keyboard");
		p3.setQty(314);
		p3.setYear(2021);
		p3.setProColor("black");
		
		p4.setIdx(4);
		p4.setProName("mouse");
		p4.setQty(1445);
		p4.setYear(2023);
		p4.setProColor("white");
		
		p5.setIdx(5);
		p5.setProName("wqeqwe");
		p5.setQty(445);
		p5.setYear(2025543);
		p5.setProColor("ggtsrtgs");
		
		Product[] arr = new Product[10];
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		for ( int i = 0 ; i< arr.length ; i++ ) {
			if (arr[i] == null) continue;
			Product pro1 = arr[i];
			
			System.out.println(pro1);
		}
		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);
		
	}
	
		



}		





