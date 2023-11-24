package chap04.ex04;

public class While_Statement {
	public static void main(String[] args) {
		/*
		 * 초기값
		 * while (조건) {
		 * 		조건문이 true 일 때 구문;
		 * 
		 * 		증감식 
		 * }
		 */
		
		System.out.println("===== for =====");
		
		for (int i = 0 ; i < 10 ; i++ ) {
			System.out.println("for i : " + i);
		}
		
		System.out.println("===== while =====");
		int i = 0;
		while (i < 10) {
			System.out.println("while i : " + i);
			i++;
		}
		
	}
}
