package sec02_string.EX03_SharingStringObject;

public class SharingStringObject {

	public static void main(String[]args) {
		
	/* 5.2.2 String 클래스의 2가지 특징
	   
	   특징2) 리터럴을 바로 입력한 데이터는 문자열이 같을 때 하나의 객체를 공유
	   
	   두 번째 방법인 문자열 리터럴만 입력해 String 객체를 생성하면 하나의 문자열을 여러 객체가 공유할 수 있음. 이는 다른 클래스에는 없는
	   특징으로, 특정 문자열의 객체를 여러 개 만들어 사용할 때 메모리 효율성을 증가시키기 위한 것임. 다음처럼 4개의 String 객체를 생성해보자.
	   
	   String str1 = new String("안녕"); // new로 만들어진 객체는 힙 메모리에서 타 변수와 객체를 공유하는 기능 자체가 없음.
	   String str2 = "안녕"; // 고로 같은 문자열 "안녕"을 리터럴로 입력하더라도, 공유가 불가능하므로 두 번째 "안녕"이 힙메모리에 생겨남.
	   String str3 = "안녕"; // 리터럴로 만든 객체는 공유가 가능하므로, str2 변수에 대입한 위치값에 있는 두 번째 "안녕"을 공유함.
	   String str4 = new String("안녕"); // new는 무조건 새로 생성, 공유 불가이기 때문에 세 번째 "안녕"이 힙 메모리에 생성.
	 	
	 */
		
	   /*- 실습 - 문자열 리터럴에 따른 생성 문자열 객체의 공유*/
	   System.out.println("- 실습 - 문자열 리터럴에 따른 생성 문자열 객체의 공유");
	   
	   String str1 = new String("안녕"); // 공유 기능 없는 새 객체 "안녕"을 생성함.
	   String str2 = "안녕"; // 공유 가능한 새 객체 "안녕"을 생성함.
	   String str3 = "안녕"; // 공유 가능한 기존 객체 "안녕"을 공유함.
	   String str4 = new String("안녕"); // 공유 기능 없는 새 객체 "안녕"을 생성함.
	   
	   /*스택 메모리 값 비교(==)*/ System.out.println("스택 메모리 값 비교(==)");
	   
	   System.out.println(str1 == str2); // str1이 단독 사용 객체이므로, 서로 객체를 공유하지 않음.
	   System.out.println(str2 == str3); // str2와 str3이 공유 가능한 객체를 함께 쓰므로 일치함.
	   System.out.println(str3 == str4); // str4이 단독 사용 객체이므로, 서로 객체를 공유하지 않음.
	   System.out.println(str4 == str1); // str1과 srt4가 단독 사용 객체이므로, 서로 객체를 공유하지 않음.
		
	}
	
}
