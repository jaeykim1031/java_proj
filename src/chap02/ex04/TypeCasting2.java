package chap02.ex04;

public class TypeCasting2 {

	public static void main(String[] args) {

		int kor = 77;
		int eng = 88;
		int math = 98;
		
//		합계
		System.out.println("합계 : " + kor + eng + math);
		
//		평균
		System.out.println("평균 : " + (double)(kor + eng + math) / 3);
		System.out.println("평균(캐스팅 하지 않음) : " + (kor + eng + math) / 3);
		
		int sum = kor + eng + math;
		double avg = ((double) sum ) / 3; // sum을 double로 업캐스팅 후 3으로 나눔 
		
		double avg1 = sum / 3;	 // 정수 / 정수 -> 정수 -> double
		double avg2 = sum / 3.0; // sum이 자동적으로 업캐스팅 됨 
		
		System.out.println("평균 : " + avg);
		System.out.println("평균(캐스팅 하지 않음) : " + sum / 3);
		
		System.out.println("avg1 : " + avg1);
		System.out.println("avg2 : " + avg2);
		
	}

}
