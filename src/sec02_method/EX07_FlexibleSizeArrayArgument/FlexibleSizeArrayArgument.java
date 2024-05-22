package sec02_method.EX07_FlexibleSizeArrayArgument;

public class FlexibleSizeArrayArgument {

	public static void main(String[]args) {
		
		/* 7.2.5 가변 길이 배열 입력매개변수 메서드
		   
		   앞에서 메서드 시그니처는 입력매개변수의 개수 또는 입력매개변수의 자료형에 따라 구분된다고 언급함. 만일 어떤 메서드가 입력매개변수로
		   0~10개 사이의 int 자료형 값을 받는다고 가정하자. 정확히 몇개의 입력이 들어올지 모르므로, 0~10개에 해당하는 11개의 메서드를 모두 
		   오버로딩해야 함. 만일 전달되는 입력매개변수의 개수 범위가 더 크다면 더 많은 메서드를 오버로딩해야하는 문제까지 발생함. 이를 간단히 해결할
		   방법은 가변 길이 배열 입랙매개변수임. 개수가 정해지지 않은 가변 길이의 입력을 받는 입력매개변수로 입력된 값들은 배열로 저장됨, 그리고
		   이 배열의 크기는 함수가 호출될 때 전달된 입력값의 개수로 정해짐. 배열 자체가 1개의 자료형만 묶어 저장할 수 있으므로, 입력되는 모든 값은
		   당연히 같은 자료형이어야 함. 가변 길이 배열 입력매개변수의 문법은 다음과 같음.
		   
		   가변 길이 배열 입력매개변수
		   
		   리턴 타입 메서드명 (자료형... 참조 변수명){
		   	  // 메서드 내용
		   }
		   
		   상기 예시에서 한가지 독특한 점이 있는데, 그것은 바로 자료형 다음에 말 줄임표(...)가 있다는 것. 이는 가변 길이 배열 입력매개변수의
		   가장 중요한 포인트임. 먼저 다음 예시를 통해서 살펴보자. 
		   
		 */
		
		// 가변길이 int 배열 입력매개변수
		
		method1(1, 2);  // 입력매개변수 길이: 2
		method1(1, 2, 3);  // 입력매개변수 길이: 3
		method1();  // 입력매개변수 길이: 0
		
		// 가변 길이 String 배열 입력매개변수
		
		method2("안녕", "방가"); // 입력매개변수 길이: 2
		method2("땡큐", "베리", "감사"); // 입력매개변수 길이: 3
		method2(); // 입력매개변수 길이: 0
		
		/*- 실습 - 메서드의 가변 길이 배열 입력매개변수*/ System.out.println("- 실습 - 메서드의 가변 길이 배열 입력매개변수");
		
		method1(4, 5);  // 입력매개변수 길이: 2
		method1(4, 5, 6);  // 입력매개변수 길이: 3
		method1();  // 입력매개변수 길이: 0
		
		// 가변 길이 String 배열 입력매개변수
		
		method2("hi", "hello"); // 입력매개변수 길이: 2
		method2("thanks", "thank you", "nice of you"); // 입력매개변수 길이: 3
		method2(); // 입력매개변수 길이: 0
		
		
	}
	public static void method1(Integer ... values) {
		System.out.println("int 자료형 입력매개변수 길이 : " + values.length);
		for(int i = 0; i < values.length; i++) {  // 실행문이 1개일 때 for 문의 중괄호 생략 가능, 그러나 추천하진 않는다고 함. 교재가 시킴
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	public static void method2(String ... values) {
		System.out.println("String 자료형 입력매개변수 길이 : " + values.length);
		for(int i = 0; i < values.length; i++) // 실행문이 1개일 때 for 문의 중괄호 생략 가능, 그러나 추천하진 않는다고 함. 교재가 시킴
			System.out.print(values[i] + " ");
		System.out.println();
		System.out.println();
	}
	
	
}
