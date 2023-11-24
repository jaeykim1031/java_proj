package chap04.ex03;

public class For_Statement2 {

	public static void main(String[] args) {
		
		// 초기식과 증감식에 여러 변수가 존재 할 수 있다
		for (int i = 0, j = 0 ; i <= 1000 ; i += 3 , j++ ) {
			System.out.println("i : " + i + "\t j : " + j);
		}
		
		for (int i = 1 ; i <= 100 ; i++ ) {
			if ( i % 3 == 0 && i % 6 == 0 && i % 9 == 0) {
				System.out.println( i );
			}
		}
		
		
	}

}
