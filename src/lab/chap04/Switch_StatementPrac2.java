package lab.chap04;

import java.util.Scanner;

public class Switch_StatementPrac2 {

	public static void main(String[] args) {
		/*
		 * **월을 입력하여 해당 월은 **일까지 있습니다
		 *  
		 *  
		 * 30일 까지 있는 달 : 4, 6, 9, 11 
		 * 31일 까지 있는 달 : 1, 3, 5, 7, 8, 10, 12
		 * 28일 까지 있는 달 : 2
		 * 
		 * 스캐너로 **월 받음, 그 달의 마지막 일을 출력
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int month;
		int day = 30; // 특수 조건 
		
		System.out.println("원하는 달을 입력하시오 ");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day += 1;
			System.out.printf("입력하신 %d월은 %d일 까지 있습니다. \n", month, day);
			
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.printf("입력하신 %d월은 %d일 까지 있습니다. \n", month, day);
			
			break;
			
		case 2:
			day -= 2;
			System.out.printf("입력하신 %d월은 %d일 까지 있습니다. \n", month, day);
			
			break;
			
		default:
			System.out.println("1부터 12사이의 값을 입력하십시오. ");
	}
	}
}
