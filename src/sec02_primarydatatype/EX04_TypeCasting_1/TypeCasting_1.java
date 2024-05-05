package sec02_primarydatatype.EX04_TypeCasting_1;

public class TypeCasting_1 {

	public static void main(String[]args) {
		
		/* 2.4 기본 자료형 간의 타입 변환
		   
		   boolean을 제외한 기본 자료형 7개는 자료형을 서로 변환 할 수 있음. 이를 타입 변환type casting이라고 함.
		   선술한듯이 자바는 항상 대입 연산자를 중심으로 왼쪽과 오른쪽 자료형을 일치시켜야 하므로 타입 변환이 필요하기도 함.
		   다만 타입 변환을 수행할 때 저장 값의 범위나 종류가 달라질 수 있으니 주의 할 것.
	  
	    */
		
		// 캐스팅 방법 1: 변수 값에 자료형을 추가하기
		
			//int value1 = 5.3; 자료형보다 변수값의 범위가 크기에 오류 발생
			int value1 = (int)5.3; // 앞에 캐스팅하려는 자료형인 (int)를 추가해줘서 변환에 성공.
			                       // 그러나 소수점이 사라지고 변수 값이 5로 저장되어 값의 변형 발생.
			
		System.out.println(value1); // 소수점이 삭제되어 5로 표기됨
			
	    // 캐스팅 방법 2: L(l), 변수 값에 F (f) 리터럴 추가
		
		float value2 = 10F; // long형으로 타입 변환
		long value3 = 10L; // float형으로 타입 변환
		
		System.out.println(value2);
		System.out.println(value3);
		
		
	}
	
}
