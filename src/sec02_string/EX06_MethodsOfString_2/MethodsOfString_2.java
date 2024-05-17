package sec02_string.EX06_MethodsOfString_2;

import java.util.Arrays;

public class MethodsOfString_2 {

	public static void main(String[]args) {
		
		/* 5.2.4 String 클래스의 주요 메서드2
		 
		   메서드: toLowerCase()
		   용도: 문자열 수정
		   리턴타입: String
		   설명: 영문 문자 모두를 소문자로 변환
		   
		   메서드: toUpperCase()
		   용도: 문자열 수정
		   리턴타입: String
		   설명: 영문 문자 모두를 대문자로 변환
		   
		   메서드: replace(char oldChar, char newChar)
		   용도: 문자열 수정
		   리턴타입: String
		   설명: oldChar 문자열을 newChar 문자열로 대체한 문자열 생성
		   
		   메서드: substring(int beginIndex), substring(int beginIndex, int endingIndex)
		   용도: 문자열 수정
		   리턴타입: String
		   설명: beginIndex부터 끝까지 문자열 생성, 또는 beginIndex부터 endIndex-1 위치까지 문자열 생성
		   
		   메서드: spilt(String regex), spilt(String regex, int limit) 
		   용도: 문자열 수정
		   리턴타입: String
		   설명: regular expression 레귤레스 또는 레귤러 익스프레션이라고 발음함. regex를 기준으로 문자열을 분할한 문자열 배열을
		        생성(regex 구분 기호는 | (수직막대기호)로 여러 개 사용이 가능함. limit는 분할의 최대 개수
		   
		   메서드: trim()
		   용도: 문자열 수정
		   리턴타입: String
		   설명: 문자열 앞 뒤의 공백 제거
		   
		   메서드: equals()
		   용도: 문자열 내용 비교
		   리턴타입: boolean
		   설명: 문자열의 실제 내용 비교, 이는 메모리의 번지수를 비교하는 '=='과 다르게 실제 내용을 비교하는 것.
		   
		   메서드: equalsIgnoreCase(String anotherString)
		   용도: 문자열 내용 비교
		   리턴타입: boolean
		   설명: 대소문자 구분 없이 문자열의 실제 내용을 비교
		   
		   비교의 엄격함을 기준으로 한다면 == > equals() > equalsIgnoreCase()
		 
		 */
		
		/*- 실습 - 클래스의 주요 메서드2*/ System.out.println("- 실습 - 클래스의 주요 메서드2");
		System.out.println();
		
		/*문자열 수정*/ System.out.println("문자열 수정");
		System.out.println();
		
		/*@toLowerCase(), toUpperCase()*/ System.out.println("@toLowerCase(), toUpperCase()");
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println();
		
		/*@replace()*/ System.out.println("@replace()");
		
		System.out.println(str1.replace("Stduy.", "공부"));
		System.out.println();
		
		/*@replace()*/ System.out.println("@replace()");
		
		System.out.println(str1.substring(0,6)); // 시작 인덱스 0부터 시작해, 종료 인덱스보다 작은 은 위치의 인덱스까지 출력
		System.out.println();
		
		/*@split()*/ System.out.println("@split()");
		
		String[] strArray = "abc/def-ghi jkl".split("/|-| "); // 지정한 단어를 기준으로 문자열을 분절해 배열로 반환
		
		System.out.println(Arrays.toString(strArray)); // 
		System.out.println();
		
		/*@trim()*/ System.out.println("@trim()");
		
		System.out.println("  abc   ".trim());
		System.out.println();
		
		/*문자열의 내용 비교*/ System.out.println("문자열의 내용 비교");
		System.out.println();
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		/*@stack 메모리 비교(==): 위치(번지) 비교*/ System.out.println("@stack 메모리 비교(==): 위치(번지) 비교");
		
		System.out.println(str2 == str3);
		System.out.println(str2 == str4);
		System.out.println(str3 == str4);
		System.out.println();
		
		/*equals(), equalsIgnoreCase()*/ System.out.println("equals(), equalsIgnoreCase()");
		
		System.out.println(str2.equals(str3)); // true
		System.out.println(str2.equals(str4)); // false
		System.out.println(str3.equals(str4)); // 문자는 같아도 대소문자가 다르므로 false 출력
		System.out.println(str3.equalsIgnoreCase(str4)); // 대소문자를 무시하고 비교하므로 true 출력
		
	}
	
}
