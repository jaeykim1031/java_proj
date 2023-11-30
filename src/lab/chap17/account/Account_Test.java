package lab.chap17.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account_Test {

	public static void main(String[] args) {
		
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
//		List <Account> aList = new ArrayList<>();
		int select; 
		String name; 
		int account;
		int money;
				
out:		do {      
			System.out.println("===============================");
			System.out.println(" 0. 계좌 이름, 번호 등록 ");
			System.out.println(" 1. 입금 ");
			System.out.println(" 2. 출금 ");
			System.out.println(" 3. 종료 ");
			System.out.println("===============================");
			System.out.println(" 숫자를 입력하시오 ");
			select = sc.nextInt();

			
			switch(select) {
			case 0:
				// 계좌가 이미 있다면 메세지 출력 후 break;
				if (a.name != null || a.account != 0) {
					System.out.println("이미 계좌가 있습니다.");
					break;
				}
				System.out.println("계좌 이름을 등록 하시오 ");
				name = sc.next();
				System.out.println("계좌번호를 입력하시오");
				account = sc.nextInt();
				
				a.setName(name);
				a.setAccount(account);		// setter 사용
				
				System.out.println("등록되었습니다.");
				break;
				
			case 1:
				if (a.name == null || a.account == 0) {
					System.out.println("계좌가 등록되지 않았습니다");
					break;
				}
				System.out.println("입금을 선택하셨습니다, 입금액을 입력하시오 ");
				
				money = sc.nextInt();
				a.deposit(money);
				break;
				
			case 2:
				if (a.name == null || a.account == 0) {
					System.out.println("계좌가 등록되지 않았습니다");
					break;
				}
				System.out.println("출금을 선택하셨습니다, 출금액을 입력하시오 ");

				money = sc.nextInt();
				a.withdraw(money);
				break;
				
			case 3:
				break out;
			}
			
		}while (true); 

		System.out.println("프로그램 종료");
	}

}
