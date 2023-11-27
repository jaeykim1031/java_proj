package lab.chap05;

public class Array_DefinitionPrac {
	public static void main(String[] args) {
		// 배열 변수명 : arr 
//				index 개수 : 1000개
//				배열의 각 index에 3의 배수 
//				배열의 각 index의 내용 출력
		
		int[] arr = new int[1000]; 
		
		System.out.println(arr.length); // 인덱스의 개수 : 0 ~ 999
		
		for (int i = 0, j = 1 ; i < arr.length ; i++) { // i = 인덱스 번호, 0 ~ 999, 1씩 증가
				arr[i] = j*3;
				j++;
			
			System.out.println(arr[i]); // 바로 출력해도 ok

		}
		
//		for (int i = 0 ; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		
//		}	
	}
}
