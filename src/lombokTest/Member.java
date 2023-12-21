package lombokTest;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Getter
@Setter
@Data

public class Member {

	/*
	 * lombok test
	 DTO(VO) : 실제 테이블의 컬럼에 매핑되는 객체 
		 		필드의 값을 전달해주는 전달자
		 		DB의 값을 임시로 저장해서 client에게 전달 
		 		client의 값을 임시로 저장해서 DAO에게 전달

	 
	 DAO : DataBase와 직접 연결된 자바 객체 - SQL Query 작성
	 			client -> DTO -> DAO -> DataBase
	 
	 LOMBOK 에서 사용되는 Annotation		
	 	@Getter : 필드명에 대한 Getter 메서드가 자동으로 생성됨 - 필드의 정보 출력
	 	@Setter : 필드명에 대한 Setter 메서드가 자동으로 생성됨 - 필드의 값 입력
	 	@toString :  객체 출력시 필드의 내용 출력
	 	@NoArgsConstructor : 기본 생성자 제작
	 	@AllArgsConstructor : 모든 필드의 인풋 값 받는 생성자
	 	
	 	@Data : 위의 Annotation 전부 포함
	*/
	
	
	
	
	private int idx;
	private String name;
	private String email;
	private String phone;
	private double weight;
	private int age;
	
	
	
	
}
