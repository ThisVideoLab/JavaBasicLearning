package sec01_datatype.EX02_NamingVariableAndConstant;
//2.2 이름 짓기
public class NamingVariableAndConstant {

	public static void main(String[]args) {
		
		/* 이름 지을 때 지켜야 하는 필수 사항
		   
		   자바 문법을 구성하는 가장 대표적인 요소로는 변수, 상수, 매서드가 있음. 이들 구성 요소의 이름을 지을 때
		   꼭 지켜야하는 4가지 사항은 다음과 같음. 이를 준수하지 않으면 문법 오류가 발생함.
		   
		   영문 대소 문자와 한글을 사용할 수 있음.
		   특수문자는 밑줄(_)과 달러($) 표기만 사용 가능함.
		   첫번째 글자에 아라비아 숫자 사용 불가능. 그외는 모두 가능.
		   자바에서 사용하는 예약어 사용 불가능.
		 
		   이름 지을 때 지키면 좋은 권장 사항
		   
		   변수명은 영문 소문자로, 영문 단어 2개 이상 결합할 때는 사로운 단어의 첫글자를 대문자로(camel 낙타 표기법)
		   상수명은 모두 대문자로, 다만 단어 여러개를 결합할 시에는 각각 밑줄(_)을 사용해서 분리
		   메서드명은 변수명과 같은 방식으로 짓는 것을 권장하나, 소괄호와 중괄호에 주의할 것
		   	  
		 */
		
		// 변수
		
		boolean aBcD;
		byte 가나다;
		short _abcd;
		char $ab_cd;
		// int 3abcvd; // 선언할 때 숫자는 이름 맨 앞에 올 수 없음.
		
		long abcd3;
		//float int; // 자바 예약어는 사용 불가능.
		double main;
		// int my Works; // 스페이스, 특수 키는 사용 불가능.
		String myClassName;
		int ABC; // 전부 대문자로 작성은 권장하지 않음
		
		// 상수는 대문자 사용을 권장함.
		final double PI;
		final int MY_DATA;
		final float myData; // 소문자 사용 (권장하지 않음_
			
	}
}
