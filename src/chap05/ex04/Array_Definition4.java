package chap05.ex04;

public class Array_Definition4 {

	public static void main(String[] args) {
		/*
		 * 배열의 선언 방법 
		 */

		// 1. 배열 변수 선언, 동시에 배열의 크기도 지정
		
			int[] arr1 = new int[3]; // 선언과 동시에 인덱스 크기 지정 
			
			int[] arr2;
			arr2 =new int [3]; 		// 인덱스 크기 나중에
			
		// 2. 대괄호 위치 변경 가능 
			
			int arr3[] = new int [3]; 
			
			int[] arr4;
			arr4 =new int [3];
			
		// 3. 선언과 동시에 값 할당 
			
			int[] arr5 = new int[] {10, 20, 30, 40, 50};
							//	 ↑ 대괄호에 인덱스 크기 지정 ""금지""
			
			System.out.println(arr5[0]);
			System.out.println(arr5[1]);
			System.out.println(arr5[2]);
			System.out.println(arr5[3]);
			System.out.println(arr5[4]);
			
			System.out.println(arr5.length);
			
			System.out.println("========================================");
			
			int[] arr6; 											// 배열 변수 선언
			arr6 = new int[] {100, 200, 300, 400, 500, 600, 700};	// 값은 나중에 할당
			
			System.out.println(arr6[0]);
			System.out.println(arr6[1]);
			System.out.println(arr6[2]);
			System.out.println(arr6[3]);
			System.out.println(arr6[4]);
			System.out.println(arr6[5]);
			System.out.println(arr6[6]);
			
			System.out.println(arr6.length);
			
			System.out.println("========================================");
			
		// 4. new int 생략
			int[] arr7 = {11, 22, 33, 44, 55};
			
			System.out.println(arr7[0]);
			System.out.println(arr7[1]);
			System.out.println(arr7[2]);
			System.out.println(arr7[3]);
			System.out.println(arr7[4]);
			
			// 주의 : 선언과 할당을 분리시 오류 발생
				int[] arr8;
//				arr8 = {33, 33 ,44 ,55};  <- 오류 발생
				
			System.out.println("========================================");
			
			String[] arr9 = {"아버님", "어머님", "형제", "동생"};
			
			for ( int i = 0 ; i < arr9.length ; i++) {
				System.out.println(arr9[i]);
			}
			
		// 배열의 값 수정
			arr9[0] = "123";
			arr9[1] = "456";
			arr9[2] = "789";
			arr9[3] = "101112";
			
			for ( int i = 0 ; i < arr9.length ; i++) {
				System.out.println(arr9[i]);
			}
			
			
                                  
	}                               

}
