package sec02_string.EX04_PlusOperationOfString;

public class PlusOperationOfString {

	public static void main(String[]args) {
		
		/* 5.2.3 객체의 '+' 연산
		   
		   String 객체는 + 연산을 이용해 문자열을 연결할 수 있음. 당연히 '더하기'의 의미가 아니라 '연결하기'의 의미임. String 객체의
		   + 연산은 크게 2가지 형태가 있음. 첫 번째는 '문자열 + 문자열'의 형태인데, 이때는 그대로 문자열을 연결한 결과값이 출력됨. 두 번째는
		   '문자열 + 기본 자료형' 또는 "기본 자료형 + 문자열'일 때인데, 이때는 기본 자료형이 먼저 문자열로 변환되고, 이후 '문자열 + 문자열'
		   일때인데, 이때는 기본 자료형이 먼저 문자열로 변환되고, 이후 '문자열 + 문자열'의 형태로 연결된 값이 리턴됨.
		   
		 */
		
		/*유형1) '문자열' + '문자열' 연산*/ System.out.println("유형1) '문자열' + '문자열' 연산");
		
		String str1 = "안녕" + "하세요" + "!"; // 추가하는 과정에서 "안녕하세요"까지 생성됨.
		System.out.println(str1); // 완성된 str1을 출력하는 과정까지 총 5개의 객체가 생성됨
		
		String str2 = "반갑"; 
		str2 += "습니다"; 
		str2 += "!";
		System.out.println(str2); // 반갑습니다!
		System.out.println();
		
		/* "안녕" + "하세요" + "!"의 결과가 모두 연결된 "안녕하세요!"가 나오는 것을 예측하는 일은 어렵지 않음. 하지만 메모리에서는
		   이 짧은 명령의 영향으로 안녕하세요!의 객체를 생성하는 과정에서 총 5개의 객체가 생성되었음을 알 수 있음. 우리는 이미 String 객체의
		   내용을 변경할 수 없다는 것을 배웠음. 따라서 이렇게 문자열을 추가해 나가면, 그 연산 과정에서 생성되는 문자열들도 생겨날 수 있음.
		   다만 이 과정에서만 쓰이고 더이상 쓰임이 없는 문자열은 가비지 컬렉터에 의해 정리될 가능성이 있음.
		 
		 유형2) '문자열 + 기본 자료형' 또는 '기본 자료형 + 문자열' 연산
		 
		 모든 연산은 동일한 자료형끼리만 가능함. 따라서 기본 자료형과 문자열을 연산하려면 먼저 기본 자료형을 문자열로 바꾼 뒤, 이어서 문자열끼리
		 연산을 수행함. 다음 예시를 통해 그러한 순서를 잘 살펴볼 것.
		 
		 System.out.println(1 + "안녕"); // 1안녕
		 System.out.println(1 + "안녕" + 2); // 1안녕2
		 System.out.println("안녕" + 1 + 2); // 안녕12
		 System.out.println(1 + 2 + "안녕"); // 3안녕 // 문자열과 만나기 전에 기본 자료형 형태로 연산이 되어 3이 됨
		 
		 이러한 순서에 따른 결과 값 변화를 잘 인지해서 자료형이 여러개 섞인 경우에 맞춰 이를 잘 확인해야 원하는대로 결과를 도출 할 수 있음.
		 
		 */
		
		/*- 실습 - 문자열의 '+' 연산자*/ System.out.println("- 실습 - 문자열의 '+' 연산자");
		
		/*문자열 + 문자열*/ System.out.println("문자열 + 문자열");
		
		String exstr1 = "안녕" + "하세요" + "!";
		System.out.println(exstr1);
		
		String exstr2 = "반갑";
		exstr2 += "습니다";
		exstr2 += "!";
		System.out.println(exstr2);
		System.out.println();
		
		/*문자열 + 기본 자료형 또는 기본 자료형 + 문자열*/ System.out.println("문자열 + 기본 자료형 또는 기본 자료형 + 문자열");
		
		String exstr3 = "안녕" + 1; // 안녕1
		String exstr4 = 1+ 2 + "안녕"; // 3안녕
		String exstr5 = 1+ String.valueOf(2) + "안녕"; // 12안녕 // 숫자를 문자열로 변환하는 코드
		
		System.out.println(exstr3);
		System.out.println(exstr4);
		System.out.println(exstr5);
		System.out.println();
		
	}
	
}

