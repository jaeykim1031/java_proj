package lab.chap04;

import java.util.Scanner;

public class Switch_StatementPrac {

	public static void main(String[] args) {
		/*
		 * 스캐너로 정수를 입력받고 
		 * 1 -> 금메달을 획득했습니다 
		 * 2 -> 은메달을 획득했습니다
		 * 3 -> 동메달을 획득했습니다
		 * 
		 * 그 외 -> 1 ~ 3의 정수를 입력하세요 
		 * 
		 * switch 문으로 구현
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int rank;
		
		System.out.println("자신의 순위를 입력해주세요. ");
		rank = sc.nextInt();
		
		System.out.println("========switch 문으로 출력=======");
		switch (rank) {
		case 1: case 10: case 100:
			System.out.println("금메달을 수상하셨습니다. ");
			break;
		case 2: case 20: case 200:
			System.out.println("은메달을 수상하셨습니다. ");
			break;
		case 3: case 30: case 300:
			System.out.println("동메달을 수상하셨습니다. ");
			break;

		default: 
			System.out.println("메달을 수상하지 못하셨습니다. ");
		}
		
		System.out.println("========if 문으로 출력=======");
		
		if (rank == 1 || rank == 10 || rank == 100 ) {
			System.out.println("금메달을 수상하셨습니다. ");
		}else if (rank == 2 || rank == 20 || rank == 200) {
			System.out.println("은메달을 수상하셨습니다. ");
		}else if (rank == 3 || rank == 30 || rank == 300) {
			System.out.println("동메달을 수상하셨습니다. ");
		}else{
			System.out.println("메달을 수상하지 못하셨습니다. ");

		}
		
		

	}

}
