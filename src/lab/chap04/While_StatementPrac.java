package lab.chap04;

public class While_StatementPrac {
	public static void main(String[] args) {
		/*
		 * 1000부터 1까지 5씩 감소하면서 출력시키기 : for, while 으로 출력
		 */
		
		// for 
		for (int i = 1000; i >= 1 ; i -= 5 ) {
			System.out.println(" i : " + i);
		}
		
				System.out.println("===========================");

		// while
		int i = 1000;
		while (i >= 1 ) {
			System.out.println(" i : " + i);
			i -= 5;
		}
	}
}
