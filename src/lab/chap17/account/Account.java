package lab.chap17.account;

public class Account {

	String name;				// 이름
	int	account;				// 계좌번호
	int	money = 10000;			// 잔고 
	
	Account() {}
	
	Account(String name, int account) {this.name = name; this.account = account;}
	
	 void deposit (int money) {		// 입금 - ***원 입금되었습니다. 계좌 잔고는 %%%원 입니다
		 this.money = this.money + money; // this.money = 필드에 있는 money 값
		 
		 System.out.println( money + "원 입금되었습니다");	 
		 System.out.println( name + "님의 계좌 잔고는" + this.money + "원 입니다");
		 
	}
	
	 void withdraw (int money) {		// 출금
		 this.money = this.money - money;
		 
		 System.out.println( money + "원 출금되었습니다. ");
		 System.out.println(name + "님의 계좌 잔고는" + this.money + "원 입니다");
	}

	public void setName(String name) {
		if ( name != null )
		this.name = name;
	}

	public void setAccount(int account) {
		this.account = account;
	}
	
}
 