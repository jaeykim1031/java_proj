package chap06.ex03;

public class Member {	// 회원 정보를 담은 클래스
	
	/*
	 * 접근 제어자 : 캡슐화, 필드/메소드/클래스에 보안 기능, 필드/메소드/클래스 앞에 붙음
	 * 			- 클래스 : public, default
	 * 			- 필드 : public, protected, default(생략), private
	 * 			- 메서드 : public, protected, default(생략), private
	 * 
	 * 			- 생성자 : 멤버 선언 외에도 생성자의 매개변수 앞에 접근 제어자를 명시할 수 있다. 
	 * 					접근 제어자가 붙은 생성자 매개변수는 같은 이름의 속성으로 선언되고, 해당 매개변수의 인자는 암묵적으로 인스턴스에 할당된다
	 * 
	 * 		public : 다른 패키지에서 접근 가능 
	 * 		protected : '상속 관계에 있을 때' 다른 패키지에서 접근 가능 
	 * 		default(주로 생략됨) : 같은 패키지에서 접근 가능 
	 * 		private : 외부 클래스에서 수정 불가
	 * 
	 * 
	 * 
	 * 
	 */
	
	// 1. 필드 : 외부 클래스에서 직접 접근 할 수 없게 함(private).
	
	private long idx;		// 회원의 번호(자동으로 증가)
	private String id; 		// ID
	private String pw;		// PW
	private String name;	// 회원의 이름
	
	private int year;		// 1900 ~ 2999
	private int month;		// 1 ~ 12
	private int day;		// 1 ~ 31	회원의 생년월일
	
	private String phone;	// 전화번호
	private String addr;	// 주소
	
	// private : 접근 제어자
	
	// 2. 생성자
	
	protected Member () {}

	
	// 3. getter / setter 를 사용해 필드의 값 출력 / 입력

	
	public long getIdx() {
		return idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	// toString() 메소드 Overriding :
			// 모든 자바의 클래스는 Object 클래스를 상속받는다, Object 클래스의 필드와 메서드를 사용할 수 있다 
			// Overriding : 부모 클래스의 메서드를 자식 클래스에서 재정의하여 사용함
			// Overloading : 메소드 이름은 동일하고, 인풋 매개변수에 개수나 타입에 따라 식별
	
	// toString() : Object 클래스의 메서드, 객체 자체를 출력시 그 객체의 필드 값을 출력 - 원하는 출력이 나오지 않음 
	//				-> toString() 메서드의 재정의 필요
	
	@Override
	public String toString() {
		return "Member [idx=" + idx + ", id=" + id + ", pw=" + pw + ", name=" + name + ", year=" + year + ", month="
				+ month + ", day=" + day + ", phone=" + phone + ", addr=" + addr + "]";
	}
	

	
}
