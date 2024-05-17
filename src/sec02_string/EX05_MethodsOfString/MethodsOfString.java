package sec02_string.EX05_MethodsOfString;

import java.util.Arrays;

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
		System.out.println(str1.lastIndexOf('a', 8));
		System.out.println(str1.indexOf("Java")); // 문자열 단위로 검색시에는 해당 문자열의 가장 첫 인덱스를 출력
		System.out.println(str1.lastIndexOf("Java")); // 뒤로 검색해도 마찬가지로 해당 문자열의 가장 첫 인덱스를 출력함
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Bye")); // Bye가 없으므로 -1 출력
		System.out.println(str2.lastIndexOf("고맙습니다")); // 고맙습니다가 없으므로 -1 출력
		System.out.println();
		
		/*문자열 변환 및 연결*/ System.out.println("문자열 변환 및 연결");
		System.out.println();
		
		/*@String.valueOf(기본자료형)" 기본자료형 -> 문자열 변환*/
		System.out.println("@String.valueOf(기본자료형)\" 기본자료형 -> 문자열 변환");
		
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		/*@concat(): 문자열 연결*/ 	System.out.println("@concat(): 문자열 연결");
		
		String str5a = str3.concat(str4);
		String str5b = str3 + str4;
		System.out.println(str5a);
		System.out.println(str5b);
		System.out.println(str5a == str5b); // concat은 항상 힙 메모리 영역에서 새로운 객체를 생성하므로 false
		System.out.println();
		
		/*String.valueOf() + concat()*/	System.out.println("String.valueOf() + concat()");
		
		String str6 = "안녕" + 3;
		String str7 = "안녕".concat(String.valueOf(3));
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		
		/* concat 메서드와 '+' 연산의 차이
		   
		   결과가 같다는 이유로, 일견 concat 메서드가 비효율적으로 보이기도 함. 상대적으로 간단하게 작성 가능하기도 하니 안쓸 이유가 없지만
		   추후에 코드의 효율성을 고려한다면 + 연산보다 concat 메서드나 여타 그와 비슷한 메서드를 사용하는 것이 중요함. 아래 링크에서 그
		   이유를 잘 설명해 놓았는데, 현재 학습 과정에서 모든 이유를 알 순 없으니 일단 concat 메서드가 더욱 효율적이라고 상기해 둠이 좋을 것.
		   
		   https://dev.to/composite/string-2l5a
		 
		 */
		
		/*문자열 byte[] 또는 char[]로 변환*/	System.out.println("문자열 byte[] 또는 char[]로 변환");
		System.out.println();
		
		/*@getBytes(): 문자열 -> byte[] 변환*/	System.out.println("@getBytes(): 문자열 -> byte[] 변환");
		
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		/*@toCharArray(): 문자열 -> char[] 변환*/	System.out.println("@toCharArray(): 문자열 -> char[] 변환");
		
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}
	
}
