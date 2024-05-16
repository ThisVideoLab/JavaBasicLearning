package sec02_string.EX05_MethodsOfString;

public class MethodsOfString {

	public static void main(String[]args) {
		
		/* 5.2.4 String 클래스의 주요 메서드
		 
		   String 클래스는 문자열의 길이, 문자열 검색, 문자열 변환 및 연결, 문자열 수정이나 내용 비교 등 매우 풍부한 메서드를 제공함.
		   이하에서는 대표적인 주요 메서드들로 명칭과 속성을 알아보도록 하자.
		   
		   메서드: length()
		   용도: 문자열의 길이 출력
		   리턴타입: int
		   설명: a.length() 와 같이 씀. 문자열의 전체 길이를 출력하는데 사용
		   
		   메서드: charAt(int index)
		   용도: 문자열 검색
		   리턴타입: char
		   설명: int 타입의 인덱스 숫자를 넣으면, 문자열에서 해당 n 번째 위치에 있는 문자를 출력함
		   
		   메서드: indexOf()
		   용도: 문자열 검색
		   리턴타입: int
		   설명: 문자열에서 특정 문자나 특정 문자열을 앞에서부터 찾아 위치값을 알아냄
		   
		   메서드: lastIndexOf()
		   용도: 문자열 검색
		   리턴타입: int
		   설명: 문자열에서 특정 문자나 특정 문자열을 뒤에서부터 찾아 위치값을 알아냄, 뒤에서부터 찾는 것이 포인트
		   
		   메서드: String.valueOf()
		   용도: 문자열 변환 및 검색
		   리턴타입: float
		   설명: 기본 자료형을 문자열로 변환하기 위한 정적 메서드
		   
		   메서드: concat(String str)
		   용도: 문자열 변환 및 검색
		   리턴타입: double
		   설명: 2개의 문자열 연결 (String 객체의 + 연산과 동일함)
		   
		   메서드: getBytes()
		   용도: 문자열 배열 변환
		   리턴타입: byte[]
		   설명: 문자열을 byte[]로 변환(변환할 때 문자 셋(charest) 지정가능). 자바 입출력 과정에서 주로 사용함.
		   
		   메서드: toCharArray()
		   용도: 문자열 배열 변환
		   리턴타입: char[]
		   설명: 문자열을 char[]로 변환함. 자바 입출력 과정에서 주로 사용함.
		   
		 */
		
		/*- 실습 - 클래스의 주요 메서드1*/ System.out.println("- 실습 - 클래스의 주요 메서드1");
		
		/*문자열의 길이*/ System.out.println("문자열의 길이");
		
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		/*문자열 검색*/ System.out.println("문자열 검색");
		/*@charAt()*/ System.out.println("@charAt()");
		
		System.out.println(str1.charAt(0)); // 인덱스는 0부터 시작함
		System.out.println(str2.charAt(1)); // 한글, 영어 등 언어에 상관 없이 한 문자당 1개의 크기를 가짐.
		System.out.println();
		
		/*@indexOf(), lastIndexOf*/ System.out.println("@indexOf(), lastIndexOf");
		
		System.out.println(str1.indexOf('a')); // 앞에서부터 첫번째 'a'가 위치한 인덱스 숫자를 출력함
		System.out.println(str1.lastIndexOf('a')); // 뒤에서부터 첫번째 'a'가 위치한 인덱스 숫자를 출력함
		System.out.println(str1.indexOf('a', 8));  // 
		
		
		
		
	}
	
}
