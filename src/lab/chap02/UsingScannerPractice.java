package lab.chap02;

import java.util.Scanner;

public class UsingScannerPractice {

	public static void main(String[] args) {
		// @@실습@@
//			과제 : 학생 총 3인의 점수 합계와 평균을 구하시오
		
		
		String stu;		// 학생
		
		int kor;		// 국어 점수
		int eng;		// 영어 점수
		int math;		// 수학 점수
		
		// 평균
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("학생 1의 이름을 입력하시오 >>> ");
		stu = sc.next(); // 콘솔에서 인풋 대기 
		System.out.println("학생 1의 국어 점수를 입력하시오 >>> ");
		kor = sc.nextInt();
		System.out.println("학생 1의 영어 점수를 입력하시오 >>> ");
		eng = sc.nextInt();
		System.out.println("학생 1의 수학 점수를 입력하시오 >>> ");
		math = sc.nextInt();
		
		int sum1; 		// 점수의 합계
			sum1 = kor + eng + math;
		double avg1;
			avg1 = sum1 / 3.0;
		
		
		System.out.printf("%s의 모든 점수의 합계는 %d점이고 평균은 %f점입니다. \n", stu, sum1, avg1  );
		
		System.out.println("학생 2의 이름을 입력하시오 >>> ");
		stu = sc.next();
		System.out.println("학생 2의 국어 점수를 입력하시오 >>> ");
		kor = sc.nextInt();
		System.out.println("학생 2의 영어 점수를 입력하시오 >>> ");
		eng = sc.nextInt();
		System.out.println("학생 2의 수학 점수를 입력하시오 >>> ");
		math = sc.nextInt();
		
		int sum2; 		// 점수의 합계
			sum2 = kor + eng + math;
		double avg2;
			avg2 = sum2 / 3.0;
			
		System.out.printf("%s의 모든 점수의 합계는 %d점이고 평균은 %f점입니다. \n", stu, sum2, avg2  );
		
		System.out.println("학생 3의 이름을 입력하시오 >>> ");
		stu = sc.next();
		System.out.println("학생 3의 국어 점수를 입력하시오 >>> ");
		kor = sc.nextInt();
		System.out.println("학생 3의 영어 점수를 입력하시오 >>> ");
		eng = sc.nextInt();
		System.out.println("학생 3의 수학 점수를 입력하시오 >>> ");
		math = sc.nextInt();
		
		int sum3; 		// 점수의 합계
			sum3 = kor + eng + math;
		double avg3;
			avg3 = sum3 / 3.0;
			
		System.out.printf("%s의 모든 점수의 합계는 %d점이고 평균은 %f점입니다. \n", stu, sum3, avg3  );
	}

}
