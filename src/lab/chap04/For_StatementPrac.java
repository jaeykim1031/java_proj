package lab.chap04;

public class For_StatementPrac {

	public static void main(String[] args) {
		// 구구단 7단만 출력

		for ( int i = 1; i < 70 ; i++) {
			if (i % 7 == 0) {
				System.out.println(" 7 * " + i / 7 + " = " + i );
			}
		}
		
		for ( int i = 1; i < 10 ; i++) {
			System.out.println(" 7 * " + i + " = " + i * 7 );
		}
		
		for (int i = 1, j = 7 ; i < 10 ; i++) {
			System.out.printf("%d * %d = %d\t" , j, i, j * i );
		}
	}

}
