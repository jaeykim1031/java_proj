package lab.chap03;

import java.util.Scanner;

public class ConvertType {

	public static void main(String[] args) {
		// String 으로 인풋 받은 값을 정수/실수 타입으로 변환해서 출력
		/* Integer.parseInt(변수);	변수 : 문자열로 된 정수
		 * Double.parseDouble(변수);		: 문자열로 된 실수
		 */
		Scanner sc = new Scanner(System.in);
		
		String kor;
		String eng;
		String math;
		
		System.out.println("국어 점수, 영어 점수, 수학 점수를 차례대로 입력해주세요 >>> ");
		kor = sc.next();
		eng = sc.next();
		math = sc.next(); 
		
		/*
		int kor;
		int eng;
		int math;
		
		System.out.println("국어 점수, 영어 점수, 수학 점수를 차례대로 입력해주세요 >>> ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();   
		 */
		
		int sum;
		double avg;
		
		sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
		avg = sum / 3.0;
		
		System.out.println("모든 점수의 합 : " + sum);
		System.out.println("모든 과목의 평균 : " + avg);
	
	}

}
