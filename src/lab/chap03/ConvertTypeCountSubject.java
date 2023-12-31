package lab.chap03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class ConvertTypeCountSubject {
	public static void main(String[] args) {
		/*
		 * 1. 과목을 입력해야함 <- 이게 어렵다.
		 * 2. 과목의 개수를 따로 저장해 둬야함(전역변수?)
		 * 2-1. 동적할당? 
		 * 3. 과목 입력 종료 지점을 지정해야함 
		 * 3-1. 숫자 입력 예외 처리
		 * 4. 그 다음으로는 똑같은 평균내기.
		 * 
		 */
		
	// GPT Assisted //
	// Scanner 객체 생성
	Scanner scanner = new Scanner(System.in);

	// 과목과 점수를 저장할 리스트 
	List<String> subjects = new ArrayList<>();
	List<Integer> scores = new ArrayList<>();

	// 각 과목과 점수 입력
	while (true) {
		System.out.print("과목명을 입력하시오 (완료시 '끝' 입력)\n");
		String subject = scanner.next();

		// '끝' 입력시 루프 종료 
		if (subject.equals("끝")) {
			break;
		}

		try{
			System.out.print(subject + "의 점수를 입력하시오: \n");
			int score = scanner.nextInt();

		// 점수 입력에 대한 엣지 케이스
			if (score >= 0) {
				subjects.add(subject);
				scores.add(score);
			} else{
				System.out.println("유효하지 않은 점수입니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
			scanner.next(); // 입력 버퍼를 비움
		}

	}
	
	// 점수의 평균 계산
	double avg = calculateAverage(scores);

	// 출력
	System.out.println("입력한 과목과 점수:");
	for(int i = 0; i < subjects.size(); i++){
		System.out.println(subjects.get(i) + ": " + scores.get(i));
	}

	System.out.println( "평균 점수: " +	avg );

	// Scanner 객체 닫음 (권장됨)
	scanner.close();		
		
	}

	// 평균 계산을 위한 메서드
	private static double calculateAverage(List<Integer> scores){
		if (scores.isEmpty()) {
				return 0.0; // 과목이 없다면 평균 0 (엣지 케이스/예외 처리)
		}
		int sum = 0;
		for (int score : scores) { // 향상된 for loop
			sum += score;
		}
		
		return (double) sum / scores.size();
	}
}