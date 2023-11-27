package chap05.ex02;

public class Array_Definition2 {
	public static void main(String[] args) {
		// 배열 : 방의 개수를 선언 해야 함, 개수 수정 불가 
				// 배열 인덱스에 들어갈 자료형을 선언해야 함
		
		// 실수 배열 
		double[] arr1 = new double[10]; // 인덱스 0 ~ 9번까지 
		
//		System.out.println(arr1[10]);	<- 런타임 오류
		
				arr1[0] = 10.1;
				arr1[1] = 11.1;
				arr1[2] = 12.1;
				arr1[3] = 13.1;
				arr1[4] = 14.1;
				arr1[5] = 15.1;
				arr1[6] = 16.1;
				arr1[7] = 17.1;
				arr1[8] = 18.1;
				arr1[9] = 19.1;

		System.out.println(arr1[6]);
				
		// 배열의 값을 입출력시 for문 사용
		
		System.out.println(" ==== for 사용 ==== ");
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(arr1[i]);
		}
			
		// *** arr.lenght() : 배열의 인덱스 개수를 출력 ***	
		
		System.out.println(arr1.length); 
		
		System.out.println(" for, .lenghth 사용하여 출력");
		for ( int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]); 
		}
		
		// for를 활용 하여 각 인덱스에 값을 할당
		
		int arr2 [ ] = new int[100];
		
		for ( int i = 0, j = 1 ; i < arr2.length ; i++) 			// 루프 돌 때 마다 초기화 
		{
			arr2[i] = j;
			j++;}
			
		// for문을 통한 출력 	
		
		for (int i = 0 ; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		
		
			
		}
		
		
	}
}

