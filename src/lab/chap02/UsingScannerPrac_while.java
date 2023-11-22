package lab.chap02;

import java.util.Scanner;

public class UsingScannerPrac_while {
	public static void main(String[] args) {
		
		String stu;		// 학생
		
		int stuNum;
			stuNum = 1;
		
		int kor;		
		int eng;		
		int math;		
		
		Scanner sc = new Scanner(System.in);
			
		while(stuNum < 4) {
			System.out.printf("%d번 학생의 이름을 입력하시오 >>> \n", stuNum);
				stu = sc.next(); 
			System.out.printf("%d번 학생의 국어 점수를 입력하시오 >>> \n", stuNum);
				kor = sc.nextInt();
			System.out.printf("%d번 학생의 영어 점수를 입력하시오 >>> \n", stuNum);
				eng = sc.nextInt();
			System.out.printf("%d번 학생의 수학 점수를 입력하시오 >>> \n", stuNum);
				math = sc.nextInt();
			int sum;
				sum = kor + eng + math;
			double avg;
				avg = sum / 3.0;	
				
			System.out.printf("%s의 모든 점수의 합계는 %d점이고 평균은 %f점입니다. \n", stu, sum, avg  );
				
			stuNum++;
		}
		
	}

}
