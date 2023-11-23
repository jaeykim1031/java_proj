package lab.chap04;

import java.util.Scanner;

public class If_StatementPrac2 {
	public static void main(String[] args) {
		/*
		 * 스캐너로 자신의 자산을 나타내는 정수 값을 입력 받기. 
		 *  if, else if 사용 
		 *  
		 * 0 ~ 1000만원 : "버스나 지하철"
		 * 1000 ~ 10000만원 : 택시
		 * 10000 ~ : 비행기
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		System.out.println("자신의 자산을 입력해 주세요 ");
		money = sc.nextInt();
		
		if (money > 10000) {
			System.out.println("비행기를 타고 다님");
		}else if (money > 1000) {
			System.out.println("택시를 타고 다님");
		}else if (money >= 0) {
			System.out.println("버스나 지하철을 타고 다님");
		}else {
			System.out.println("양수 값을 입력하세요");
		}
			
		
		
		

		
	}
}
