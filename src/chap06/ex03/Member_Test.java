	package chap06.ex03;
	
	public class Member_Test {
	
		public static void main(String[] args) {
			// 같은 패키지 안에서는 import 필요 없음.
			// 접근 제어자가 default 이상이어야 함. 
			
			// 1. 객체 생성
			Member m1 = new Member();
			Member m2 = new Member();
			Member m3 = new Member();
			Member m4 = new Member();
			
			// 2. 객체의 필드 접근		<- DB에 값을 불러옴. 자바 객체에 필드의 값을 주입
				// 입력 : setter 로 입력
			
			m1.setIdx(1);
			m1.setId("tezca");
			m1.setPw("1234");
			m1.setPhone("010-1111-1111");
			m1.setName("홍길동");
			m1.setYear(1998);
			m1.setMonth(9);
			m1.setDay(21);
			m1.setAddr("서울");
			
			m2.setIdx(2);
			m2.setId("tlipoca");
			m2.setPw("5678");
			m2.setPhone("010-2222-2222");
			m2.setName("길홍동");
			m2.setYear(1928);
			m2.setMonth(4);
			m2.setDay(3);
			m2.setAddr("부산");
			 
			m3.setIdx(3);
			m3.setId("33ffer");
			m3.setPw("6357");
			m3.setPhone("010-3333-4444");
			m3.setName("동길홍");
			m3.setYear(1928);
			m3.setMonth(5);
			m3.setDay(2);
			m3.setAddr("대구");
			
			m4.setIdx(4);
			m4.setId("ytlod44");
			m4.setPw("57645");
			m4.setPhone("010-4444-4444");
			m4.setName("호일대");
			m4.setYear(1298);
			m4.setMonth(5);
			m4.setDay(9);
			m4.setAddr("전주");
			
			// 3. 필드의 값 출력 : getter
			System.out.println(m1.getIdx());
			System.out.println(m1.getId());
			System.out.println(m1.getPw());
			System.out.println(m1.getPhone());
			System.out.println(m1.getName());
			System.out.println(m1.getYear());
			System.out.println(m1.getMonth());
			System.out.println(m1.getDay());
			System.out.println(m1.getAddr());
			
			// 4. 객체 자체를 출력시 객체의 heap의 주소가 출력
					// 오버라이딩 되어있지 않으면 heap 주소가 출력
			System.out.println(m1); // chap06.ex03.Member@5e91993f - 5e91993f : heap의 주소
			System.out.println(m2); // chap06.ex03.Member@1c4af82c
			System.out.println(m3); // chap06.ex03.Member@379619aa
			System.out.println(m4); // chap06.ex03.Member@cac736f
	
			
			// 5. 객체를 배열 -> 컬렉션 (ArrayList)에 저장
			
			System.out.println("======== for문 출력 =======");
	
			
			Member[] arr = new Member[10];
			
			arr[0] = m1;
			arr[1] = m2;
			arr[2] = m3;
			arr[3] = m4; 			// 객체를 배열에 할당
	
			// 6. 배열의 정보를 꺼내서 출력
			
			System.out.println("======== 배열 출력 =======");
	
			
			for (int i = 0 ; i < arr.length ; i++ ) {
				Member mem1 = arr[i];
				
				System.out.println(mem1);
			}
			
			
		}
	
	}
